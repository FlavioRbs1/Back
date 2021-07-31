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

public class Pedidos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dia;
    
    @Column
    private String formaPagamento;
    
    @Column
    private Integer parcelas;
    
    @Column
    private String situacao;
     
    @Column
    private BigDecimal valor;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;


}
