package com.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

	
	public void configure(HttpSecurity http) throws Exception{
		http.authorizeRequests()
			.antMatchers("/api/cliente/**").permitAll()
			.antMatchers("/api/analise/**").permitAll()
			.antMatchers("api/configuracao/**").hasRole("ADMIN")
			.antMatchers("api/metrica/**").hasRole("ADMIN")
			.antMatchers("api/pedido/**").permitAll()
			.antMatchers("api/usuarios/**").hasRole("ADMIN");
	}
}
