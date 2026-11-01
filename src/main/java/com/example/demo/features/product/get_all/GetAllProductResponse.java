package com.example.demo.features.product.get_all;

import com.example.demo.features.product.domain.Producto;


public record GetAllProductResponse (Long id, String title, Double price){
    
     // Factory method estático
    public static GetAllProductResponse fromEntity(Producto p) {
        return new GetAllProductResponse(p.getId(), p.getTitulo(), p.getPrecio());
    }
}
