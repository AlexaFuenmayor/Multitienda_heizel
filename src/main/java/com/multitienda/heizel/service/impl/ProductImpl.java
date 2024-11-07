package com.multitienda.heizel.service.impl;

import com.multitienda.heizel.model.dao.ProductoDao;
import com.multitienda.heizel.model.entity.Producto;
import com.multitienda.heizel.service.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProductImpl implements IProducto {

    @Autowired
    private ProductoDao productoDao;

    @Transactional(readOnly = false)
    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Transactional(readOnly = true)
    @Override
    public Producto findById(Integer id) {
        return productoDao.findById(id).orElse(null);
    }

    @Transactional(readOnly = false)
    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }
}
