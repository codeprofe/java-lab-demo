package com.example.demo.features.product.search_by_price;

import com.example.demo.features.product.domain.ProductRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController 
@RequestMapping("/api/product")
public class SearchProductByPriceController {

   
    SearchByPriceHandler handler;

    public SearchProductByPriceController(SearchByPriceHandler handler, ProductRepository productRepository) {
        this.handler = handler;
      
    }


    @GetMapping("/greater-than")
    public ResponseEntity<List<SearchProductByPriceResponse>> getMethodName(@RequestParam BigDecimal price) {
        return ResponseEntity.ok(handler.handle(price).map(SearchProductByPriceResponse::fromEntity).toList());
    }
    
    
}
