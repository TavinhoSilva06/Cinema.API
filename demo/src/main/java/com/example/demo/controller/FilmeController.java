package com.example.demo.controller;

import com.example.demo.business.FilmeService;
import com.example.demo.infrastructure.entitiys.Filme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filmes")

public class FilmeController {

    @Autowired
    private FilmeService service;

    @GetMapping
    public List<Filme> listar() {

        return service.listar();

    }

    @GetMapping("/{id}")
    public Filme buscar(@PathVariable Long id) {

        return service.buscar(id);

    }

    @PostMapping
    public Filme criar(@RequestBody Filme filme) {

        return service.salvar(filme);

    }

    @PutMapping("/{id}")
    public Filme atualizar(@PathVariable Long id, @RequestBody Filme filme) {
        return service.atualizar(id, filme);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {

        service.deletar(id);

    }
}
