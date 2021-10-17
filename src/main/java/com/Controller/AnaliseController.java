package com.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.AnaliseDTO;
import com.Model.Analise;
import com.Model.Cliente;
import com.Model.Pedidos;
import com.Repository.AnaliseRepository;
import com.Repository.ClienteRepository;
import com.Repository.InadimplenciasRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/analise")
@NoArgsConstructor
@RequiredArgsConstructor
public class AnaliseController {

	Analise a = new Analise();
	private final AnaliseRepository repository;
	private final ClienteRepository clienteRepository;
	private final PedidosController pedidosController;
	private final MetricaController metricaController;
	private final InadimplenciasRepository inadimplenciasRepository;


	@Autowired
	public AnaliseController(
							AnaliseRepository repository,
							ClienteRepository clienteRepository , 
							PedidosController pedidosController,
							InadimplenciasRepository inadimplenciasRepository, 
							MetricaController metricaController) {
		this.repository = repository;
		this.clienteRepository = clienteRepository ;
		this.pedidosController = pedidosController;
		this.inadimplenciasRepository = inadimplenciasRepository;
		this.metricaController = metricaController;
	}

	@PostMapping(value="/postanalisecp")
	@ResponseStatus(HttpStatus.CREATED)
	public Analise save(@RequestBody AnaliseDTO dto) {
		Analise analise = new Analise();
		Integer idCliente = dto.getIdCliente();
		Cliente c = clienteRepository.buscaId(idCliente);
		System.out.println(idCliente);
		analise.setIdCliente(c);
		Integer idPedido = dto.getIdPedido();
		Pedidos p = pedidosController.buscaPedido(idPedido);
		analise.setIdPedido(p);
		analise.setAnaliseCpf(realizaAnaliseDoCpf(idCliente)); 
		analise.setAnalisePendencias(realizaAnalisePendencias(idCliente)); 
		analise.setAnaliseRenda(realizaAnaliseRenda(idCliente)); 
		analise.setAnalisePerc(verificaPercentual(idCliente,idPedido)); 
		analise.setConcessao(dto.getConcessao());
		LocalDate data = LocalDate.now();
		analise.setDataAnalise(data);
		analise.setScore(geraScore(analise.getAnaliseCpf(),analise.getAnalisePendencias(),analise.getAnaliseRenda(),analise.getAnalisePerc()));
		analise.setClassificacao(classificaCliente(analise.getScore()));
		analise.setSituacao(geraSituacao(analise.getClassificacao(),idPedido));
		return repository.save(analise);
	}




	
	@PostMapping(value="/postanalisedecliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Analise gerar(@RequestBody AnaliseDTO dto) {
		Analise analise = new Analise();
		Integer idCliente = dto.getIdCliente();
		Cliente c = clienteRepository.buscaId(idCliente);
		System.out.println(idCliente);
		analise.setIdCliente(c);
		analise.setAnaliseCpf(realizaAnaliseDoCpf(idCliente)); 
		analise.setAnalisePendencias(realizaAnalisePendencias(idCliente)); 
		analise.setAnaliseRenda(realizaAnaliseRenda(idCliente)); 
		analise.setAnalisePerc(100); 
		analise.setConcessao(dto.getConcessao());
		LocalDate data = LocalDate.now();
		analise.setDataAnalise(data);
		analise.setScore(geraScore(analise.getAnaliseCpf(),analise.getAnalisePendencias(),analise.getAnaliseRenda(),analise.getAnalisePerc()));
		analise.setClassificacao(classificaCliente(analise.getScore()));
		analise.setSituacao(geraSituacaoSemPedido(analise.getClassificacao()));
		analise.setLimiteDeCredito(geraLimiteDeCredito(analise.getClassificacao()));
		return repository.save(analise);
	}

	
	@GetMapping(value="/{idPedido}/{idCliente}")
	public ResponseEntity<Object> busca(@PathVariable Integer idPedido, Integer idCliente){
		return ResponseEntity.ok(repository.findAnaliseByPedidoCliente(idPedido , idCliente));
	}
	
	@GetMapping(value="/lista")
	public List<Analise> obterTodos(){

		return repository.findAll();
	}
	
	@PutMapping (value="/replace/{id}")
	public Analise replace (@PathVariable Integer id, @RequestBody Analise analise) {
		return repository.save(analise);
	}	

