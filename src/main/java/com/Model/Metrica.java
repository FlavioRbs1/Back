package com.Model;

import java.math.BigDecimal;

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
	private BigDecimal classAmarelo;

	@Column(length = 3)
	private Integer classAzul;
	
	@Column(length = 50 )
	private BigDecimal classVerde;

	@Column(length = 50 )
	private BigDecimal classVermelho;
	
	@Column(length = 50 )
	private BigDecimal comprasAbertoAmarelo;
	
	@Column(length = 50 )
	private BigDecimal comprasAbertoVermelho;
	
	@Column(length = 15 )
	private BigDecimal cpfAmarelo;
	
	@Column(length = 15 )
	private BigDecimal cpfAzul;
	
	@Column(length = 15 )
	private BigDecimal cpfVerde;
	
	@Column(length = 15 )
	private BigDecimal cpfVermelho;
	
	@Column(length = 15 )
	private BigDecimal idadeAmarelo;
	
	@Column(length = 50 )
	private BigDecimal idadeAzul;
	
	@Column(length = 15 )
	private BigDecimal idadeVerde;
	
	@Column(length = 15 )
	private BigDecimal idadeVermelho;
	
	@Column(length = 50 )
	private BigDecimal limiteCredito;

	@Column(length = 50 )
	private BigDecimal percentual;
	
	@Column(length = 15 )
	private BigDecimal rendaAmarelo;
	
	@Column(length = 50 )
	private BigDecimal rendaAzul;
	
	@Column(length = 50 )
	private BigDecimal rendaVerde;
	
	@Column(length = 15 )
	private BigDecimal rendaVermelho;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCpfVermelho() {
		return cpfVermelho;
	}

	public void setCpfVermelho(BigDecimal cpfVermelho) {
		this.cpfVermelho = cpfVermelho;
	}

	public BigDecimal getCpfAmarelo() {
		return cpfAmarelo;
	}

	public void setCpfAmarelo(BigDecimal cpfAmarelo) {
		this.cpfAmarelo = cpfAmarelo;
	}

	public BigDecimal getCpfVerde() {
		return cpfVerde;
	}

	public void setCpfVerde(BigDecimal cpfVerde) {
		this.cpfVerde = cpfVerde;
	}

	public BigDecimal getCpfAzul() {
		return cpfAzul;
	}

	public void setCpfAzul(BigDecimal cpfAzul) {
		this.cpfAzul = cpfAzul;
	}

	public BigDecimal getIdadeVermelho() {
		return idadeVermelho;
	}

	public void setIdadeVermelho(BigDecimal idadeVermelho) {
		this.idadeVermelho = idadeVermelho;
	}

	public BigDecimal getIdadeVerde() {
		return idadeVerde;
	}

	public void setIdadeVerde(BigDecimal idadeVerde) {
		this.idadeVerde = idadeVerde;
	}

	public BigDecimal getIdadeAzul() {
		return idadeAzul;
	}

	public void setIdadeAzul(BigDecimal idadeAzul) {
		this.idadeAzul = idadeAzul;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public BigDecimal getComprasAbertoVermelho() {
		return comprasAbertoVermelho;
	}

	public void setComprasAbertoVermelho(BigDecimal comprasAbertoVermelho) {
		this.comprasAbertoVermelho = comprasAbertoVermelho;
	}

	public BigDecimal getComprasAbertoAmarelo() {
		return comprasAbertoAmarelo;
	}

	public void setComprasAbertoAmarelo(BigDecimal comprasAbertoAmarelo) {
		this.comprasAbertoAmarelo = comprasAbertoAmarelo;
	}

	public BigDecimal getRendaVermelho() {
		return rendaVermelho;
	}

	public void setRendaVermelho(BigDecimal rendaVermelho) {
		this.rendaVermelho = rendaVermelho;
	}

	public BigDecimal getRendaAmarelo() {
		return rendaAmarelo;
	}

	public void setRendaAmarelo(BigDecimal rendaAmarelo) {
		this.rendaAmarelo = rendaAmarelo;
	}

	public BigDecimal getRendaVerde() {
		return rendaVerde;
	}

	public void setRendaVerde(BigDecimal rendaVerde) {
		this.rendaVerde = rendaVerde;
	}

	public BigDecimal getRendaAzul() {
		return rendaAzul;
	}

	public void setRendaAzul(BigDecimal rendaAzul) {
		this.rendaAzul = rendaAzul;
	}

	public BigDecimal getPercentual() {
		return percentual;
	}

	public void setPercentual(BigDecimal percentual) {
		this.percentual = percentual;
	}

	public BigDecimal getClassVermelho() {
		return classVermelho;
	}

	public void setClassVermelho(BigDecimal classVermelho) {
		this.classVermelho = classVermelho;
	}

	public BigDecimal getClassAmarelo() {
		return classAmarelo;
	}

	public void setClassAmarelo(BigDecimal classAmarelo) {
		this.classAmarelo = classAmarelo;
	}

	public BigDecimal getClassVerde() {
		return classVerde;
	}

	public void setClassVerde(BigDecimal classVerde) {
		this.classVerde = classVerde;
	}

	public Integer getClassAzul() {
		return classAzul;
	}

	public void setClassAzul(Integer classAzul) {
		this.classAzul = classAzul;
	}

	public BigDecimal getIdadeAmarelo() {
		return idadeAmarelo;
	}

	public void setIdadeAmarelo(BigDecimal idadeAmarelo) {
		this.idadeAmarelo = idadeAmarelo;
	}
	
}
