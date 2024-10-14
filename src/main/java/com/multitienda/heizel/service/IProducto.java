package com.multitienda.heizel.service;

import com.multitienda.heizel.model.entity.Producto;

public interface IProducto {
    Producto save(Producto producto);

    Producto findById(Integer id);

    void delete(Producto producto);
}
