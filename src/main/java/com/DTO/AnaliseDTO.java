package com.DTO;



public class AnaliseDTO {

	private Integer id;
	private Integer analiseCpf;
	private Integer analisePendencias;
	private Integer analisePerc;
	private Integer analiseRenda;
	private String concessao;
	private String dataAnalise;
	private String situacao;
	private Integer idCliente;
	private Integer idPedido;
	private Double score;
	private String classificacao;
	
	
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAnaliseCpf() {
		return analiseCpf;
	}
	public void setAnaliseCpf(Integer analiseCpf) {
		this.analiseCpf = analiseCpf;
	}
	public Integer getAnalisePendencias() {
		return analisePendencias;
	}
	public void setAnalisePendencias(Integer analisePendencias) {
		this.analisePendencias = analisePendencias;
	}
	public Integer getAnalisePerc() {
		return analisePerc;
	}
	public void setAnalisePerc(Integer analisePerc) {
		this.analisePerc = analisePerc;
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
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public Integer getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	
	

}
