package com.Repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer> {

	Optional<Pedidos> findById(Integer id);
	
	@Query(value="SELECT count(*) from Pedidos where id_cliente = :idCliente")
	public Integer findByPedidoCliente(Integer idCliente);
	
	@Query(value="SELECT p.valor from Pedidos as p where id = :idPedido")
	public Double getValorPedido(Integer idPedido);
	
	@Query(value="SELECT p.parcelas from Pedidos as p where id = :idPedido")
	public Integer getParcelaPedido(Integer idPedido);
}
