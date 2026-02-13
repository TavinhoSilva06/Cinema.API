package com.example.demo.infrastructure.entitiys;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String NomeFilme;
    private Integer AnoLancamento;
    private String Categoria;
    private String Critica;

    @OneToMany(mappedBy = "filme")
    private List<FilmesEquipe> equipes;
}
