package com.example.demo.features.product.delete;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;

@Service 
public class DeleteProductHandler {
    private ProductRepository productRepository;

    public DeleteProductHandler(ProductRepository repo) {
        this.productRepository = repo;
    }
    
    public boolean handle(Long id){
        if (productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
