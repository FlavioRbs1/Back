package com.model.Entity;

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
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private Date dia;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String formaPagamento;

    @Column(nullable = true, length = 30)
    private String situacao;


}
