package com.example.challengeAlkemy.challengeAlkemy.dao;

import com.example.challengeAlkemy.challengeAlkemy.models.Pelicula;
import com.example.challengeAlkemy.challengeAlkemy.models.Personaje;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PeliculaDaoImpl implements PeliculaDao{

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public List<Pelicula> getAllPeliculas() {
        String query = "FROM Pelicula";
        return entityManager.createQuery(query).getResultList();

    }
}
