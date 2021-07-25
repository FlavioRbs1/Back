package com.Repository;

import com.Model.Cliente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	List<Cliente> findByCpf(String cpf);
	
	@Query(value = "select s from Cliente as s where s.cpf = ?1")
	Cliente buscarPorCpf(String cpf);


}
