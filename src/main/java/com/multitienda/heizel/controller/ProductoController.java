package com.multitienda.heizel.controller;

import com.multitienda.heizel.model.entity.Producto;
import com.multitienda.heizel.service.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {
    @Autowired
    private IProducto productoService;

    @PostMapping("producto")
    public Producto create(@RequestBody Producto producto){
       return productoService.save(producto);
    }
    @PutMapping("producto")
    public Producto update(@RequestBody Producto producto){
        return productoService.save(producto);
    }
    @DeleteMapping("producto/{id}")
    public void delete(@PathVariable Integer id){
        Producto productoDelete = productoService.findById(id);
        productoService.delete(productoDelete);
    }

    @GetMapping("producto/{id}")
    public Producto showById(@PathVariable Integer id){
        return productoService.findById(id);
    }



}
