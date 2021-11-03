package com.Controller;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.UsuariosDTO;
import com.Model.Usuarios;
import com.Repository.UsuariosRepository;

@RestController
@CrossOrigin
@RequestMapping("/api/usuarios")
public class UsuariosController {
	
	private final UsuariosRepository repository;

	@Autowired
	public UsuariosController(UsuariosRepository repository) {
		this.repository = repository;
	}
	
	@PostMapping(value="/save")
	public Usuarios save(@RequestBody UsuariosDTO dto) {
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
	@GetMapping(value="/getlogin/{login}")
	public String getLogin( @PathVariable String login) {
		return repository.getLogin(login);
	}
	@GetMapping(value="/getsenha/{login}")
	public String getSenha( @PathVariable String login) {
		return repository.getSenha(login);
	}
	@GetMapping(value="/getnome/{login}")
	public String getNome( @PathVariable String login) {
		return repository.getNome(login);
	}
}
