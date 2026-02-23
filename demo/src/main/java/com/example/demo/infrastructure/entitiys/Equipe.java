package com.example.demo.infrastructure.entitiys;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Equipe")
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nome;
    private Integer AnoNascimento;
    private String Nacionalidade;

    @OneToMany(mappedBy = "equipe", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Cargo> cargos;


    @OneToMany(mappedBy = "equipe")
    private List<FilmesEquipe> filmes;

    // getters e setters
}

