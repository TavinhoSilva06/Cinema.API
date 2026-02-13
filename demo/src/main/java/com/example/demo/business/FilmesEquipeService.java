//package com.example.demo.business;

import com.example.demo.infrastructure.entitiys.Equipe;
import com.example.demo.infrastructure.entitiys.FilmesEquipe;
import com.example.demo.infrastructure.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//public class FilmesEquipeService {
//
//    @Autowired
//    private EquipeRepository repository;
//
//    public List<Equipe> listar() {
//        return repository.findAll();
//    }
//
//    public FilmesEquipe buscar(Long id) {
//        return repository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Equipe não encontrada"));
//    }
//
//    public FilmesEquipe salvar(FilmesEquipe filmesequipe) {
//
//        return repository.save(filmesequipe);
//    }
//
//    public FilmesEquipe atualizar(Long id, FilmesEquipe novoFilmesEquipe) {
//        FilmesEquipe filmesequipe = buscar(id);
//        filmesequipe.setEquipe(novoFilmesEquipe.getEquipe());
//        filmesequipe.setFilme(novoFilmesEquipe.getFilme());
//        return repository.save(filmesequipe);
//    }
//
//    public void deletar(Long id) {
//
//        repository.deleteById(id);
//    }
//}
