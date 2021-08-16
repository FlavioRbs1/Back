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
	
	@Column(length = 15 )
	private String analiseCpf;
	
	@Column(length = 15 )
	private String analiseEstCivil;
	
	@Column(length = 15 )
	private String analiseIdade;
	
	@Column(length = 15 )
	private String analisePercEndiv;
	
	@Column(length = 15 )
	private String analiseProfissao;
	
	@Column(length = 15 )
	private String analiseRenda;
	
	@Column(length = 50 )
	private BigDecimal classAmarelo;
	
	@Column(length = 50 )
	private BigDecimal classAzul;
	
	@Column(length = 50 )
	private BigDecimal classVerde;
	
	@Column(length = 50 )
	private BigDecimal classVermelho;
	
	@Column(length = 10 )
	private String libAutomatica;
	
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

	public String isAnaliseCpf() {
		return analiseCpf;
	}

	public void setAnaliseCpf(String analiseCpf) {
		this.analiseCpf = analiseCpf;
	}

	public String isAnaliseEstCivil() {
		return analiseEstCivil;
	}

	public void setAnaliseEstCivil(String analiseEstCivil) {
		this.analiseEstCivil = analiseEstCivil;
	}

	public String isAnaliseIdade() {
		return analiseIdade;
	}

	public void setAnaliseIdade(String analiseIdade) {
		this.analiseIdade = analiseIdade;
	}

	public String isAnalisePercEndiv() {
		return analisePercEndiv;
	}

	public void setAnalisePercEndiv(String analisePercEndiv) {
		this.analisePercEndiv = analisePercEndiv;
	}

	public String isAnaliseProfissao() {
		return analiseProfissao;
	}

	public void setAnaliseProfissao(String analiseProfissao) {
		this.analiseProfissao = analiseProfissao;
	}

	public String isAnaliseRenda() {
		return analiseRenda;
	}

	public void setAnaliseRenda(String analiseRenda) {
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

	public String isLibAutomatica() {
		return libAutomatica;
	}

	public void setLibAutomatica(String libAutomatica) {
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
