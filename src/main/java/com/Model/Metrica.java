package com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Metrica {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 10 )
	private Double classAmarelo;

	@Column(length = 3)
	private Integer classAzul;
	
	@Column(length = 50 )
	private Double classVerde;

	@Column(length = 50 )
	private Double classVermelho;
	
	@Column(length = 50 )
	private Double comprasAbertoAzul;
	
	@Column(length = 50 )
	private Double comprasAbertoVermelho;
	
	@Column(length = 15 )
	private Double cpfAmarelo;
	
	@Column(length = 15 )
	private Double cpfAzul;
	
	@Column(length = 15 )
	private Double cpfVerde;
	
	@Column(length = 15 )
	private Double cpfVermelho;
	
	@Column(length = 15 )
	private Double idadeAmarelo;
	
	@Column(length = 50 )
	private Double idadeAzul;
	
	@Column(length = 15 )
	private Double idadeVerde;
	
	@Column(length = 15 )
	private Double idadeVermelho;
	
	@Column(length = 50 )
	private Double limiteCredito;

	@Column(length = 50 )
	private Double percentual;
	
	@Column(length = 15 )
	private Double rendaAmarelo;
	
	@Column(length = 50 )
	private Double rendaAzul;
	
	@Column(length = 50 )
	private Double rendaVerde;
	
	@Column(length = 15 )
	private Double rendaVermelho;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getCpfVermelho() {
		return cpfVermelho;
	}

	public void setCpfVermelho(Double cpfVermelho) {
		this.cpfVermelho = cpfVermelho;
	}

	public Double getCpfAmarelo() {
		return cpfAmarelo;
	}

	public void setCpfAmarelo(Double cpfAmarelo) {
		this.cpfAmarelo = cpfAmarelo;
	}

	public Double getCpfVerde() {
		return cpfVerde;
	}

	public void setCpfVerde(Double cpfVerde) {
		this.cpfVerde = cpfVerde;
	}

	public Double getCpfAzul() {
		return cpfAzul;
	}

	public void setCpfAzul(Double cpfAzul) {
		this.cpfAzul = cpfAzul;
	}

	public Double getIdadeVermelho() {
		return idadeVermelho;
	}

	public void setIdadeVermelho(Double idadeVermelho) {
		this.idadeVermelho = idadeVermelho;
	}

	public Double getIdadeVerde() {
		return idadeVerde;
	}

	public void setIdadeVerde(Double idadeVerde) {
		this.idadeVerde = idadeVerde;
	}

	public Double getIdadeAzul() {
		return idadeAzul;
	}

	public void setIdadeAzul(Double idadeAzul) {
		this.idadeAzul = idadeAzul;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Double getComprasAbertoVermelho() {
		return comprasAbertoVermelho;
	}

	public void setComprasAbertoVermelho(Double comprasAbertoVermelho) {
		this.comprasAbertoVermelho = comprasAbertoVermelho;
	}

	public Double getComprasAbertoAzul() {
		return comprasAbertoAzul;
	}

	public void setComprasAbertoAzul(Double comprasAbertoAzul) {
		this.comprasAbertoAzul = comprasAbertoAzul;
	}

	public Double getRendaVermelho() {
		return rendaVermelho;
	}

	public void setRendaVermelho(Double rendaVermelho) {
		this.rendaVermelho = rendaVermelho;
	}

	public Double getRendaAmarelo() {
		return rendaAmarelo;
	}

	public void setRendaAmarelo(Double rendaAmarelo) {
		this.rendaAmarelo = rendaAmarelo;
	}

	public Double getRendaVerde() {
		return rendaVerde;
	}

	public void setRendaVerde(Double rendaVerde) {
		this.rendaVerde = rendaVerde;
	}

	public Double getRendaAzul() {
		return rendaAzul;
	}

	public void setRendaAzul(Double rendaAzul) {
		this.rendaAzul = rendaAzul;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}

	public Double getClassVermelho() {
		return classVermelho;
	}

	public void setClassVermelho(Double classVermelho) {
		this.classVermelho = classVermelho;
	}

	public Double getClassAmarelo() {
		return classAmarelo;
	}

	public void setClassAmarelo(Double classAmarelo) {
		this.classAmarelo = classAmarelo;
	}

	public Double getClassVerde() {
		return classVerde;
	}

	public void setClassVerde(Double classVerde) {
		this.classVerde = classVerde;
	}

	public Integer getClassAzul() {
		return classAzul;
	}

	public void setClassAzul(Integer classAzul) {
		this.classAzul = classAzul;
	}

	public Double getIdadeAmarelo() {
		return idadeAmarelo;
	}

	public void setIdadeAmarelo(Double idadeAmarelo) {
		this.idadeAmarelo = idadeAmarelo;
	}
	
}
