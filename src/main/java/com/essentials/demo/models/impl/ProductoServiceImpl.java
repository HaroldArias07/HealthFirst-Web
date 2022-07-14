package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.IProductoDAO;
import com.essentials.demo.models.entity.Productos;
import com.essentials.demo.models.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDAO productoDao;
		
	@Override
	public List<Productos> listar() {
		return (List<Productos>)productoDao.findAll();
	}

	@Override
	public Optional<Productos> listarId(int id_producto) {
		return productoDao.findById(id_producto);
	}

	@Override
	public int save(Productos p) {
		int res=0;
		Productos productos = productoDao.save(p);
		if(!productos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_producto) {
		productoDao.deleteById(id_producto);
	}

}
