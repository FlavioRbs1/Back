package com.Repository;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

	Object findByCpf(String cpf);


	
	@Query(value="SELECT c from Cliente c where c.id = :id")
	public Cliente buscaId(Integer id);
	
	@Query(value="SELECT c.renda from Cliente as c where c.id = :id")
	public Double getRenda(Integer id);


}
