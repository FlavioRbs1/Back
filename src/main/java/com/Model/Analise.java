package com.Model;


import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Analise {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer cliente;
	private Date dataAnalise;
	private Integer analiseCpf;
	private Integer analiseEstCivil;
	private Integer analiseIdade;
	private Integer analiseProfissao;
	private Integer analiseRenda;
	private Integer analisePerc;
	private String situacao;
	private String concessao;
}
