package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Testimonios;

public interface ITestimonioService {
	
	public List<Testimonios>listar();
	
	public Optional<Testimonios>listarId(int id_testimonio);
	
	public int save(Testimonios ts);
	
	public void delete(int id_testimonio);
}
