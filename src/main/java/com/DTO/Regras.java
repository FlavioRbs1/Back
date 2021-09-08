package com.DTO;

import com.Model.Inadimplencias;

public class Regras {
	
	public Integer verificaRiscoCpfXCompra(Integer idCliente) {
		//função deve buscar no repositorio de pedidos e verificar se existe compras feitas pelo cliente que estão em aberto e comparar com as regras da metrica.		
		return null;
	}
	
	public Integer verificaRiscoEstadoCivilXCliente(Integer idCliente) {
		//função deve ir no cadastro de clientes e verificar o estado civil do cliente e comparar com regras das metricas
		return null;
	}
	
	public Integer verificaRiscoIdadeXCliente(Integer idCliente) {
		//função deve ir no cadastro de clientes e verificar idade do cliente, depois comparar com idades das metricas
		return null;
	}
	public Integer verificaRiscoPercentualXRenda(Integer idCliente, Integer idPedido) {
		//função deve verificar o numero do pedido, valor em aberto e comparar com o percentual parametrizado nas metricas 
		return null;
	}
	public Integer verificaRiscoRendaXCliente(Integer idCliente) {
		// função deve ir no cadastro de clientes, verificar a renda e comparar com as rendas parametrizadas no cadastro de metricas
		return null;
	}
	public String aplicaSituacaoDaAnalise(Integer analise1) {
	String situacao ="";
		return situacao;
	}
}
