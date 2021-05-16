package com.model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(nullable = false,length = 11)
    private String cpf;

    @Column(nullable = false, length = 15)
    private String rg;

    @Column
    private boolean sexo;

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

    @Column
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
