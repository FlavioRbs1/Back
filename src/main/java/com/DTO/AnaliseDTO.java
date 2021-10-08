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
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public Integer getAnaliseCpf() {
		return analiseCpf;
	}
	public void setAnaliseCpf(Integer analiseCpf) {
		this.analiseCpf = analiseCpf;
	}
	public Integer getanalisePendencias() {
		return analisePendencias;
	}
	public void setAnaliseEstCivil(Integer analisePendencias) {
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

}
