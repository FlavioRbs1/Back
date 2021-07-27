package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

	Object findByCpf(String cpf);
}
