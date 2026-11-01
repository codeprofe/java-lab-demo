package com.example.demo.features.product.search_by_price;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.List;

import lombok.RequiredArgsConstructor;


@RestController 
@RequestMapping("/api/product")
@RequiredArgsConstructor 
public class SearchProductByPriceController {
    
    private final SearchByPriceHandler handler;
    
    @GetMapping("/greater-than")
    public ResponseEntity<List<SearchProductByPriceResponse>> getMethodName(@RequestParam BigDecimal price) {
        return ResponseEntity.ok(handler.handle(price).map(SearchProductByPriceResponse::fromEntity).toList());
    }
    
    
}
