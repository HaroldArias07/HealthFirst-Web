package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Carritos")
public class Carritos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_carrito;
	private String id_usuario_carrito;
	private String nombre_producto_carrito;
	private String cantidad_producto_carrito;
	private String precio_producto_carrito;
	private String monto_producto_carrito;
	private String imagen_producto_carrito;
	
	public int getId_carrito() {
		return id_carrito;
	}
	
	public void setId_carrito(int id_carrito) {
		this.id_carrito = id_carrito;
	}
	
	public String getId_usuario_carrito() {
		return id_usuario_carrito;
	}
	
	public void setId_usuario_carrito(String id_usuario_carrito) {
		this.id_usuario_carrito = id_usuario_carrito;
	}
	
	public String getNombre_producto_carrito() {
		return nombre_producto_carrito;
	}
	
	public void setNombre_producto_carrito(String nombre_producto_carrito) {
		this.nombre_producto_carrito = nombre_producto_carrito;
	}
	
	public String getCantidad_producto_carrito() {
		return cantidad_producto_carrito;
	}
	
	public void setCantidad_producto_carrito(String cantidad_producto_carrito) {
		this.cantidad_producto_carrito = cantidad_producto_carrito;
	}
	
	public String getPrecio_producto_carrito() {
		return precio_producto_carrito;
	}
	
	public void setPrecio_producto_carrito(String precio_producto_carrito) {
		this.precio_producto_carrito = precio_producto_carrito;
	}
	
	public String getMonto_producto_carrito() {
		return monto_producto_carrito;
	}
	
	public void setMonto_producto_carrito(String monto_producto_carrito) {
		this.monto_producto_carrito = monto_producto_carrito;
	}
	
	public String getImagen_producto_carrito() {
		return imagen_producto_carrito;
	}
	
	public void setImagen_producto_carrito(String imagen_producto_carrito) {
		this.imagen_producto_carrito = imagen_producto_carrito;
	}
	
	public Carritos(int id_carrito, String id_usuario_carrito, String nombre_producto_carrito,
			String cantidad_producto_carrito, String precio_producto_carrito, String monto_producto_carrito,
			String imagen_producto_carrito) {
		super();
		this.id_carrito = id_carrito;
		this.id_usuario_carrito = id_usuario_carrito;
		this.nombre_producto_carrito = nombre_producto_carrito;
		this.cantidad_producto_carrito = cantidad_producto_carrito;
		this.precio_producto_carrito = precio_producto_carrito;
		this.monto_producto_carrito = monto_producto_carrito;
		this.imagen_producto_carrito = imagen_producto_carrito;
	}
	
	public Carritos() {
		super();
	}
	
	@Override
	public String toString() {
		return "Carritos [id_carrito=" + id_carrito + ", id_usuario_carrito=" + id_usuario_carrito
				+ ", nombre_producto_carrito=" + nombre_producto_carrito + ", cantidad_producto_carrito="
				+ cantidad_producto_carrito + ", precio_producto_carrito=" + precio_producto_carrito
				+ ", monto_producto_carrito=" + monto_producto_carrito + ", imagen_producto_carrito="
				+ imagen_producto_carrito + "]";
	}
	
}
