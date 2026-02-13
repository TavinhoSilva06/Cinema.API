package com.example.demo.business;

import com.example.demo.infrastructure.entitiys.Equipe;
import com.example.demo.infrastructure.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository repository;

    public List<Equipe> listar() {
        return repository.findAll();
    }

    public Equipe buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipe não encontrada"));
    }

    public Equipe salvar(Equipe equipe) {
        return repository.save(equipe);
    }

    public Equipe atualizar(Long id, Equipe novaEquipe) {
        Equipe equipe = buscar(id);
        equipe.setNome(novaEquipe.getNome());
        equipe.setAnoNascimento(novaEquipe.getAnoNascimento());
        equipe.setNacionalidade(novaEquipe.getNacionalidade());
        return repository.save(equipe);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
