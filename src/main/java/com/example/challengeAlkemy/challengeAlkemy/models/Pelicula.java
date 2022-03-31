package com.example.challengeAlkemy.challengeAlkemy.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PELICULAS")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column
    @Getter @Setter
    private String titulo;

    @Column
    @Getter @Setter
    private Integer anioCreacion;

    @Column
    @Getter @Setter
    private String fechaCreacion;

    @Column
    @Getter @Setter
    private Integer clasificacion;

    @ManyToMany
    @JoinColumn(name = "reparto")
    @Getter @Setter
    private List<Personaje> personajes;

    @ManyToOne
    @JoinColumn(name = "cod_genero")
    @Getter @Setter
    private Genero genero;
}
