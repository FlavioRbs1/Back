package com.Model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
public class Inadimplencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Pedidos pedido;

    @ManyToOne
    @JoinColumn(name = "cliente_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal aberto;

    @Column
    private BigDecimal abertoTotal;


}
