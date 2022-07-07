package com.essentials.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contactos")
public class Contactos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_contacto;
	private String nombre_contacto;
	private String correo_contacto;
	private String telefono_contacto;
	private String mensaje_contacto;
	private String fecha_contacto;
	private String estado_contacto;
	
	public int getId_contacto() {
		return id_contacto;
	}
	
	public void setId_contacto(int id_contacto) {
		this.id_contacto = id_contacto;
	}
	
	public String getNombre_contacto() {
		return nombre_contacto;
	}
	
	public void setNombre_contacto(String nombre_contacto) {
		this.nombre_contacto = nombre_contacto;
	}
	
	public String getCorreo_contacto() {
		return correo_contacto;
	}
	
	public void setCorreo_contacto(String correo_contacto) {
		this.correo_contacto = correo_contacto;
	}
	
	public String getTelefono_contacto() {
		return telefono_contacto;
	}
	
	public void setTelefono_contacto(String telefono_contacto) {
		this.telefono_contacto = telefono_contacto;
	}
	
	public String getMensaje_contacto() {
		return mensaje_contacto;
	}
	
	public void setMensaje_contacto(String mensaje_contacto) {
		this.mensaje_contacto = mensaje_contacto;
	}
	
	public String getFecha_contacto() {
		return fecha_contacto;
	}
	
	public void setFecha_contacto(String fecha_contacto) {
		this.fecha_contacto = fecha_contacto;
	}
	
	public String getEstado_contacto() {
		return estado_contacto;
	}
	
	public void setEstado_contacto(String estado_contacto) {
		this.estado_contacto = estado_contacto;
	}

	public Contactos(int id_contacto, String nombre_contacto, String correo_contacto, String telefono_contacto,
			String mensaje_contacto, String fecha_contacto, String estado_contacto) {
		super();
		this.id_contacto = id_contacto;
		this.nombre_contacto = nombre_contacto;
		this.correo_contacto = correo_contacto;
		this.telefono_contacto = telefono_contacto;
		this.mensaje_contacto = mensaje_contacto;
		this.fecha_contacto = fecha_contacto;
		this.estado_contacto = estado_contacto;
	}

	public Contactos() {
		super();
	}

	@Override
	public String toString() {
		return "Contactos [id_contacto=" + id_contacto + ", nombre_contacto=" + nombre_contacto + ", correo_contacto="
				+ correo_contacto + ", telefono_contacto=" + telefono_contacto + ", mensaje_contacto="
				+ mensaje_contacto + ", fecha_contacto=" + fecha_contacto + ", estado_contacto=" + estado_contacto
				+ "]";
	}

}
