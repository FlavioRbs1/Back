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
	
	@Column(length = 1)
	private Integer analiseCpf;
	
	@Column(length = 1)
	private Integer analiseEstCivil;
	
	@Column(length = 1)
	private Integer analiseIdade;
	
	@Column(length = 1)
	private Integer analisePercEndiv;
	
	@Column(length = 1)
	private Integer analiseProfissao;
	
	@Column(length = 1)
	private Integer analiseRenda;
	
	@Column(length = 50 )
	private BigDecimal classAmarelo;
	
	@Column(length = 50 )
	private BigDecimal classAzul;
	
	@Column(length = 50 )
	private BigDecimal classVerde;
	
	@Column(length = 50 )
	private BigDecimal classVermelho;
	
	@Column(length = 1)
	private Integer libAutomatica;
	
	@Column(length = 50 )
	private BigDecimal limiteCredito;
	
	@Column(length = 3)
	private Integer percentual;
	
}
