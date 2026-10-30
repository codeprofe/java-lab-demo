
package com.example.demo.controllers;

import com.example.demo.service.ProductService;
import com.example.demo.dto.ProductoResponseDto;
import com.example.demo.model.Producto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.net.URI;


@RestController
@RequestMapping("/api/productos")
public class ProductosController{

    private ProductService productService;

    public ProductosController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public ResponseEntity<List<ProductoResponseDto>> productos(){
        return ResponseEntity.ok(productService.getProductos());
                    
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductoResponseDto > obtenerPorId(@PathVariable Long id){
        return productService.getProductoById(id)
                .map(ResponseEntity::ok)
                // .map(p -> ResponseEntity.ok(p))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Producto> agregarProducto(@RequestBody Producto producto){
        Producto nuevo = productService.guardar(producto);

        URI location = URI.create("api/productos/" + nuevo.getId());

        return ResponseEntity.created(location).body(nuevo);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable Long id, @RequestBody Producto actualizado) { 
        return productService.actualizar(id, actualizado )
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id){
        if (productService.eliminar(id)){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.notFound().build();
        }
    }

}