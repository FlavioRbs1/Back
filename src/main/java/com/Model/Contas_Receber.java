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

public class Contas_Receber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_pedidos")
    private Pedidos pedido;

    @Column
    private Integer parcela;

    @Column
    private BigDecimal valor;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date vencimento;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
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
