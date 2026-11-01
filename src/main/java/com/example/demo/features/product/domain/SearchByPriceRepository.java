package com.example.demo.features.product.domain;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SearchByPriceRepository  extends JpaRepository<Producto, Long> {
    @Query ("""
        SELECT p
        FROM Producto p
            WHERE p.precio > :precio
        ORDER BY p.precio DESC
    """)
    List<Producto> searchByPrice(
        @Param("precio") BigDecimal price
    );
    
}
