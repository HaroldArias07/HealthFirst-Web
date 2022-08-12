package com.essentials.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.essentials.demo.models.entity.Compras;

@Repository
public interface ICompraDAO extends CrudRepository<Compras, Integer>{

}
