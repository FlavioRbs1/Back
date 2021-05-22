package com.Model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.SEQUENCE;

public class Rendas {

    @Id
    @GeneratedValue(strategy = SEQUENCE)
    private Cliente cliente;

    @Column( length = 2)
    private Integer dependentes;

    @Column( length = 100)
    private String profissao;

    @Column( length = 100)
    private String empresa;

    @Column( length = 50)
    private BigDecimal renda;

    @Column( length = 50)
    private BigDecimal rendaFamiliar;

    @Column( length = 50)
    private BigDecimal rendaTotal;

}
