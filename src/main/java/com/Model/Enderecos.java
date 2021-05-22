package com.Model;

import javax.persistence.*;

public class Enderecos {

    @Column
    @OneToOne
    @JoinColumn
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Cliente cliente;

    @Column( length = 100)
    private String endereco;

    @Column( length = 15)
    private Integer numero;

    @Column( length = 100)
    private String complemento;

    @Column( length = 60)
    private String bairro;

    @Column(length = 50)
    private String cidade;

    @Column( length = 50)
    private String estado;
}
