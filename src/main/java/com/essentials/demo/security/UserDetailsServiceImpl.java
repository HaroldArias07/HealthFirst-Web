package com.essentials.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.IUsuarioDAO;
import com.essentials.demo.models.entity.Usuarios;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private IUsuarioDAO usuarioDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios usuarios = usuarioDao.findByUsername(username);
		UserBuilder builder = null;
		
		if(usuarios != null) {
			builder = User.withUsername(username);
			builder.disabled(false);
			builder.password(usuarios.getPassword());
			builder.authorities(new SimpleGrantedAuthority("ROLE_USER"));
		}
		else {
			throw new UsernameNotFoundException("Usuario no encontrado");
		}
		
		return builder.build();
	}
	
}
