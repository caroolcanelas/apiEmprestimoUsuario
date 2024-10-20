package com.example.tdeWeb.api.service;

import com.example.tdeWeb.api.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();
    private Long nextId = 1L;

    public UsuarioService() {
        usuarios.add(new Usuario(nextId++, "João Silva", "joao@email.com"));
        usuarios.add(new Usuario(nextId++, "Maria Souza", "maria@email.com"));
    }

    public List<Usuario> getAllUsuarios() {
        return usuarios;
    }

    public Usuario createUsuario(Usuario usuario) {
        usuario.setId(nextId++);
        usuarios.add(usuario);
        return usuario;
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst();
    }

    public Optional<Usuario> updateUsuario(Long id, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getId().equals(id)) {
                u.setNome(usuario.getNome());
                u.setEmail(usuario.getEmail());
                return Optional.of(u);
            }
        }
        return Optional.empty();
    }

    public boolean deleteUsuario(Long id) {
        return usuarios.removeIf(u -> u.getId().equals(id));
    }
}
