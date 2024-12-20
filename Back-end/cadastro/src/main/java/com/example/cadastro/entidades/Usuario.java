package com.example.cadastro.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    private Long id;
    private String name;
    private long cpf;
    private String email;
    private String senha;
}
