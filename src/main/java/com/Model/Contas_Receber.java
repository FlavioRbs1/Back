package com.Model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Contas_Receber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "pedido_pedidos")
    private Pedidos pedido;

    @Column
    private Integer parcela;

    @Column
    private BigDecimal valor;

    @Column
    private Date vencimento;

    @Column
    private Date pagamento;

    @Column
    private BigDecimal atraso;

    @Column
    private BigDecimal liquidado;

    @Column
    private BigDecimal abertoAtraso;

    @Column
    private BigDecimal totalAberto;
}
