package com.example.demo.features.product.get_by_id;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController 
@RequestMapping("/api/product")
@RequiredArgsConstructor    
public class GetProductByIdController {
    
    private GetProductByIdHandler handler;

    @GetMapping("/{id}")
    public ResponseEntity<GetProductByIdResponse> getById(@PathVariable Long id){
         return handler.handle(id)
                .map(GetProductByIdResponse::fromEntity)
                .map(ResponseEntity::ok)
                // .map(p -> ResponseEntity.ok(p))
                .orElse(ResponseEntity.notFound().build());
    }
}
