package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Analise;
import com.Repository.AnaliseRepository;

@RestController
@RequestMapping("/api/analise")
public class AnaliseController {
	
	@Autowired
	AnaliseRepository repository;

	@PostMapping(value="/save")
	public Analise save(@RequestBody Analise analise) {
		return repository.save(analise);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Object> busca(@PathVariable Integer id){
		return ResponseEntity.ok(repository.findById(id));
	}
	@PutMapping (value="/analise/{id}")
	public Analise replace (@PathVariable Integer id, @RequestBody Analise analise) {
		return repository.save(analise);
	}
	
}
