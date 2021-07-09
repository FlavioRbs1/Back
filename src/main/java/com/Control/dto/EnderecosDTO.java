package com.Control.dto;

import com.Model.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnderecosDTO {
    private Integer id;
    private Cliente idCliente;
    private String endereco;
    private  Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private  String estado;
}
