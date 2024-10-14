package com.multitienda.heizel.model.dao;

import com.multitienda.heizel.model.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Producto,Integer> {
}