	private Integer realizaAnaliseDoCpf(Integer cliente) {

		Double vermelho = metricaController.buscaClassificacaoCpfVermelho();
		Double verde = metricaController.buscaClassificacaoCpfVerde();
		Double amarelo = metricaController.buscaClassificacaoCpfAmarelo();
		Integer qtdPedido =	pedidosController.buscaPedidoClienteBack(cliente);
		Double qtd = Double.valueOf(qtdPedido);

		if(qtd == vermelho) {
			return 25;
		}else if(qtd == amarelo) {
			return 50;
		}else if(qtd == verde) {
			return 75;
		}
		return 100;
	}

	private Integer realizaAnalisePendencias(Integer cliente) {

		Integer qtdPendencias = inadimplenciasRepository.findByCliente(cliente);
		Double azul = metricaController.buscaPendenciasAzul();
		Integer aux = azul.intValue();

		if(qtdPendencias == aux) {
			return 100;
		}

		return 0;
	}

	private Integer realizaAnaliseRenda(Integer cliente) {

		Double rendaCliente = clienteRepository.getRenda(cliente);
		Double rendaAzul = metricaController.buscaRendaAzul();
		Double rendaAmarelo = metricaController.buscaRendaAmarelo();
		Double rendaVerde= metricaController.buscaRendaVerde();
		Double rendaVermelho = metricaController.buscaRendaVermelho();

		if(rendaCliente <= rendaVermelho) {
			return 0;
		}else if(rendaCliente > rendaVermelho && rendaCliente <= rendaAmarelo) {
			return 25;
		}else if(rendaCliente > rendaAmarelo && rendaCliente <= rendaVerde) {
			return 50;
		}else if(rendaCliente > rendaVerde && rendaCliente <= rendaAzul) {
			return 75;
		}
		return 100;
	}

	private Integer verificaPercentual(Integer cliente, Integer pedido) {
		Double valorPedido = pedidosController.buscaValorPedidoBack(pedido);
		Integer parcelaPedido = pedidosController.buscaParcelaPedidoBack(pedido);
		Double valorParcela = valorPedido/parcelaPedido;

		Double rendaCliente = clienteRepository.getRenda(cliente);
		Double perc = metricaController.buscaPercentual();
		perc = perc/100;
		Double percentualRendaClientePedido = rendaCliente*perc; 

		Integer valor = percentualRendaClientePedido.compareTo(valorParcela);
		if(valor > 0) {
			return 100;
		}else {
			return 0;
		}
	}
	
	private Double geraScore(Integer a, Integer b, Integer c, Integer d) {
		Double score = (double) ((a+b+c+d)/4);
		return score;
	}

	private String classificaCliente(Double score) {
		Double classeVerde = metricaController.buscaClasseVerde();
		Double classeAmarelo = metricaController.buscaClasseAmarelo();
		Double classeVermelho = metricaController.buscaClasseVermelho();
		String cor;
		
		if(score <= classeVermelho) {
			cor = "VERMELHO";
			return cor;
		}else if(score > classeVermelho && score <= classeAmarelo){
			cor = "AMARELO";
			return cor;
		}else if(score > classeAmarelo && score <= classeVerde){
			cor = "VERDE";
		}else {
			cor = "AZUL";
		}
		return cor;						
	}
	
	private String geraSituacao(String classificacao, Integer idPedido) {
		String situacao;
		if(classificacao == "VERMELHO" || classificacao =="AMARELO") {
			situacao = "REPROVADO";
			pedidosController.reprovaPedido(idPedido);
			
		}else {
			situacao = "APROVADO";
			pedidosController.aprovaPedido(idPedido);
		}
		return situacao;
	}

	private String geraSituacaoSemPedido(String classificacao) {
		String situacao;
		if(classificacao =="VERMELHO" || classificacao == "AMARELO") {
			situacao = "REPROVADO";
		}else {
			situacao = "APROVADO";
		}
		return situacao;
	}
	
	private Double geraLimiteDeCredito(String classificacao) {
		
		Double limiteDeCredito = null;
		if(classificacao == "AZUL") {
			limiteDeCredito = metricaController.buscaLimiteAzul();
			return limiteDeCredito;
		}else if(classificacao == "VERDE") {
			limiteDeCredito = metricaController.buscaLimiteVerde();
		}
		return limiteDeCredito;
	}
}
