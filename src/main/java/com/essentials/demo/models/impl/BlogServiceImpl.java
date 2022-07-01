package com.essentials.demo.models.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.essentials.demo.models.dao.IBlogDAO;
import com.essentials.demo.models.entity.Blogs;
import com.essentials.demo.models.service.IBlogService;

@Service
public class BlogServiceImpl implements IBlogService {

	@Autowired
	private IBlogDAO blogDao;
		
	@Override
	public List<Blogs> listar() {
		return (List<Blogs>)blogDao.findAll();
	}

	@Override
	public Optional<Blogs> listarId(int id_blog) {
		return blogDao.findById(id_blog);
	}

	@Override
	public int save(Blogs b) {
		int res=0;
		Blogs blogs = blogDao.save(b);
		if(!blogs.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id_blog) {
		blogDao.deleteById(id_blog);
	}

}
