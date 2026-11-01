package com.example.demo.features.product.get_all;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

@Service 
public class GetAllProductHandler {
    
    private ProductRepository productRepository;



    public GetAllProductHandler(ProductRepository repo) {
        this.productRepository = repo;
    }

    public Stream<Producto> handle(){
        return productRepository.findAll().stream();
    }


}
