package com.example.demo.business;

import com.example.demo.infrastructure.entitiys.FilmesEquipe;
import com.example.demo.infrastructure.repository.FilmesEquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmesEquipeService {

    @Autowired
    private FilmesEquipeRepository repository;

    public List<FilmesEquipe> listar() {
        return repository.findAll();
    }

    public FilmesEquipe buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro não encontrado"));
    }

    public FilmesEquipe salvar(FilmesEquipe filmesEquipe) {

        return repository.save(filmesEquipe);
    }

    public FilmesEquipe atualizar(Long id, FilmesEquipe novoFilmesEquipe) {
        FilmesEquipe filmesEquipe = buscar(id);

        filmesEquipe.setEquipe(novoFilmesEquipe.getEquipe());
        filmesEquipe.setFilme(novoFilmesEquipe.getFilme());

        return repository.save(filmesEquipe);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}