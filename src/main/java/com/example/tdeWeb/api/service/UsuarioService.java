package com.example.tdeWeb.api.service;

import com.example.tdeWeb.api.dao.UsuarioDAO;
import com.example.tdeWeb.api.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    public List<Usuario> findAll() {
        return usuarioDAO.findAll();
    }

    public Optional<Usuario> findById(Long id) {
        return usuarioDAO.findById(id);
    }

    public Usuario save(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    public void delete(Long id) {
        usuarioDAO.deleteById(id);
    }
}