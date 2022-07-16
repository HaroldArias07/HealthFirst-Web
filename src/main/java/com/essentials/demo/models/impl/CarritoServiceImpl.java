package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.ICarritoDAO;
import com.essentials.demo.models.entity.Carritos;
import com.essentials.demo.models.service.ICarritoService;

@Service
public class CarritoServiceImpl implements ICarritoService {

	@Autowired
	private ICarritoDAO carritoDao;
		
	@Override
	public List<Carritos> listar() {
		return (List<Carritos>)carritoDao.findAll();
	}

	@Override
	public Optional<Carritos> listarId(int id_carrito) {
		return carritoDao.findById(id_carrito);
	}

	@Override
	public int save(Carritos ca) {
		int res=0;
		Carritos carritos = carritoDao.save(ca);
		if(!carritos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_carrito) {
		carritoDao.deleteById(id_carrito);
	}

}
