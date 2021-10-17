package com.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Configuracao;
import com.Repository.ConfiguracaoRepository;

@RestController
@RequestMapping("/api/configuracao")
public class ConfiguracaoController {

	@Autowired
	ConfiguracaoRepository repository;
	
	@GetMapping(value="/buscaconfiguracao/{id}")
	public Optional<Configuracao> busca(@PathVariable Integer id){
		return repository.findById(id);
	}
	
	@PutMapping(value="/altera/{id}")
	public Configuracao replace(@PathVariable Integer id, @RequestBody Configuracao config) {
		return repository.save(config);
	}
}
