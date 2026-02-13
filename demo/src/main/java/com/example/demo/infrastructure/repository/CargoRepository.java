package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.entitiys.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {}