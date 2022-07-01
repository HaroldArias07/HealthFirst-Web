package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Tiendas;

public interface ITiendaService {
	
	public List<Tiendas>listar();
	
	public Optional<Tiendas>listarId(int id_tienda);
	
	public int save(Tiendas t);
	
	public void delete(int id_tienda);
}
