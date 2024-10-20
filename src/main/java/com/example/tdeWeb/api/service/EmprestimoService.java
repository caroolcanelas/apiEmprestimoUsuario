package com.example.tdeWeb.api.service;


import com.example.tdeWeb.api.model.Emprestimo;
import com.example.tdeWeb.api.model.Usuario;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    private List<Emprestimo> emprestimos = new ArrayList<>();
    private Long nextId = 1L;

    private List<Usuario> usuarios = new ArrayList<>();

    public EmprestimoService() {
        Usuario usuario1 = new Usuario(1L, "João Silva", "joao@email.com");
        Usuario usuario2 = new Usuario(2L, "Maria Souza", "maria@email.com");

        usuarios.add(usuario1);
        usuarios.add(usuario2);

        emprestimos.add(new Emprestimo(nextId++, usuario1, "Livro Java Avançado", LocalDate.now(), LocalDate.of(2024, 12, 1)));
    }

    public List<Emprestimo> getAllEmprestimos() {
        return emprestimos;
    }

    public Optional<Emprestimo> getEmprestimoById(Long id) {
        return emprestimos.stream().filter(e -> e.getId().equals(id)).findFirst();
    }

    public Emprestimo createEmprestimo(Long usuarioId, Emprestimo emprestimo) {
        emprestimo.setId(nextId++);
        emprestimos.add(emprestimo);
        return emprestimo;
    }

    public Optional<Emprestimo> updateEmprestimo(Long id, Emprestimo emprestimo) {
        for (Emprestimo e : emprestimos) {
            if (e.getId().equals(id)) {
                e.setUsuario(emprestimo.getUsuario());
                e.setItem(emprestimo.getItem());
                e.setDataEmprestimo(emprestimo.getDataEmprestimo());
                e.setDataDevolucao(emprestimo.getDataDevolucao());
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    public boolean deleteEmprestimo(Long id) {
        return emprestimos.removeIf(e -> e.getId().equals(id));
    }
}
