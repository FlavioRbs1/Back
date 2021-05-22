package com.Model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    @Column
    private Date dia;

    @Column
    private BigDecimal valor;

    @Column
    private String formaPagamento;

    @Column
    private Integer parcelas;

    @Column
    private String situacao;


}
