package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.IFavoritoDAO;
import com.essentials.demo.models.entity.Favoritos;
import com.essentials.demo.models.service.IFavoritoService;

@Service
public class FavoritoServiceImpl implements IFavoritoService {

	@Autowired
	private IFavoritoDAO favoritoDao;
		
	@Override
	public List<Favoritos> listar() {
		return (List<Favoritos>)favoritoDao.findAll();
	}

	@Override
	public Optional<Favoritos> listarId(int id_favorito) {
		return favoritoDao.findById(id_favorito);
	}

	@Override
	public int save(Favoritos f) {
		int res=0;
		Favoritos favoritos = favoritoDao.save(f);
		if(!favoritos.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_favorito) {
		favoritoDao.deleteById(id_favorito);
	}

}
