package com.example.demo.features.product.get_all;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/product")
public class GetAllProductController {
    
    private GetAllProductHandler handler;

    public GetAllProductController(GetAllProductHandler handler) {
        this.handler = handler;
    }

    @GetMapping 
    public ResponseEntity<List<GetAllProductResponse>> getAll(){
        return ResponseEntity.ok(handler.handle().map(GetAllProductResponse::fromEntity).toList());
    }
}
