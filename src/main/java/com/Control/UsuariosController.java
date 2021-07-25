package com.Control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.Model.Usuarios;
import com.Repository.UsuariosRepository;

@RestController
@RequestMapping(value = "/api")
public class UsuariosController {

	@Autowired
	UsuariosRepository repository;
	
	@PostMapping("/usuarios")
	public Usuarios salvar(@RequestBody Usuarios usuario) {
		return repository.save(usuario);
	}
	
	@GetMapping("usuarios/{id}")
	public Usuarios buscar(@PathVariable Integer id) {
		return repository
				.findById(id)
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND));
		
	}
	@PutMapping("/usuarios")
	public Usuarios atualiza(@RequestBody Usuarios usuario) {
		return repository.save(usuario);
	}
}
