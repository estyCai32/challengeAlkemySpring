package com.example.challengeAlkemy.challengeAlkemy.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "PERSONAJES")
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter
    private Long id;

    @Column(name = "nombre")
    @Getter @Setter
    private String name;

    @Column
    @Getter @Setter
    private Integer edad;

    @Column
    @Getter @Setter
    private Double peso;

    @Column
    @Getter @Setter
    private String historia;

    @ManyToMany(mappedBy = "personajes")
    @Getter @Setter
    private List<Pelicula> peliculas;



    public Personaje() {

    }
}
