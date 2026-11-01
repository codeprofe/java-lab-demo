package com.example.demo.features.product.get_by_id;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

@Service 
public class GetProductByIdHandler {
    
    private ProductRepository productRepository;



    public GetProductByIdHandler(ProductRepository repo) {
        this.productRepository = repo;
    }

    public Optional<Producto> handle(Long id){
        return productRepository.findById(id);
    }


}
