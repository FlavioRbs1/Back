package com.Controller;
import java.util.Optional;

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

import com.Model.Cliente;
import com.Repository.ClienteRepository;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

	
	@Autowired
	ClienteRepository repository;

	
	@PostMapping(value = "/save")
	public Cliente save(@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	@GetMapping(value = "/busca/{cpf}")
	public ResponseEntity<Object> busca(@PathVariable(name="cpf",required = false) String cpf) {
		return ResponseEntity.ok(repository.findByCpf(cpf));
		
	}
	@GetMapping(value = "/buscaid/{id}")
	public Cliente buscaId(@PathVariable(name="id",required = false) Integer id){
		return  repository.buscaId(id);
	}
	@GetMapping(value = "/buscacpfporid/{id}")
	public Cliente buscaCpfById(@PathVariable(name="id",required = false) Integer id){
		return  repository.buscaCpfById(id);
	}

	@GetMapping(value ="/buscarenda/{id}")
	public Double getRenda(@PathVariable(name="id",required = false) Integer id) {
		return repository.getRenda(id);
	}
	@PutMapping (value = "/busca/{cpf}")
	public Cliente replace(@PathVariable String cpf,@RequestBody Cliente cliente) {
		return repository.save(cliente);
	}
	
	
}
