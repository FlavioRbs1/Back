package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.Model.Inadimplencias;


public interface InadimplenciasRepository extends JpaRepository<Inadimplencias,Integer> {


	@Query(value ="SELECT count(*) from Inadimplencias where id_cliente = :idCliente")
	public Integer findByCliente(Integer idCliente);
	
	
}
