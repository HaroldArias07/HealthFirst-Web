package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Productos;

public interface IProductoService {
	
	public List<Productos>listar();
	
	public Optional<Productos>listarId(int id_producto);
	
	public int save(Productos p);
	
	public void delete(int id_producto);
}
