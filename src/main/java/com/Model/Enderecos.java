package com.Model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Enderecos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
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
