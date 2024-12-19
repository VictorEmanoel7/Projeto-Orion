package com.example.cadastro.dto;

import jakarta.validation.constraints.NotBlank;

public record AccountRegisterDTO(
        @NotBlank
        String name,

        @NotBlank
        String CPF,

        @NotBlank
        String email,

        @NotBlank
        String password
) {
}
