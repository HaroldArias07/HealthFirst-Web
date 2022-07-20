package com.essentials.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.essentials.demo.models.entity.Favoritos;

@Repository
public interface IFavoritoDAO extends CrudRepository<Favoritos, Integer>{

}
