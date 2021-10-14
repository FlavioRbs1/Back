package com.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.Model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer> {

	Optional<Pedidos> findById(Integer id);
	

	@Query(value="SELECT p.parcelas,p.situacao,p.valor from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public Integer buscaPedido(Integer idCliente);
	
	@Query(value="SELECT COUNT(*) from Pedidos as p where id_cliente = :idCliente")
	public Integer findByPedidoClienteBack(Integer idCliente);
	
	@Query(value="SELECT p.id from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public Integer findByPedidoCliente(Integer idCliente);
	
	@Query(value="SELECT p.valor from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public Double getValorPedido(Integer idCliente);
	
	@Query(value="SELECT p.valor from Pedidos as p where id = :id")
	public Double getValorPedidoBack(Integer id);
	
	@Query(value="SELECT p.parcelas from Pedidos as p where id_cliente = :idCliente and situacao = 'CREDITO'")
	public Integer getParcelaPedido(Integer idCliente);

	@Query(value="SELECT p.parcelas from Pedidos as p where id = :id")
	public Integer getParcelaPedidoBack(Integer id);
	
	@Query(value="SELECT p from Pedidos as p where id = :id")
	public Pedidos findByPedido(Integer id);

	@Query(value="SELECT p.situacao from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public String getSituacaoPedido(Integer idCliente);

	@Query(value="SELECT p.dia from Pedidos as p where id_cliente = :cliente  and situacao = 'CREDITO'")
	public LocalDate buscaDataPedido(Integer cliente);

	@Query(value="SELECT p.formaPagamento from Pedidos as p where id_cliente = :idCliente  and situacao = 'CREDITO'")
	public String buscaFormaPedido(Integer idCliente);

	@Transactional
	@Modifying
	@Query(value="UPDATE Pedidos as p set p.situacao ='APROVADO' where id = :id")
	public Integer aprova(Integer id);

	@Transactional
	@Modifying
	@Query(value="UPDATE Pedidos as p set p.situacao ='REPROVADO' where id = :id")
	public Integer reprova(Integer id);
}
