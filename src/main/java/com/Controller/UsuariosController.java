package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Model.Usuarios;
import com.Repository.UsuariosRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {
	
	@Autowired
	UsuariosRepository repository;
	
	@PostMapping(value="/save")
	public Usuarios save(@RequestBody Usuarios usuario) {
		return repository.save(usuario);
	}
	
	@GetMapping(value="/lista")
	public List<Usuarios> obterTodos(){
		return repository.findAll();
	}

}
