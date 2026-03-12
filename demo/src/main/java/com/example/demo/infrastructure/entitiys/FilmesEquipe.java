package com.example.demo.infrastructure.entitiys;

import com.example.demo.infrastructure.entitiys.Equipe;
import com.example.demo.infrastructure.entitiys.Filme;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "FilmesEquipe")
public class FilmesEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "IDEquipe")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "IDFilme")
    private Filme filme;
}