package com.DTO;


public class UsuariosDTO {

	private Integer id;
	private String user;
	private String login;
	private String senha;
	private String tipoUser;
	private String situacao;
	private String cadastroUser;
	
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
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getCadastroUser() {
		return cadastroUser;
	}
	public void setCadastroUser(String cadastroUser) {
		this.cadastroUser = cadastroUser;
	}

	
	
}
