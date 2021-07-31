package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Model.Usuarios;

public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {

}
