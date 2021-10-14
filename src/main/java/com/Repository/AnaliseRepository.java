package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Model.Analise;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise,Integer> {

	@Query(value="SELECT a.id FROM Analise as a WHERE id_cliente = :idCliente and id_pedidos = :idPedido")
	public Object findAnaliseByPedidoCliente(Integer idPedido, Integer idCliente);


	
}
