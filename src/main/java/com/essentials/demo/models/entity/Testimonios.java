package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Testimonios")
public class Testimonios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_testimonio;
	private String descripcion_testimonio;
	private String usuario_testimonio;
	private String imagen_testimonio;
	private String fecha_testimonio;
	private String rol_testimonio;

	public int getId_testimonio() {
		return id_testimonio;
	}

	public void setId_testimonio(int id_testimonio) {
		this.id_testimonio = id_testimonio;
	}

	public String getDescripcion_testimonio() {
		return descripcion_testimonio;
	}

	public void setDescripcion_testimonio(String descripcion_testimonio) {
		this.descripcion_testimonio = descripcion_testimonio;
	}

	public String getUsuario_testimonio() {
		return usuario_testimonio;
	}

	public void setUsuario_testimonio(String usuario_testimonio) {
		this.usuario_testimonio = usuario_testimonio;
	}

	public String getImagen_testimonio() {
		return imagen_testimonio;
	}

	public void setImagen_testimonio(String imagen_testimonio) {
		this.imagen_testimonio = imagen_testimonio;
	}

	public String getFecha_testimonio() {
		return fecha_testimonio;
	}

	public void setFecha_testimonio(String fecha_testimonio) {
		this.fecha_testimonio = fecha_testimonio;
	}

	public String getRol_testimonio() {
		return rol_testimonio;
	}

	public void setRol_testimonio(String rol_testimonio) {
		this.rol_testimonio = rol_testimonio;
	}

	public Testimonios(int id_testimonio, String descripcion_testimonio, String usuario_testimonio,
			String imagen_testimonio, String fecha_testimonio, String rol_testimonio) {
		super();
		this.id_testimonio = id_testimonio;
		this.descripcion_testimonio = descripcion_testimonio;
		this.usuario_testimonio = usuario_testimonio;
		this.imagen_testimonio = imagen_testimonio;
		this.fecha_testimonio = fecha_testimonio;
		this.rol_testimonio = rol_testimonio;
	}

	public Testimonios() {
		super();
	}

	@Override
	public String toString() {
		return "Testimonios [id_testimonio=" + id_testimonio + ", descripcion_testimonio=" + descripcion_testimonio
				+ ", usuario_testimonio=" + usuario_testimonio + ", imagen_testimonio=" + imagen_testimonio
				+ ", fecha_testimonio=" + fecha_testimonio + ", rol_testimonio=" + rol_testimonio + "]";
	}
	
}
