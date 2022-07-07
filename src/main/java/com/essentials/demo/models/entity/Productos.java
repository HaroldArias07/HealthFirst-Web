package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_producto;
	private String nombre_producto;
	private double precio_producto;
	private int stock_producto;
	private String categoria_producto;
	private String tipo_producto;
	private String descripcion_producto;
	private String imagen_producto;

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public double getPrecio_producto() {
		return precio_producto;
	}

	public void setPrecio_producto(double precio_producto) {
		this.precio_producto = precio_producto;
	}

	public int getStock_producto() {
		return stock_producto;
	}

	public void setStock_producto(int stock_producto) {
		this.stock_producto = stock_producto;
	}

	public String getCategoria_producto() {
		return categoria_producto;
	}

	public void setCategoria_producto(String categoria_producto) {
		this.categoria_producto = categoria_producto;
	}

	public String getTipo_producto() {
		return tipo_producto;
	}

	public void setTipo_producto(String tipo_producto) {
		this.tipo_producto = tipo_producto;
	}

	public String getDescripcion_producto() {
		return descripcion_producto;
	}

	public void setDescripcion_producto(String descripcion_producto) {
		this.descripcion_producto = descripcion_producto;
	}

	public String getImagen_producto() {
		return imagen_producto;
	}

	public void setImagen_producto(String imagen_producto) {
		this.imagen_producto = imagen_producto;
	}

	public Productos(int id_producto, String nombre_producto, double precio_producto, int stock_producto,
			String categoria_producto, String tipo_producto, String descripcion_producto, String imagen_producto) {
		super();
		this.id_producto = id_producto;
		this.nombre_producto = nombre_producto;
		this.precio_producto = precio_producto;
		this.stock_producto = stock_producto;
		this.categoria_producto = categoria_producto;
		this.tipo_producto = tipo_producto;
		this.descripcion_producto = descripcion_producto;
		this.imagen_producto = imagen_producto;
	}

	public Productos() {
		super();
	}

	@Override
	public String toString() {
		return "Productos [id_producto=" + id_producto + ", nombre_producto=" + nombre_producto + ", precio_producto="
				+ precio_producto + ", stock_producto=" + stock_producto + ", categoria_producto=" + categoria_producto
				+ ", tipo_producto=" + tipo_producto + ", descripcion_producto=" + descripcion_producto
				+ ", imagen_producto=" + imagen_producto + "]";
	}
	
}
