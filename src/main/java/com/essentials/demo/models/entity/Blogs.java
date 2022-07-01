package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Blogs")
public class Blogs {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_blog;
	private String titulo_blog;
	private String descripcion_blog;
	private String fecha_blog;
	private String idioma_blog;
	private String rol_blog;
	private String imagen_blog;

	public int getId_blog() {
		return id_blog;
	}

	public void setId_blog(int id_blog) {
		this.id_blog = id_blog;
	}

	public String getTitulo_blog() {
		return titulo_blog;
	}

	public void setTitulo_blog(String titulo_blog) {
		this.titulo_blog = titulo_blog;
	}

	public String getDescripcion_blog() {
		return descripcion_blog;
	}

	public void setDescripcion_blog(String descripcion_blog) {
		this.descripcion_blog = descripcion_blog;
	}

	public String getFecha_blog() {
		return fecha_blog;
	}

	public void setFecha_blog(String fecha_blog) {
		this.fecha_blog = fecha_blog;
	}

	public String getIdioma_blog() {
		return idioma_blog;
	}

	public void setIdioma_blog(String idioma_blog) {
		this.idioma_blog = idioma_blog;
	}

	public String getRol_blog() {
		return rol_blog;
	}

	public void setRol_blog(String rol_blog) {
		this.rol_blog = rol_blog;
	}

	public String getImagen_blog() {
		return imagen_blog;
	}

	public void setImagen_blog(String imagen_blog) {
		this.imagen_blog = imagen_blog;
	}

	public Blogs(int id_blog, String titulo_blog, String descripcion_blog, String fecha_blog, String idioma_blog,
			String rol_blog, String imagen_blog) {
		super();
		this.id_blog = id_blog;
		this.titulo_blog = titulo_blog;
		this.descripcion_blog = descripcion_blog;
		this.fecha_blog = fecha_blog;
		this.idioma_blog = idioma_blog;
		this.rol_blog = rol_blog;
		this.imagen_blog = imagen_blog;
	}

	public Blogs() {
		super();
	}
	
	
	
}
