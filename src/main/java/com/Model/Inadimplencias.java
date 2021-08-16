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

public class Inadimplencias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @Column
    private BigDecimal aberto; //Valor em aberto somente pendências

    @Column
    private BigDecimal abertoTotal; //Valor em aberto vencidos e não vencidos

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public BigDecimal getAberto() {
		return aberto;
	}

	public void setAberto(BigDecimal aberto) {
		this.aberto = aberto;
	}

	public BigDecimal getAbertoTotal() {
		return abertoTotal;
	}

	public void setAbertoTotal(BigDecimal abertoTotal) {
		this.abertoTotal = abertoTotal;
	}

    

}
