package com.essentials.demo.models.service;

import java.util.List;
import java.util.Optional;

import com.essentials.demo.models.entity.Blogs;

public interface IBlogService {
	
	public List<Blogs>listar();
	
	public Optional<Blogs>listarId(int id_blog);
	
	public int save(Blogs b);
	
	public void delete(int id_blog);
}
