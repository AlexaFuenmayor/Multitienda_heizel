package com.multitienda.heizel.controller;

import com.multitienda.heizel.model.entity.Producto;
import com.multitienda.heizel.service.IProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class ProductoController {
    @Autowired
    private IProducto productoService;

    @PostMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody Producto producto){
       return productoService.save(producto);
    }
    @PutMapping("producto")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto){
        return productoService.save(producto);
    }
    @DeleteMapping("producto/{id}")

    public ResponseEntity<?> delete(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();


        try{
            Producto productoDelete = productoService.findById(id);
            productoService.delete(productoDelete);
            return new ResponseEntity<>(productoDelete, HttpStatus.NO_CONTENT);

        }catch(DataAccessException exDt){

            response.put("mensaje", exDt.getMessage());
            response.put("producto", null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("producto/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Producto showById(@PathVariable Integer id){
        return productoService.findById(id);
    }



}
