package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Contactos;

public interface IContactoService {
	
	public List<Contactos>listar();
	
	public Optional<Contactos>listarId(int id_producto);
	
	public int save(Contactos con);
	
	public void delete(int id_contacto);
}
