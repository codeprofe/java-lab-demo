package com.example.demo.features.product.delete;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/product")
public class DeleteProductController {

    DeleteProductHandler handler;

    public DeleteProductController(DeleteProductHandler handler) {
        this.handler = handler;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        if (this.handler.handle(id))
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.notFound().build();
    }
    
}
