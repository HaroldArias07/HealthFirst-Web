package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Carritos;

public interface ICarritoService {
	
	public List<Carritos>listar();
	
	public Optional<Carritos>listarId(int id_carrito);
	
	public int save(Carritos ca);
	
	public void delete(int id_carrito);
}
