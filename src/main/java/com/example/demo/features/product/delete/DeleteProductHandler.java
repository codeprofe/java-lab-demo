package com.example.demo.features.product.delete;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class DeleteProductHandler {
    private ProductRepository productRepository;
    
    public boolean handle(Long id){
        if (productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
