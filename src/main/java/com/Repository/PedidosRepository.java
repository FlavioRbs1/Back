package com.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer> {

	Optional<Pedidos> findById(Integer id);
	

	@Query(value="SELECT p.parcelas,p.situacao,p.valor from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public Integer buscaPedido(Integer idCliente);
	
	@Query(value="SELECT id from Pedidos where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public Integer findByPedidoCliente(Integer idCliente);
	
	@Query(value="SELECT p.valor from Pedidos as p where id = :id")
	public Double getValorPedido(Integer id);
	
	@Query(value="SELECT p.parcelas from Pedidos as p where id = :id")
	public Integer getParcelaPedido(Integer id);

	@Query(value="SELECT p from Pedidos as p where id = :id")
	public Pedidos findByPedido(Integer id);

	@Query(value="SELECT p.situacao from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public String getSituacaoPedido(Integer idCliente);

//	@Query(value="SELECT p.dia from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
//	public String buscaDataPedido(Integer cliente);

	@Query(value="SELECT p.formaPagamento from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public String buscaFormaPedido(Integer idCliente);
}
