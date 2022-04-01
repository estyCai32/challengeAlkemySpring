package com.example.challengeAlkemy.challengeAlkemy.dao;

import com.example.challengeAlkemy.challengeAlkemy.models.Personaje;

import java.util.List;

public interface PersonajeDao {
    Personaje getPersonaje();
    List<Personaje> getAllPersonajes();
    void newPersonaje(Personaje p);

}
