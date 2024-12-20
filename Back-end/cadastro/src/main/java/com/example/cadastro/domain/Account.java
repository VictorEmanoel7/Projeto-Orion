package com.example.cadastro.domain;

import com.example.cadastro.dto.AccountRegisterDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String CPF;

    private String email;

    private String password;

    public Account(@Valid AccountRegisterDTO accountRegisterDTO) {
        this.name = accountRegisterDTO.name();
        this.CPF = accountRegisterDTO.CPF();
        this.email = accountRegisterDTO.email();
        this.password = accountRegisterDTO.password();
    }
}
