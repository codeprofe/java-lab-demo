package com.example.demo.features.product.update;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.ProductRepository;
import com.example.demo.features.product.domain.Producto;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class UpdateProductHandler {

    private final ProductRepository productRepository;

    @Transactional
    public Optional<Producto> handle(Long id, Producto actualizado){
        return productRepository.findById(id).map(existente ->{
            existente.setPrecio(actualizado.getPrecio());
            existente.setTitulo(actualizado.getTitulo());
            return existente;
        });
    }
}
