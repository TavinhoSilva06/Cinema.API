package com.example.demo.infrastructure.entitiys;

import com.example.demo.infrastructure.entitiys.Equipe;
import com.example.demo.infrastructure.entitiys.Filme;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "FilmesEquipe")
public class FilmesEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IDEquipe")
    @JsonBackReference(value = "equipe-filme")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "IDFilme")
    @JsonBackReference(value = "filme-equipe")
    private Filme filme;
}