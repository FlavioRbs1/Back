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
import com.Repository.PedidosRepository;
import com.util.BigDecimalConverter;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/analise")
@NoArgsConstructor
@RequiredArgsConstructor
public class AnaliseController {
	
	private final AnaliseRepository repository;
	private final ClienteRepository clienteRepository;
	private final PedidosRepository pedidosRepository;
	BigDecimalConverter bigDecimalConverter;
	
	@Autowired
	public AnaliseController(AnaliseRepository repository,ClienteRepository clienteRepository, PedidosRepository pedidosRepository) {
		this.repository = repository;
		this.clienteRepository = clienteRepository;
		this.pedidosRepository = pedidosRepository;
	}

	@PostMapping(value="/save")
	@ResponseStatus(HttpStatus.CREATED)
	public Analise save(@RequestBody AnaliseDTO dto) {
		Analise analise = new Analise();
		
		analise.setAnaliseCpf(dto.getAnaliseCpf());
		analise.setAnaliseEstCivil(dto.getAnaliseEstCivil());
		analise.setAnaliseIdade(dto.getAnaliseIdade());
		analise.setAnalisePerc(dto.getAnalisePerc());
		analise.setAnaliseProfissao(dto.getAnaliseProfissao());
		analise.setAnaliseRenda(dto.getAnaliseRenda());
		analise.setConcessao(dto.getConcessao());
		LocalDate data = LocalDate.parse(dto.getDataAnalise(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		analise.setDataAnalise(data);
		analise.setSituacao(dto.getSituacao());
		Integer idCliente = dto.getCliente();
		Cliente cliente= clienteRepository.findById(idCliente)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Cliente inexistente"));
		analise.setCliente(cliente);

		Integer idPedido = dto.getPedido();
		Pedidos pedidos = pedidosRepository.findById(idPedido)
				.orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Pedido inesistennte"));
		analise.setPedido(pedidos);
		
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
	@PutMapping (value="/analise/{id}")
	public Analise replace (@PathVariable Integer id, @RequestBody Analise analise) {
		return repository.save(analise);
	}	
	
}
