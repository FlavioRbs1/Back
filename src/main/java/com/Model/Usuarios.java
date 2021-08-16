package com.Model;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100)
	private String user;
	
	@Column(length = 30)
	private String login;
	
	@Column(length = 10)
	private String senha;
	
	@Column(length = 15)
	private String tipoUser;

	
	@Column(length = 15)
	private String situacao;
	
	@Column(updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date cadastroUser;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}


	public Date getCadastroUser() {
		return cadastroUser;
	}

	public void setCadastroUser(Date cadastroUser) {
		this.cadastroUser = cadastroUser;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	
}
