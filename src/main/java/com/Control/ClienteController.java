package com.Control;

import com.Model.Cliente;
import com.Repository.ClienteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;



@RestController
@RequestMapping(value = "/api")
public class ClienteController {

	@Autowired
	ClienteRepository repository;
	
	@PostMapping("/cliente")
	public Cliente salvar(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@GetMapping
	public List<Cliente> obterTodos(){
		return repository.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente buscar(@PathVariable Integer id) {
		return repository
				.findById(id)
				.orElseThrow(()-> 
				new ResponseStatusException(HttpStatus.NOT_FOUND));
	}
	
	@GetMapping("/cliente/{cpf}")
	public List<Cliente> buscarPorCpf(@PathVariable String cpf) {
		return repository.findByCpf(cpf);
	}
   
}