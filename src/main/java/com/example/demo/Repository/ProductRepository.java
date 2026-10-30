package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Producto;

public interface ProductRepository extends JpaRepository<Producto, Long> {
    // JpaRepository ya incluye: findAll(), findById(), save(), deleteById(), etc.
}
