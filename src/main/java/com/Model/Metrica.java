package com.Model;

import java.math.BigDecimal;

import javax.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Builder
public class Metrica {
	
	@Id
	private Integer id;
	
	@Column(length = 1)
	private boolean analiseCpf;
	
	@Column(length = 1)
	private boolean analiseEstCivil;
	
	@Column(length = 1)
	private boolean analiseIdade;
	
	@Column(length = 1)
	private boolean analiseProfissao;
	
	@Column(length = 1)
	private boolean analiseRenda;
	
	@Column(length = 1)
	private boolean analisePercEndiv;
	
	@Column(length = 3)
	private Integer percentual;
	
	@Column(length = 1)
	private boolean libAutomatica;
	
	@Column(length = 50 )
	private BigDecimal classVermelho;
	
	@Column(length = 50 )
	private BigDecimal classAmarelo;
	
	@Column(length = 50 )
	private BigDecimal classVerde;
	
	@Column(length = 50 )
	private BigDecimal classAzul;
	
	@Column(length = 50 )
	private BigDecimal limiteCredito;
	
}
