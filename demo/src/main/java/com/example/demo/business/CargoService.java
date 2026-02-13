package com.example.demo.business;

import com.example.demo.infrastructure.entitiys.Cargo;
import com.example.demo.infrastructure.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CargoService {

    @Autowired
    private CargoRepository repository;

    public List<Cargo> listar() {
        return repository.findAll();
    }

    public Cargo buscar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Equipe não encontrada"));
    }

    public Cargo salvar(Cargo cargo) {
        return repository.save(cargo);
    }

    public Cargo atualizar(Long id, Cargo novoCargo) {
        Cargo cargo = buscar(id);
        cargo.setCargo(novoCargo.getCargo());
        cargo.setEquipe(novoCargo.getEquipe());
        return repository.save(cargo);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
