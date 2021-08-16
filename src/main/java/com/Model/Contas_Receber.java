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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Pedidos getPedido() {
		return pedido;
	}

	public void setPedido(Pedidos pedido) {
		this.pedido = pedido;
	}

	public Integer getParcela() {
		return parcela;
	}

	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getPagamento() {
		return pagamento;
	}

	public void setPagamento(Date pagamento) {
		this.pagamento = pagamento;
	}

	public BigDecimal getAtraso() {
		return atraso;
	}

	public void setAtraso(BigDecimal atraso) {
		this.atraso = atraso;
	}

	public BigDecimal getLiquidado() {
		return liquidado;
	}

	public void setLiquidado(BigDecimal liquidado) {
		this.liquidado = liquidado;
	}

	public BigDecimal getAbertoAtraso() {
		return abertoAtraso;
	}

	public void setAbertoAtraso(BigDecimal abertoAtraso) {
		this.abertoAtraso = abertoAtraso;
	}

	public BigDecimal getTotalAberto() {
		return totalAberto;
	}

	public void setTotalAberto(BigDecimal totalAberto) {
		this.totalAberto = totalAberto;
	}
    
    
}
