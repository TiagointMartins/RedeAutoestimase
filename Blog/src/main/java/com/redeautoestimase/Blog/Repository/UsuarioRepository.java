package com.redeautoestimase.Blog.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redeautoestimase.Blog.Model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);
}
