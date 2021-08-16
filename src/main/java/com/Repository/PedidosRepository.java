package com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer> {

	Optional<Pedidos> findById(Integer id);
}
