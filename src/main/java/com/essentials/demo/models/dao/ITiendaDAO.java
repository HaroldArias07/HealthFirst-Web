package com.essentials.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.essentials.demo.models.entity.Tiendas;

@Repository
public interface ITiendaDAO extends CrudRepository<Tiendas, Integer>{

}
