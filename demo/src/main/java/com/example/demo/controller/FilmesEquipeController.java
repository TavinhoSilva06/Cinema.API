package com.example.demo.controller;

import com.example.demo.business.FilmesEquipeService;
import com.example.demo.infrastructure.entitiys.Filme;
import com.example.demo.infrastructure.entitiys.FilmesEquipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/filmesequipe")

public class FilmesEquipeController {

    @Autowired
    private FilmesEquipeService service;

    @GetMapping
    public List<FilmesEquipe> listar() {

        return service.listar();
    }

    @GetMapping("/{id}")
    public FilmesEquipe buscar(@PathVariable Long id) {

        return service.buscar(id);

    }

    @PostMapping
    public FilmesEquipe criar(@RequestBody FilmesEquipe filmesequipe) {

        return service.salvar(filmesequipe);

    }

    @PutMapping("/{id}")
    public FilmesEquipe atualizar(@PathVariable Long id, @RequestBody FilmesEquipe filmesequipe) {
        return service.atualizar(id, filmesequipe);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {

        service.deletar(id);

    }
}
