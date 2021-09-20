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
import org.springframework.web.server.ResponseStatusException;

import com.DTO.AnaliseDTO;
import com.Model.Analise;
import com.Model.Cliente;
import com.Model.Pedidos;
import com.Repository.AnaliseRepository;
import com.Repository.ClienteRepository;
import com.Repository.InadimplenciasRepository;
import com.Repository.MetricaRepository;
import com.Repository.PedidosRepository;

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
	private final PedidosRepository pedidosRepository;
	private final MetricaRepository metricaRepository;
	private final InadimplenciasRepository inadimplenciasRepository;


	@Autowired
	public AnaliseController(MetricaRepository metricaRepository,InadimplenciasRepository inadimplenciasRepository, AnaliseRepository repository,ClienteRepository clienteRepository, PedidosRepository pedidosRepository) {
		this.repository = repository;
		this.clienteRepository = clienteRepository;
		this.pedidosRepository = pedidosRepository;
		this.inadimplenciasRepository = inadimplenciasRepository;
		this.metricaRepository = metricaRepository;
	}

	@PostMapping(value="/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Analise save(@RequestBody AnaliseDTO dto) {
		Analise analise = new Analise();
		Integer idCliente = dto.getCliente();
		Cliente cliente= clienteRepository.findById(idCliente)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente inexistente"));
		analise.setCliente(cliente);
		Integer idPedido = dto.getPedido();
		Pedidos pedidos = pedidosRepository.findById(idPedido)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Pedido inesistente"));
		analise.setPedido(pedidos);
		analise.setAnaliseCpf(realizaAnaliseDoCpf(idCliente)); 
		analise.setanalisePendencias(realizaAnalisePendencias(idCliente)); 
		analise.setAnaliseRenda(realizaAnaliseRenda(idCliente)); 
		analise.setAnalisePerc(verificaPercentual(idCliente,idPedido)); 
		analise.setConcessao(dto.getConcessao());
		LocalDate data = LocalDate.parse(dto.getDataAnalise(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		analise.setDataAnalise(data);
		analise.setSituacao(dto.getSituacao());
		return repository.save(analise);
	}

	@GetMapping(value="/{id}")
	public ResponseEntity<Object> busca(@PathVariable Integer id){
		return ResponseEntity.ok(repository.findById(id));
	}
	@GetMapping(value="/lista")
	public List<Analise> obterTodos(){
		return repository.findAll();
	}
	@PutMapping (value="/replace/{id}")
	public Analise replace (@PathVariable Integer id, @RequestBody Analise analise) {
		return repository.save(analise);
	}	

	private Integer realizaAnaliseDoCpf(Integer idCliente) {

		Double vermelho = metricaRepository.getClassificacaoCpfVermelho();
		Double verde = metricaRepository.getClassificacaoCpfVerde();
		Double amarelo = metricaRepository.getClassificacaoCpfAmarelo();

		Integer qtdPedido =	pedidosRepository.findByPedidoCliente(idCliente);
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


	private Integer realizaAnalisePendencias(Integer idCliente) {

		Integer qtdPendencias = inadimplenciasRepository.findByCliente(idCliente);
		Double azul = metricaRepository.getPendenciasAzul();
		Integer aux = azul.intValue();

		if(qtdPendencias == aux) {
			return 100;
		}

		return 0;
	}

	private Integer realizaAnaliseRenda(Integer idCliente) {

		Double rendaCliente = clienteRepository.getRenda(idCliente);
		Double rendaAzul = metricaRepository.rendaAzul();
		Double rendaAmarelo = metricaRepository.rendaAmarelo();
		Double rendaVerde= metricaRepository.rendaVerde();
		Double rendaVermelho = metricaRepository.rendaVermelho();

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

	private Integer verificaPercentual(Integer idCliente, Integer idPedido) {
		Double valorPedido = pedidosRepository.getValorPedido(idPedido);
		Integer parcelaPedido = pedidosRepository.getParcelaPedido(idPedido);
		Double valorParcela = valorPedido/parcelaPedido;

		Double rendaCliente = clienteRepository.getRenda(idCliente);
		Double perc = metricaRepository.getPercentual();
		perc = perc/100;
		Double percentualRendaClientePedido = rendaCliente*perc; 

		Integer valor = percentualRendaClientePedido.compareTo(valorParcela);
		if(valor > 0) {
			return 100;
		}else {
			return 0;
		}
	}

}
