package com.auth0.samples.bootfaces.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.auth0.samples.bootfaces.dto.Producto;

@Repository
public interface IProductoDao extends CrudRepository<Producto, Integer>{

}
