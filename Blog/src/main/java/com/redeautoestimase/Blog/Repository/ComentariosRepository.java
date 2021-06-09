package com.redeautoestimase.Blog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redeautoestimase.Blog.Model.Comentarios;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentarios, Long>{
	public List<Comentarios> findAllByTextoContainingIgnoreCase(String texto);
}