package com.example.demo.features.product.create;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class CreateProductHandler {

    private final ProductRepository productRepository;
    
    public Producto handle(Producto nuevoProducto){
       
        return productRepository.save(nuevoProducto);
    }
}
