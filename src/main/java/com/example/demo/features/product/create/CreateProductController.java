package com.example.demo.features.product.create;


import lombok.RequiredArgsConstructor;
import java.net.URI;

import com.example.demo.features.product.domain.Producto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController 
@RequestMapping("/api/product")
@RequiredArgsConstructor 
public class CreateProductController {
    
    private final CreateProductHandler handler;


    @PostMapping
    public ResponseEntity<CreateProductResponse> getAll(@RequestBody CreateProductRequest dto) {
        Producto newProduct = handler.handle(new Producto(null,dto.title(),dto.price()));
        
        URI location = URI.create("api/productos/" + newProduct.getId());

        return ResponseEntity.created(location).body(new CreateProductResponse(newProduct.getId(), newProduct.getTitulo(), newProduct.getPrecio()));

    }
    
}
