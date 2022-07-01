package com.essentials.demo.models.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import com.essentials.demo.models.dao.IUsuarioDAO;
import com.essentials.demo.models.entity.Usuarios;
import com.essentials.demo.models.service.IUsuarioService;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	public List<Usuarios> listar() {
		return (List<Usuarios>)usuarioDao.findAll();
	}
	
	@Override
	public Usuarios findByUsername(String username) {
		return usuarioDao.findByUsername(username);
	}
	
	@Override
	public Usuarios registrar(Usuarios u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return usuarioDao.save(u);
	}

	@Override
	public int save(Usuarios u) {
		int res=0;
		Usuarios usuarios = usuarioDao.save(u);
		if(!usuarios.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}
}
