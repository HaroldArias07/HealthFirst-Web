package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.ITiendaDAO;
import com.essentials.demo.models.entity.Tiendas;
import com.essentials.demo.models.service.ITiendaService;

@Service
public class TiendaServiceImpl implements ITiendaService {

	@Autowired
	private ITiendaDAO tiendaDao;
		
	@Override
	public List<Tiendas> listar() {
		return (List<Tiendas>)tiendaDao.findAll();
	}

	@Override
	public Optional<Tiendas> listarId(int id_tienda) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Tiendas t) {
		int res=0;
		Tiendas tiendas = tiendaDao.save(t);
		if(!tiendas.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_tienda) {
		tiendaDao.deleteById(id_tienda);
	}

}
