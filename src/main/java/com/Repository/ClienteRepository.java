package com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import com.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

	Object findByCpf(String cpf);


	Optional<Cliente> findById(Cliente cliente);
	

	


}
