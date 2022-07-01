package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tiendas")
public class Tiendas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tienda;
	private String nombre_tienda;
	private String direccion_tienda;
	private String distrito_tienda;
	private String pais_tienda;
	private String imagen_tienda;

	public int getId_tienda() {
		return id_tienda;
	}

	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}

	public String getNombre_tienda() {
		return nombre_tienda;
	}

	public void setNombre_tienda(String nombre_tienda) {
		this.nombre_tienda = nombre_tienda;
	}

	public String getDireccion_tienda() {
		return direccion_tienda;
	}

	public void setDireccion_tienda(String direccion_tienda) {
		this.direccion_tienda = direccion_tienda;
	}

	public String getDistrito_tienda() {
		return distrito_tienda;
	}

	public void setDistrito_tienda(String distrito_tienda) {
		this.distrito_tienda = distrito_tienda;
	}

	public String getPais_tienda() {
		return pais_tienda;
	}

	public void setPais_tienda(String pais_tienda) {
		this.pais_tienda = pais_tienda;
	}

	public String getImagen_tienda() {
		return imagen_tienda;
	}

	public void setImagen_tienda(String imagen_tienda) {
		this.imagen_tienda = imagen_tienda;
	}

	public Tiendas(int id_tienda, String nombre_tienda, String direccion_tienda, String distrito_tienda,
			String pais_tienda, String imagen_tienda) {
		super();
		this.id_tienda = id_tienda;
		this.nombre_tienda = nombre_tienda;
		this.direccion_tienda = direccion_tienda;
		this.distrito_tienda = distrito_tienda;
		this.pais_tienda = pais_tienda;
		this.imagen_tienda = imagen_tienda;
	}

	public Tiendas() {
		super();
	}
	
	
	
}
