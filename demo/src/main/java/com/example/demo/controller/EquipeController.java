package com.example.demo.controller;

import com.example.demo.business.EquipeService;
import com.example.demo.infrastructure.entitiys.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipes")

public class EquipeController {

    @Autowired
    private EquipeService service;

    @GetMapping
    public List<Equipe> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Equipe buscar(@PathVariable Long id) {

        return service.buscar(id);
    }

    @PostMapping
    public Equipe criar(@RequestBody Equipe equipe) {

        return service.salvar(equipe);
    }

    @PutMapping("/{id}")
    public Equipe atualizar(@PathVariable Long id,
                            @RequestBody Equipe equipe) {
        return service.atualizar(id, equipe);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
