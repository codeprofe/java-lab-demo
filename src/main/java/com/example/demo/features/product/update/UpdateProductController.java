package com.example.demo.features.product.update;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.features.product.domain.Producto;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;


@RestController 
@RequestMapping("/api/product")
public class UpdateProductController {
    
    UpdateProductHandler handler;

    public UpdateProductController(UpdateProductHandler handler) {
        this.handler = handler;
    }

    @PutMapping("/{id}")
    public ResponseEntity<UpdateProductResponse> actualizarProducto(@PathVariable Long id, @RequestBody UpdateProductResquest actualizado) { 
        return handler.handle(id, new Producto(actualizado.title(),actualizado.price()) )
                    .map(UpdateProductResponse::fromEntity)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

}
