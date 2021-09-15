package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Inadimplencias;
import com.Repository.InadimplenciasRepository;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RestController
@NoArgsConstructor
@RequiredArgsConstructor
public class InadimplenciasController {
	
	private final InadimplenciasRepository repository;
	
	@Autowired
	public InadimplenciasController(InadimplenciasRepository repository) {
		this.repository = repository;
	}
	
	
	

}
