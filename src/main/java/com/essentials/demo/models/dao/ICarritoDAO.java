package com.essentials.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.essentials.demo.models.entity.Carritos;

@Repository
public interface ICarritoDAO extends CrudRepository<Carritos, Integer>{

}
