package com.Controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.UsuariosDTO;
import com.Model.Usuarios;
import com.Repository.UsuariosRepository;

@RestController
@RequestMapping("/api/usuarios")
public class UsuariosController {
	
	private final UsuariosRepository repository;

	@Autowired
	public UsuariosController(UsuariosRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(value="/save")
	public Usuarios save(@RequestBody @Valid UsuariosDTO dto) {
		Usuarios usuario = new Usuarios();
		usuario.setUser(dto.getUser());
		usuario.setLogin(dto.getLogin());
		usuario.setSenha(dto.getSenha());
		usuario.setTipoUser(dto.getTipoUser());
		usuario.setSituacao(dto.getSituacao());
		LocalDate data = LocalDate.now();
		usuario.setCadastroUser(data);
		return repository.save(usuario);
	}
	
	@GetMapping(value="/lista")
	public List<Usuarios> obterTodos(){
		return repository.findAll();
	}

}
