package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Favoritos")
public class Favoritos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_favorito;
	private String id_usuario_favorito;
	private String nombre_producto_favorito;
	private String precio_producto_favorito;
	private String imagen_producto_favorito;
	
	public int getId_favorito() {
		return id_favorito;
	}
	
	public void setId_favorito(int id_favorito) {
		this.id_favorito = id_favorito;
	}
	
	public String getId_usuario_favorito() {
		return id_usuario_favorito;
	}
	
	public void setId_usuario_favorito(String id_usuario_favorito) {
		this.id_usuario_favorito = id_usuario_favorito;
	}
	
	public String getNombre_producto_favorito() {
		return nombre_producto_favorito;
	}
	
	public void setNombre_producto_favorito(String nombre_producto_favorito) {
		this.nombre_producto_favorito = nombre_producto_favorito;
	}
	
	public String getPrecio_producto_favorito() {
		return precio_producto_favorito;
	}
	
	public void setPrecio_producto_favorito(String precio_producto_favorito) {
		this.precio_producto_favorito = precio_producto_favorito;
	}
	
	public String getImagen_producto_favorito() {
		return imagen_producto_favorito;
	}
	
	public void setImagen_producto_favorito(String imagen_producto_favorito) {
		this.imagen_producto_favorito = imagen_producto_favorito;
	}
	
	public Favoritos(int id_favorito, String id_usuario_favorito, String nombre_producto_favorito,
			String precio_producto_favorito, String imagen_producto_favorito) {
		super();
		this.id_favorito = id_favorito;
		this.id_usuario_favorito = id_usuario_favorito;
		this.nombre_producto_favorito = nombre_producto_favorito;
		this.precio_producto_favorito = precio_producto_favorito;
		this.imagen_producto_favorito = imagen_producto_favorito;
	}
	
	public Favoritos() {
		super();
	}
	
	@Override
	public String toString() {
		return "Favoritos [id_favorito=" + id_favorito + ", id_usuario_favorito=" + id_usuario_favorito
				+ ", nombre_producto_favorito=" + nombre_producto_favorito + ", precio_producto_favorito="
				+ precio_producto_favorito + ", imagen_producto_favorito=" + imagen_producto_favorito + "]";
	}
}
