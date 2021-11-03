package com.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Integer> {

	Optional<Usuarios>findByLogin(String login);

	@Query(value="SELECT u.tipoUser from Usuarios as u where u.login = :login")
	public String getLogin(String login);

	@Query(value="SELECT u.senha from Usuarios as u where u.login = :login")
	public String getSenha(String login);

	@Query(value="SELECT u.user from Usuarios as u where u.login = :login")
	public String getNome(String login);

}
