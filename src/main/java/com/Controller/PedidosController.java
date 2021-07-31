package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
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

}
