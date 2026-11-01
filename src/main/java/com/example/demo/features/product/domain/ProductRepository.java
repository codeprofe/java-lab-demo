package com.example.demo.features.product.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Producto, Long> {
    // JpaRepository ya incluye: findAll(), findById(), save(), deleteById(), etc.
}
