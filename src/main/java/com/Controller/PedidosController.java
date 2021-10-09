package com.Controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Pedidos;
import com.Repository.PedidosRepository;

@RestController
@RequestMapping("/api/pedido")
public class PedidosController {
	
	@Autowired
	PedidosRepository repository;
	
	@PostMapping(value = "/save")
	public Pedidos save(@RequestBody Pedidos pedido) {
		return repository.save(pedido);
	}
	@GetMapping(value="/buscapedidocliente/{idCliente}")
	public Integer buscaPedidoCliente(@PathVariable (name="idCliente",required = false) Integer cliente){
		return repository.findByPedidoCliente(cliente);
	}
	@GetMapping(value="/buscavalorpedido/{id}")
	public Double buscaValorPedido(@PathVariable (name="id",required = false) Integer id){
		return repository.getValorPedido(id);
	}
	
	@GetMapping(value="/buscaparcelapedido/{id}")
	public Integer buscaParcelaPedido(@PathVariable (name="id",required = false) Integer id){
		return repository.getParcelaPedido(id);
	}
	@GetMapping(value="/buscasituacaopedido/{idCliente}")
	public String buscaSituacaoPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
		return repository.getSituacaoPedido(cliente);
	}
//	@GetMapping(value="/buscadatapedido/{idCliente}")
//	public String buscaDataPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
//		return repository.buscaDataPedido(cliente);
//	}
	@GetMapping(value="/buscaformapedido/{idCliente}")
	public String buscaFormaPedido(@PathVariable (name="idCliente",required = false) Integer cliente){
		System.out.println(cliente);
		return repository.buscaFormaPedido(cliente);
	}
	@GetMapping(value="/buscapedido/{id}")
	public Pedidos buscaPedido(@PathVariable (name="id",required = false) Integer id){
		return repository.findByPedido(id);
	}
	
}
