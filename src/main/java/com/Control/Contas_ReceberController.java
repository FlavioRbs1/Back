package com.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.Model.Contas_Receber;
import com.Repository.Contas_ReceberRepository;

@RestController
@RequestMapping(value = "/api")
public class Contas_ReceberController {

	@Autowired
	Contas_ReceberRepository repository;
	
	@GetMapping("contas-receber/{id}")
	public Contas_Receber buscarId(@PathVariable Integer id) {
		return repository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
	}
}
