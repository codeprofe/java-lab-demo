package com.example.demo.features.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "productos")
public class Producto{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private Double precio;

    public Producto(){}

    public Producto(String titulo, Double precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Double getPrecio(){
        return this.precio;
    }

    public void setPrecio(Double precio){
        this.precio = precio;
    }
}