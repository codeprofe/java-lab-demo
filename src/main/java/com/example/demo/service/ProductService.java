package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.dto.ProductoResponseDto;
import com.example.demo.model.Producto;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private ProductRepository productRepository;

    public ProductService(ProductRepository repository){
        this.productRepository = repository;
    }

    public List<ProductoResponseDto> getProductos(){
        return productRepository.findAll().stream()
                .map(ProductoResponseDto::fromEntity)
                .toList();
    }

    public Optional<ProductoResponseDto> getProductoById(Long id){
        return this.productRepository.findById(id).map(ProductoResponseDto::fromEntity);
    }

    public Producto guardar(Producto nuevoProducto){
       
        return productRepository.save(nuevoProducto);
    }

    public Optional<Producto> actualizar(Long id, Producto actualizado){
        return productRepository.findById(id).map(existente ->{
            existente.setPrecio(actualizado.getPrecio());
            existente.setTitulo(actualizado.getTitulo());
            return existente;
        });
    }

    public boolean eliminar(Long id){
        if (productRepository.existsById(id)){
            productRepository.deleteById(id);
            return true;
        }
        return false;
    }

}