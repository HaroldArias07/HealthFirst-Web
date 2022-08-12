package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Compras;

public interface ICompraService {
	
	public List<Compras>listar();
	
	public Optional<Compras>listarId(int id_compra);
	
	public int save(Compras com);
	
	public void delete(int id_compra);
}
