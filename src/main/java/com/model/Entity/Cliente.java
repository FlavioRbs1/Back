package com.model.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false,length = 11,updatable = false)
    private String cpf;

    @Column(nullable = false, length = 15)
    private String rg;

    @Column
    private String sexo;

    @Column(nullable = false, length = 20)
    private String tel1;

    @Column
    private String tel2;

    @Column(nullable = false, length = 100)
    private String endereco;

    @Column(nullable = false, length = 15)
    private Integer numero;

    @Column(nullable = true, length = 100)
    private String complemento;

    @Column(nullable = false, length = 60)
    private String bairro;

    @Column(nullable = false, length = 50)
    private String cidade;

    @Column(nullable = false, length = 50)
    private String estado;

    @Column(nullable = false, length = 50)
    private String estadoCivil;

    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNasc;

    @Column(nullable = false, length = 2)
    private Integer dependentes;

    @Column(nullable = false, length = 100)
    private String profissao;

    @Column(nullable = false, length = 100)
    private String empresa;

    @Column(nullable = false, length = 50)
    private BigDecimal renda;

    @Column(nullable = true, length = 50)
    private BigDecimal rendaFamiliar;

    @Column(nullable = true, length = 50)
    private BigDecimal rendaTotal;

    @Column(nullable = true, length = 150)
    private String comentarios;
}
