package com.example.demo.features.product.search_by_price;

import java.math.BigDecimal;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.example.demo.features.product.domain.Producto;
import com.example.demo.features.product.domain.SearchByPriceRepository;

@Service 

public class SearchByPriceHandler {

    SearchByPriceRepository productRepository;

    public SearchByPriceHandler(SearchByPriceRepository repo) {
        productRepository = repo;

    }


    Stream<Producto> handle(BigDecimal price){
        return productRepository.searchByPrice(price).stream();
    }

}
