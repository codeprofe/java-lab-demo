package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record ProductoRequestDto (
    @NotNull (message = "El titulo es obligatorio")
    @NotBlank(message = "El titulo no puede estar vacío")
    @Size(min=3, max=100, message = "El titulo debe tener entre 3 y 100 caracteres")
    String titulo,
    @NotNull(message = "El precio es obligatorio")
    @Positive(message = "El precio debe ser mayor que cero")
    Double precio
    
){}
