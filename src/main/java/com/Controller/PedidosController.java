package com.Controller;

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
	@GetMapping(value="/busca/{id}")
	public ResponseEntity<Object> busca(@PathVariable Integer id){
		return ResponseEntity.ok(repository.findById(id));
	}

}
