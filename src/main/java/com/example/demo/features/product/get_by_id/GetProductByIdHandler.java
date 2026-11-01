package com.example.demo.features.product.get_by_id;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class GetProductByIdHandler {
    
    private final ProductRepository productRepository;

    public Optional<Producto> handle(Long id){
        return productRepository.findById(id);
    }

}
