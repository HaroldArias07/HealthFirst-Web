package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carrusels")
public class Carrusels {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_carrusel;
	private String titulo_carrusel;
	private String descripcion_carrusel;
	private String imagen_carrusel;

	public int getId_carrusel() {
		return id_carrusel;
	}

	public void setId_carrusel(int id_carrusel) {
		this.id_carrusel = id_carrusel;
	}

	public String getTitulo_carrusel() {
		return titulo_carrusel;
	}

	public void setTitulo_carrusel(String titulo_carrusel) {
		this.titulo_carrusel = titulo_carrusel;
	}

	public String getDescripcion_carrusel() {
		return descripcion_carrusel;
	}

	public void setDescripcion_carrusel(String descripcion_carrusel) {
		this.descripcion_carrusel = descripcion_carrusel;
	}

	public String getImagen_carrusel() {
		return imagen_carrusel;
	}

	public void setImagen_carrusel(String imagen_carrusel) {
		this.imagen_carrusel = imagen_carrusel;
	}

	public Carrusels(int id_carrusel, String titulo_carrusel, String descripcion_carrusel, String imagen_carrusel) {
		super();
		this.id_carrusel = id_carrusel;
		this.titulo_carrusel = titulo_carrusel;
		this.descripcion_carrusel = descripcion_carrusel;
		this.imagen_carrusel = imagen_carrusel;
	}

	public Carrusels() {
		super();
	}
	
	
	
}
