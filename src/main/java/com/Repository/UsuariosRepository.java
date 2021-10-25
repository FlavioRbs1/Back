package com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {

	Optional<Usuarios>findByLogin(String login);

}
