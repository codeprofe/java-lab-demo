package com.example.demo.features.product.get_by_id;

import com.example.demo.features.product.domain.Producto;


public record GetProductByIdResponse (Long id, String title, Double price){
    
     // Factory method estático
    public static GetProductByIdResponse fromEntity(Producto p) {
        return new GetProductByIdResponse(p.getId(), p.getTitulo(), p.getPrecio());
    }
}
