package com.example.demo.controller;

import com.example.demo.business.FilmesEquipeService;
import com.example.demo.infrastructure.entitiys.Filme;
import com.example.demo.infrastructure.entitiys.FilmesEquipe;
import com.example.demo.infrastructure.entitiys.FilmesEquipeDTO;
import com.example.demo.infrastructure.repository.EquipeRepository;
import com.example.demo.infrastructure.repository.FilmeRepository;
import com.example.demo.infrastructure.repository.FilmesEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;



@RestController
@RequestMapping("/filmesequipe")
public class FilmesEquipeController {
    @Autowired
    private EquipeRepository equipeRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private FilmesEquipeRepository repository;

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
    public FilmesEquipe criar(@RequestBody FilmesEquipeDTO dto) {

        FilmesEquipe fe = new FilmesEquipe();

        fe.setEquipe(
                equipeRepository.findById(dto.getIdEquipe()).orElse(null)
        );

        fe.setFilme(
                filmeRepository.findById(dto.getIdFilme()).orElse(null)
        );

        return repository.save(fe);
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
