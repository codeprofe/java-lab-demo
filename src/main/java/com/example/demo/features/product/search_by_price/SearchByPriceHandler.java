package com.example.demo.features.product.search_by_price;

import java.math.BigDecimal;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.Producto;
import com.example.demo.features.product.domain.SearchByPriceRepository;

import lombok.RequiredArgsConstructor;

@Service 
@RequiredArgsConstructor 
public class SearchByPriceHandler {

    private final SearchByPriceRepository productRepository;

    Stream<Producto> handle(BigDecimal price){
        return productRepository.searchByPrice(price).stream();
    }

}
