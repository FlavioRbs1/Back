package com.DTO;

public class AnaliseDTO {

	private Integer analiseCpf;
	private Integer analiseEstCivil;
	private Integer analiseIdade;
	private Integer analisePerc;
	private Integer analiseProfissao;
	private Integer analiseRenda;
	private String concessao;
	private String dataAnalise;
	private String situacao;
	private Integer idCliente;
	private Integer idPedido;
	Regras r = new Regras();
	
	public Integer getAnaliseCpf() {
		return analiseCpf;
	}
	public void setAnaliseCpf(Integer analiseCpf) {
		this.analiseCpf = analiseCpf;
	}
	public Integer getAnaliseEstCivil() {
		return analiseEstCivil;
	}
	public void setAnaliseEstCivil(Integer analiseEstCivil) {
		this.analiseEstCivil = analiseEstCivil(analiseEstCivil);
	}
	private Integer analiseEstCivil(Integer analiseEstCivil) {
		analiseEstCivil = 88 + 9;
		return analiseEstCivil;
	}
	public Integer getAnaliseIdade() {
		return analiseIdade;
	}
	public void setAnaliseIdade(Integer analiseIdade) {
		this.analiseIdade = analiseIdade;
	}
	public Integer getAnalisePerc() {
		return analisePerc;
	}
	public void setAnalisePerc(Integer analisePerc) {
		this.analisePerc = analisePerc;
	}
	public Integer getAnaliseProfissao() {
		return analiseProfissao;
	}
	public void setAnaliseProfissao(Integer analiseProfissao) {
		this.analiseProfissao = analiseProfissao;
	}
	public Integer getAnaliseRenda() {
		return analiseRenda;
	}
	public void setAnaliseRenda(Integer analiseRenda) {
		this.analiseRenda = analiseRenda;
	}
	public String getConcessao() {
		return concessao;
	}
	public void setConcessao(String concessao) {
		this.concessao = concessao;
	}
	public String getDataAnalise() {
		return dataAnalise;
	}
	public void setDataAnalise(String dataAnalise) {
		this.dataAnalise = dataAnalise;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Integer getCliente() {
		return idCliente;
	}
	public void setCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getPedido() {
		return idPedido;
	}
	public void setPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	
	
}
