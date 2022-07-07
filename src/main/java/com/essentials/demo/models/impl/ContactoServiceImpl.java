package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.IContactoDAO;
import com.essentials.demo.models.entity.Contactos;
import com.essentials.demo.models.service.IContactoService;

@Service
public class ContactoServiceImpl implements IContactoService {

	@Autowired
	private IContactoDAO contactoDao;
		
	@Override
	public List<Contactos> listar() {
		return (List<Contactos>)contactoDao.findAll();
	}

	@Override
	public Optional<Contactos> listarId(int id_contacto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Contactos con) {
		int res=0;
		Contactos carrusels = contactoDao.save(con);
		if(!carrusels.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_contacto) {
		contactoDao.deleteById(id_contacto);
	}

}
