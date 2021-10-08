package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
