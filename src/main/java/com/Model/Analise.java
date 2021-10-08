package com.Model;


import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Analise {
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name ="id_cliente")
	private Cliente idCliente;
	
	@ManyToOne
	@JoinColumn(name ="id_pedidos")
	private Pedidos idPedido;
	
	@Column
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dataAnalise;
	
	@Column(length = 3)
	private Integer analiseCpf;
	
	@Column(length = 3)
	private Integer analisePendencias;
	
	@Column(length = 3)
	private Integer analiseRenda;
	
	@Column(length = 3)
	private Integer analisePerc;
	
	@Column
	private String situacao;
	
	@Column
	private String concessao;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Pedidos getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Pedidos idPedido) {
		this.idPedido = idPedido;
	}

	public LocalDate getDataAnalise() {
		return dataAnalise;
	}

	public void setDataAnalise(LocalDate dataAnalise) {
		this.dataAnalise = dataAnalise;
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

	public Integer getAnaliseRenda() {
		return analiseRenda;
	}

	public void setAnaliseRenda(Integer analiseRenda) {
		this.analiseRenda = analiseRenda;
	}

	public Integer getAnalisePerc() {
		return analisePerc;
	}

	public void setAnalisePerc(Integer analisePerc) {
		this.analisePerc = analisePerc;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public String getConcessao() {
		return concessao;
	}

	public void setConcessao(String concessao) {
		this.concessao = concessao;
	}

	

}
