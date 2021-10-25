package com.Repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Model.Analise;

@Repository
public interface AnaliseRepository extends JpaRepository<Analise,Integer> {

	@Query(value="SELECT a.id FROM Analise as a WHERE id_cliente = :idCliente and id_pedidos = :idPedido")
	public Object findAnaliseByPedidoCliente(Integer idPedido, Integer idCliente);

	@Transactional
	@Modifying
	@Query(value="UPDATE Analise set concessao =:concessao, situacao='APROVADO SOB CONCESSAO' where id =:id")
	Object liberaSobConcessao(Integer id,String concessao);

	@Query(value="SELECT count(*) as qtd from Analise where situacao ='APROVADO'")
	public List<Integer> getAprovados();

	@Query(value="SELECT count(*) as qtd from Analise where situacao ='REPROVADO'")
	public Integer getReprovados();

	@Query(value="SELECT count(*) as qtd from Analise where situacao ='APROVADO SOB CONCESSAO'")
	public Integer getsobConcessao();



	
}
