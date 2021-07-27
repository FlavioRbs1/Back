package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Cliente;
import com.Repository.ClientesRepository;

@RestController
@RequestMapping(value = "/api")
public class ClientesController {
	
	@Autowired
	ClientesRepository repository;
	
	@PostMapping("/cliente")
	public Cliente save(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
}
