package com.example.challengeAlkemy.challengeAlkemy.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Peliculas")
@EqualsAndHashCode
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
    private Date fechaCreacion;

    @Column
    @Getter @Setter
    private Integer clasificacion;


    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "actua",
               joinColumns = @JoinColumn(name = "FK_PELICULA", referencedColumnName = "id",  nullable = false),
               inverseJoinColumns = @JoinColumn(name="FK_PERSONAJE", referencedColumnName = "id", nullable = false))
    @JsonIgnore
    @Getter @Setter
    private List<Personaje> personajes;


    @ManyToOne
    @JoinColumn(name = "cod_genero")
    @Getter @Setter
    private Genero genero;
}
