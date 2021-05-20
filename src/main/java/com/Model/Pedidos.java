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
    @JoinColumn(name = "id_cliente",updatable = false)
    private Cliente cliente;

    @Column
    private Date dia;

    @Column(nullable = false)
    private BigDecimal valor;

    @Column(nullable = false)
    private String formaPagamento;

    @Column
    private Integer parcelas;

    @Column( length = 30)
    private String situacao;


}
