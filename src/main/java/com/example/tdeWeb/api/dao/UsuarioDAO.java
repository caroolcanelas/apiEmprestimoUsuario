package com.example.tdeWeb.api.dao;

import com.example.tdeWeb.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario, Long> {

    // Encontrar um usuário pelo email
    Optional<Usuario> findByEmail(String email);
}