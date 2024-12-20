package com.example.cadastro.repositorio;

import com.example.cadastro.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    Optional<Usuario> findByEmailAndSenha(String email, String senha);
}