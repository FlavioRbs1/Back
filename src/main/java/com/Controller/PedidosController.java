package com.Controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Cliente;
import com.Model.Pedidos;
import com.Repository.ClienteRepository;
import com.Repository.PedidosRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/pedido")
public class PedidosController {
	
	@Autowired
	PedidosRepository repository;
	ClienteRepository clienteRepository;
	
	@PostMapping(value = "/save")
	public Pedidos save(@RequestBody Pedidos pedido) {
		return repository.save(pedido);
	}
	@GetMapping(value="/buscapedidocliente/{idCliente}")
	public Integer buscaPedidoCliente(@PathVariable (name="idCliente",required = false) Integer cliente){
		return repository.findByPedidoCliente(cliente);
	}
	@GetMapping(value="/buscapedidoclienteBack/{idCliente}")
	public Integer buscaPedidoClienteBack(@PathVariable (name="idCliente",required = false) Integer cliente){
		return repository.findByPedidoClienteBack(cliente);
	}
	@GetMapping(value="/buscavalorpedidoback/{id}")
	public Double buscaValorPedidoBack(@PathVariable (name="id",required = false) Integer id){
		return repository.getValorPedidoBack(id);
	}
	@GetMapping(value="/buscavalorpedido/{idCliente}")
	public Double buscaValorPedido(@PathVariable (name="idCliente",required = false) Integer idCliente){
		return repository.getValorPedido(idCliente);
	}
	
	@GetMapping(value="/buscaparcelapedido/{idCliente}")
	public Integer buscaParcelaPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
		return repository.getParcelaPedido(cliente);
	}
	@GetMapping(value="/buscaparcelapedidoBack/{id}")
	public Integer buscaParcelaPedidoBack(@PathVariable (name="id",required = false) Integer id){
		return repository.getParcelaPedidoBack(id);
	}
	@GetMapping(value="/buscasituacaopedido/{idCliente}")
	public String buscaSituacaoPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
		return repository.getSituacaoPedido(cliente);
	}
	@GetMapping(value="/buscadatapedido/{idCliente}")
	public String buscaDataPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate data = repository.buscaDataPedido(cliente);
		String formattedString = data.format(formatter);
		return formattedString;
	} 
	@GetMapping(value="/buscaformapedido/{idCliente}")
	public String buscaFormaPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
		System.out.println(cliente);
		return repository.buscaFormaPedido(cliente);
	}
	@GetMapping(value="/buscaclientebypedido/{id}")
	public Cliente buscaClienteByPedido(@PathVariable (name="id",required = false) Integer id){
		return repository.buscaClientePorPedido(id);
	}
	@GetMapping(value="/buscapedido/{id}")
	public Pedidos buscaPedido(@PathVariable (name="id",required = false) Integer id){
		return repository.findByPedido(id);
	}
	@GetMapping(value="/pedidosemcredito")
	public List<Pedidos>pedidosEmCredito(){
		return repository.pedidosEmCredito();
	}
	
	@PutMapping(value="/aprovapedido/{id}")
	public Integer aprovaPedido(@PathVariable Integer id) {
		return repository.aprova(id);
	}
	@PutMapping(value="/reprovapedido/{id}")
	public Integer reprovaPedido(@PathVariable Integer id) {
		return repository.reprova(id);
	}
	
	
	
}
