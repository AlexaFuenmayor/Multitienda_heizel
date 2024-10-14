package com.multitienda.heizel.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "productos")
public class Producto implements Serializable {


    @Id
    @Column(name= "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Column(name= "producto")
    private String nombreProducto;

    @Column(name= "cantidad")
    private  Integer cantidadProducto;

    @Column(name= "costo_producto")
    private Double costoProducto;

    @Column(name= "precio")
    private Double precioProducto;

    @Column(name= "descripcion")
    private String description;
}


