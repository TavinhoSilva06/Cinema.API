package com.example.demo.infrastructure.entitiys;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "Cargos")
public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Cargo;

    @ManyToOne
    @JoinColumn(name = "IDEquipe")
    private Equipe equipe;
}

