package com.essentials.demo.models.service;

import java.util.List;

import com.essentials.demo.models.entity.Usuarios;

public interface IUsuarioService {
	
	public Usuarios findByUsername(String username);
	public Usuarios registrar(Usuarios u);
	
	public List<Usuarios>listar();
	public int save(Usuarios u);
	public void delete(Long id);
}
