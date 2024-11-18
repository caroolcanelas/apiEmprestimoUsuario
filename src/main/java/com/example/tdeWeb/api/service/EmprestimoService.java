package com.example.tdeWeb.api.service;

import com.example.tdeWeb.api.model.Emprestimo;
import com.example.tdeWeb.api.dao.EmprestimoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoDao emprestimoDAO;

    public List<Emprestimo> findAll() {
        return emprestimoDAO.findAll();
    }

    public Optional<Emprestimo> findById(Long id) {
        return emprestimoDAO.findById(id);
    }

    public Emprestimo save(Emprestimo emprestimo) {
        return emprestimoDAO.save(emprestimo);
    }

    public void delete(Long id) {
        emprestimoDAO.deleteById(id);
    }
}