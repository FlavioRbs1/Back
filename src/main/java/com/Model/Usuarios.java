package com.Model;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 100)
	private String user;
	
	@Column(length = 30)
	private String login;
	
	@Column(length = 10)
	private String senha;
	
	@Column(length = 1)
	private Integer tipoUser;
	
	@Column(length = 1)
	private boolean liberado;
	
	@Column(updatable = false)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date cadastroUser;
}
