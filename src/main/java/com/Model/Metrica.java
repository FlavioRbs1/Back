package com.Model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column
	private boolean analiseCpf;
	
	@Column
	private boolean analiseEstCivil;
	
	@Column
	private boolean analiseIdade;
	
	@Column
	private boolean analisePercEndiv;
	
	@Column
	private boolean analiseProfissao;
	
	@Column
	private boolean analiseRenda;
	
	@Column(length = 50 )
	private BigDecimal classAmarelo;
	
	@Column(length = 50 )
	private BigDecimal classAzul;
	
	@Column(length = 50 )
	private BigDecimal classVerde;
	
	@Column(length = 50 )
	private BigDecimal classVermelho;
	
	@Column
	private boolean libAutomatica;
	
	@Column(length = 50 )
	private BigDecimal limiteCredito;
	
	@Column(length = 3)
	private Integer percentual;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isAnaliseCpf() {
		return analiseCpf;
	}

	public void setAnaliseCpf(boolean analiseCpf) {
		this.analiseCpf = analiseCpf;
	}

	public boolean isAnaliseEstCivil() {
		return analiseEstCivil;
	}

	public void setAnaliseEstCivil(boolean analiseEstCivil) {
		this.analiseEstCivil = analiseEstCivil;
	}

	public boolean isAnaliseIdade() {
		return analiseIdade;
	}

	public void setAnaliseIdade(boolean analiseIdade) {
		this.analiseIdade = analiseIdade;
	}

	public boolean isAnalisePercEndiv() {
		return analisePercEndiv;
	}

	public void setAnalisePercEndiv(boolean analisePercEndiv) {
		this.analisePercEndiv = analisePercEndiv;
	}

	public boolean isAnaliseProfissao() {
		return analiseProfissao;
	}

	public void setAnaliseProfissao(boolean analiseProfissao) {
		this.analiseProfissao = analiseProfissao;
	}

	public boolean isAnaliseRenda() {
		return analiseRenda;
	}

	public void setAnaliseRenda(boolean analiseRenda) {
		this.analiseRenda = analiseRenda;
	}

	public BigDecimal getClassAmarelo() {
		return classAmarelo;
	}

	public void setClassAmarelo(BigDecimal classAmarelo) {
		this.classAmarelo = classAmarelo;
	}

	public BigDecimal getClassAzul() {
		return classAzul;
	}

	public void setClassAzul(BigDecimal classAzul) {
		this.classAzul = classAzul;
	}

	public BigDecimal getClassVerde() {
		return classVerde;
	}

	public void setClassVerde(BigDecimal classVerde) {
		this.classVerde = classVerde;
	}

	public BigDecimal getClassVermelho() {
		return classVermelho;
	}

	public void setClassVermelho(BigDecimal classVermelho) {
		this.classVermelho = classVermelho;
	}

	public boolean isLibAutomatica() {
		return libAutomatica;
	}

	public void setLibAutomatica(boolean libAutomatica) {
		this.libAutomatica = libAutomatica;
	}

	public BigDecimal getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(BigDecimal limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public Integer getPercentual() {
		return percentual;
	}

	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
	
	
}
