package com.example.demo.features.product.create;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

@Service 
public class CreateProductHandler {

    private ProductRepository productRepository;
    
    public CreateProductHandler(ProductRepository repo) {
        this.productRepository = repo;
    }

    
    public Producto handle(Producto nuevoProducto){
       
        return productRepository.save(nuevoProducto);
    }
}
