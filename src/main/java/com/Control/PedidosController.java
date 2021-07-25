package com.Control;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.Model.Pedidos;
import com.Repository.PedidosRepository;

@RestController
@RequestMapping(value = "/api")
public class PedidosController {

	PedidosRepository repository;
	
	@GetMapping("/pedidos/{id}")
	public Pedidos busca(@RequestBody Integer id) {
		return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@PutMapping("/pedidos/{id}")
	public Pedidos atualiza(@RequestBody Pedidos pedido) {
		return repository.save(pedido);
	}
	
	
}
