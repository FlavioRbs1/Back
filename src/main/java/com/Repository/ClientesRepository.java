package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente,Integer>{

}
