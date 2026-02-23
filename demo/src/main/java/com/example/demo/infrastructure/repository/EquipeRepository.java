package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.entitiys.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {}