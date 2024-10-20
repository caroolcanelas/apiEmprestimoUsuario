package com.example.tdeWeb.api.controler;


import com.example.tdeWeb.api.model.Emprestimo;
import com.example.tdeWeb.api.service.EmprestimoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emprestimos")
public class EmprestimoController {

    @Autowired
    private EmprestimoService emprestimoService;

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        return emprestimoService.getAllEmprestimos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emprestimo> getEmprestimoById(@PathVariable Long id) {
        return emprestimoService.getEmprestimoById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/{usuarioId}")
    public Emprestimo createEmprestimo(@PathVariable Long usuarioId, @RequestBody Emprestimo emprestimo) {
        return emprestimoService.createEmprestimo(usuarioId, emprestimo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> updateEmprestimo(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        return emprestimoService.updateEmprestimo(id, emprestimo)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmprestimo(@PathVariable Long id) {
        return emprestimoService.deleteEmprestimo(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
