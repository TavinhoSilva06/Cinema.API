package com.example.demo.controller;

import com.example.demo.business.CargoService;
import com.example.demo.infrastructure.entitiys.Cargo;
import com.example.demo.infrastructure.entitiys.CargoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cargos")

public class CargoController {

    @Autowired
    private CargoService service;

    @GetMapping
    public List<Cargo> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Cargo buscar(@PathVariable Long id) {

        return service.buscar(id);
    }

    @PostMapping
    public ResponseEntity<Cargo> salvar(@RequestBody CargoDTO dto) {
        Cargo cargoSalvo = service.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(cargoSalvo);
    }

    @PutMapping("/{id}")
    public Cargo atualizar(@PathVariable Long id, @RequestBody Cargo cargo) {
        return service.atualizar(id, cargo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {

        service.deletar(id);

    }
}
