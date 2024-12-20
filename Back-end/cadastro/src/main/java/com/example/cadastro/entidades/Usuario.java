package com.example.cadastro.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    private String name;
    private long cpf;
    private String email;
    private String senha;
}
