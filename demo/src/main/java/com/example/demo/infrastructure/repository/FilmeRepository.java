package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.entitiys.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {}