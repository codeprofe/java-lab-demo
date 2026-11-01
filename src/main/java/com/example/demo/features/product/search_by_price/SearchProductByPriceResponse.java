package com.example.demo.features.product.search_by_price;

import com.example.demo.features.product.domain.Producto;

/**
 * SearchProductByPriceResponse
 */
public record SearchProductByPriceResponse(Long id, String title, Double price){
    
     // Factory method estático
    public static SearchProductByPriceResponse fromEntity(Producto p) {
        return new SearchProductByPriceResponse(p.getId(), p.getTitulo(), p.getPrecio());
    }
}
