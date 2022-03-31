package com.example.challengeAlkemy.challengeAlkemy.controllers;

import com.example.challengeAlkemy.challengeAlkemy.dao.PersonajeDao;
import com.example.challengeAlkemy.challengeAlkemy.models.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class personajesController {

    @Autowired
    PersonajeDao personajeDao;

    @RequestMapping(value="prueba")
    public String prueba(){
        return "gato";
    }

    @RequestMapping(value="prueba2")
    public Personaje prueba2(){
        Personaje p1= new Personaje();

        personajeDao.newPersonaje(p1);

        return personajeDao.getPersonaje();
    }



}
