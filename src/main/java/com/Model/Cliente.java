package com.Model;

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

    @Column( length = 60)
    private String bairro;

    @Column(length = 50)
    private String cidade;

    @Column( length = 150)
    private String comentarios;

    @Column( length = 100)
    private String complemento;

    @Column(length = 11,updatable = false)
    private String cpf;

    @Column( length = 2)
    private Integer dependentes;

    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNasc;

    @Column( length = 100)
    private String empresa;

    @Column( length = 100)
    private String endereco;

    @Column( length = 50)
    private String estado;

    @Column( length = 50)
    private String estadoCivil;

    @Column( length = 150)
    private String nome;

    @Column( length = 15)
    private Integer numero;

    @Column( length = 100)
    private String profissao;

    @Column( length = 50)
    private BigDecimal renda;

    @Column( length = 50)
    private BigDecimal rendaFamiliar;

    @Column( length = 50)
    private BigDecimal rendaTotal;

    @Column( length = 15)
    private String rg;

    @Column
    private String sexo;

    @Column( length = 20)
    private String tel1;

    @Column
    private String tel2;
   
    
}
