package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Compras")
public class Compras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_compra;
	private String id_usuario_compra;
	private String productos_compra;
	private String precio_compra;
	private String metodo_pago_compra;
	private String estado_compra;
	
	public int getId_compra() {
		return id_compra;
	}
	
	public void setId_compra(int id_compra) {
		this.id_compra = id_compra;
	}
	
	public String getId_usuario_compra() {
		return id_usuario_compra;
	}
	
	public void setId_usuario_compra(String id_usuario_compra) {
		this.id_usuario_compra = id_usuario_compra;
	}
	
	public String getProductos_compra() {
		return productos_compra;
	}
	
	public void setProductos_compra(String productos_compra) {
		this.productos_compra = productos_compra;
	}
	
	public String getPrecio_compra() {
		return precio_compra;
	}
	
	public void setPrecio_compra(String precio_compra) {
		this.precio_compra = precio_compra;
	}
	
	public String getMetodo_pago_compra() {
		return metodo_pago_compra;
	}
	
	public void setMetodo_pago_compra(String metodo_pago_compra) {
		this.metodo_pago_compra = metodo_pago_compra;
	}
	
	public String getEstado_compra() {
		return estado_compra;
	}
	
	public void setEstado_compra(String estado_compra) {
		this.estado_compra = estado_compra;
	}
	
	public Compras(int id_compra, String id_usuario_compra, String productos_compra, String precio_compra,
			String metodo_pago_compra, String estado_compra) {
		super();
		this.id_compra = id_compra;
		this.id_usuario_compra = id_usuario_compra;
		this.productos_compra = productos_compra;
		this.precio_compra = precio_compra;
		this.metodo_pago_compra = metodo_pago_compra;
		this.estado_compra = estado_compra;
	}
	
	public Compras() {
		super();
	}
	
	@Override
	public String toString() {
		return "Compras [id_compra=" + id_compra + ", id_usuario_compra=" + id_usuario_compra + ", productos_compra="
				+ productos_compra + ", precio_compra=" + precio_compra + ", metodo_pago_compra=" + metodo_pago_compra
				+ ", estado_compra=" + estado_compra + "]";
	}
}
