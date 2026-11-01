package com.example.demo.features.product.update;

import com.example.demo.features.product.domain.Producto;

public record UpdateProductResponse (Long id, String title, Double price){
    
     // Factory method estático
    public static UpdateProductResponse fromEntity(Producto p) {
        return new UpdateProductResponse(p.getId(), p.getTitulo(), p.getPrecio());
    }
}
