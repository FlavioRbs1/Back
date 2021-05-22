package com.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( length = 150)
    private String nome;

    @Column(length = 11,updatable = false)
    private String cpf;

    @Column( length = 15)
    private String rg;

    @Column
    private String sexo;

    @Column( length = 20)
    private String tel1;

    @Column
    private String tel2;

    @Column( length = 50)
    private String estadoCivil;

    @Column(updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dtNasc;

    @Column( length = 150)
    private String comentarios;
}
