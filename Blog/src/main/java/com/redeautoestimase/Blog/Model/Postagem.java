package com.redeautoestimase.Blog.Model;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
	
@Entity
@Table(name = "postagem")
public class Postagem {
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String fotoPostagem;

	@NotNull
	@Size(min = 3, max = 50)
	private String titulo;
	
	@NotNull
	@Size(min = 3)
	private String texto;
	
	@NotNull
	@Size(min = 3)
	private String nomeAutor;
	
	@NotNull
	@Size(min = 3)
	private String sobreAutor;
	
	@NotNull
	@Size(min = 3)
	private String fotoAutor;
	 
	@Temporal(TemporalType.TIMESTAMP)
	private Date date =  new java.sql.Date(System.currentTimeMillis());
	
	@OneToMany(mappedBy = "postagem", cascade = CascadeType.PERSIST)
	@JsonIgnoreProperties("postagem")
	private List<Comentarios> comentarios;
			
	@ManyToOne
	@JsonIgnoreProperties("postagem") 
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("postegem")
	private Usuario usuario;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFotoPostagem() {
		return fotoPostagem;
	}

	public void setFotoPostagem(String fotoPostagem) {
		this.fotoPostagem = fotoPostagem;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public String getSobreAutor() {
		return sobreAutor;
	}

	public void setSobreAutor(String sobreAutor) {
		this.sobreAutor = sobreAutor;
	}

	public String getFotoAutor() {
		return fotoAutor;
	}

	public void setFotoAutor(String fotoAutor) {
		this.fotoAutor = fotoAutor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	
}
