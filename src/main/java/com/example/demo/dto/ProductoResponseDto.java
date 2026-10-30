package com.example.demo.dto;

import com.example.demo.model.Producto;

public record ProductoResponseDto(
    Long id,
    String titulo,
    Double precio
){
    // Factory method estático
    public static ProductoResponseDto fromEntity(Producto p) {
        return new ProductoResponseDto(p.getId(), p.getTitulo(), p.getPrecio());
    }
}
