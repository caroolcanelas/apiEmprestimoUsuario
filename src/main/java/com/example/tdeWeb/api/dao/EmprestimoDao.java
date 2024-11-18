package com.example.tdeWeb.api.dao;

import com.example.tdeWeb.api.model.Emprestimo;
import com.example.tdeWeb.api.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmprestimoDao extends JpaRepository<Emprestimo, Long> {

    // Encontrar empréstimos por usuário
    List<Emprestimo> findByUsuario(Usuario usuario);

    // Encontrar empréstimos pelo item
    List<Emprestimo> findByItem(String item);

    // Encontrar empréstimos que estão ativos (sem data de devolução)
    List<Emprestimo> findByDataDevolucaoIsNull();
}