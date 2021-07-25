package com.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Metrica;
import com.Repository.MetricaRepository;

@RestController
@RequestMapping(value = "/api")
public class MetricasController {

	@Autowired
	MetricaRepository repository;
	
	@PutMapping("/metrica")
	public Metrica atualiza(@RequestBody Metrica metrica) {
		return repository.save(metrica);
	}
}
