package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Pedidos;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer> {

}
