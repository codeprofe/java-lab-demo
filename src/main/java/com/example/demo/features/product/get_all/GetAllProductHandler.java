package com.example.demo.features.product.get_all;

import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class GetAllProductHandler {
    
    private final ProductRepository productRepository;

    public Stream<Producto> handle(){
        return productRepository.findAll().stream();
    }


}
