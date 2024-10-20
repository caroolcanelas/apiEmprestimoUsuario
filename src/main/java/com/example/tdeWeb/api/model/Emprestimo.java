package com.example.tdeWeb.api.model;

import java.time.LocalDate;

public class Emprestimo {

    private Long id;
    private Usuario usuario;
    private String item;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    // Construtor
    public Emprestimo(Long id, Usuario usuario, String item, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.id = id;
        this.usuario = usuario;
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
