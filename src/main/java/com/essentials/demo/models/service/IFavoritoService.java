package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Favoritos;

public interface IFavoritoService {
	
	public List<Favoritos>listar();
	
	public Optional<Favoritos>listarId(int id_favorito);
	
	public int save(Favoritos f);
	
	public void delete(int id_favorito);
}
