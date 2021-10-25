package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Model.Usuarios;
import com.Repository.UsuariosRepository;

@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuariosRepository repository;
	
	
	@Override
	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		Usuarios usuario = repository
				.findByLogin(login)
				.orElseThrow(()-> new UsernameNotFoundException("Login não encontrado."));
		return User.builder()
				.username(usuario.getLogin())
				.password(usuario.getSenha())
				.roles(usuario.getTipoUser())
				.build();
	}

}
