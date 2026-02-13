package com.example.demo.business;

import com.example.demo.infrastructure.entitiys.Filme;
import com.example.demo.infrastructure.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public List<Filme> listar() {
        return repository.findAll();
    }

    public Filme buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipe não encontrada"));
    }

    public Filme salvar(Filme filme) {
        return repository.save(filme);
    }

    public Filme atualizar(Long id, Filme novoFilme) {
        Filme filme = buscar(id);
        filme.setNomeFilme(novoFilme.getNomeFilme());
        filme.setAnoLancamento(novoFilme.getAnoLancamento());
        filme.setCategoria(novoFilme.getCategoria());
        filme.setCritica(novoFilme.getCritica());
        return repository.save(filme);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
