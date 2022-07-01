package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Carrusels;

public interface ICarruselService {
	
	public List<Carrusels>listar();
	
	public Optional<Carrusels>listarId(int id_carrusel);
	
	public int save(Carrusels b);
	
	public void delete(int id_carrusel);
}
