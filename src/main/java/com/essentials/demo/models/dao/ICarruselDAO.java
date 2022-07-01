package com.essentials.demo.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.essentials.demo.models.entity.Carrusels;

@Repository
public interface ICarruselDAO extends CrudRepository<Carrusels, Integer>{

}
