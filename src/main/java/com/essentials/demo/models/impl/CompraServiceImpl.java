package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.ICompraDAO;
import com.essentials.demo.models.entity.Compras;
import com.essentials.demo.models.service.ICompraService;

@Service
public class CompraServiceImpl implements ICompraService {

	@Autowired
	private ICompraDAO compraDao;
		
	@Override
	public List<Compras> listar() {
		return (List<Compras>)compraDao.findAll();
	}

	@Override
	public Optional<Compras> listarId(int id_compra) {
		return compraDao.findById(id_compra);
	}

	@Override
	public int save(Compras com) {
		int res=0;
		Compras compras = compraDao.save(com);
		if(!compras.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_compra) {
		compraDao.deleteById(id_compra);
	}

}
