package com.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.Model.Inadimplencias;
import com.Repository.InadimplenciasRepository;


@RestController
@RequestMapping(value = "/api")
public class InadimplenciasController {

	@Autowired
	InadimplenciasRepository repository;
	
	@GetMapping("/inadimplencias/{id}")
	public Inadimplencias buscar(@PathVariable Integer id) {
		return repository.findById(id)
				.orElseThrow(()->
				new ResponseStatusException(HttpStatus.NOT_FOUND))
;	}
}
