package com.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @ManyToOne
    @JoinColumn
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
