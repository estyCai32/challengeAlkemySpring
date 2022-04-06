package com.example.challengeAlkemy.challengeAlkemy.controllers;

import com.example.challengeAlkemy.challengeAlkemy.dao.PeliculaDao;
import com.example.challengeAlkemy.challengeAlkemy.dao.PersonajeDao;
import com.example.challengeAlkemy.challengeAlkemy.models.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class personajesController {

    @Autowired
    private PersonajeDao data;

    @RequestMapping(value= "getPersonajes")
    public List<Personaje> getAllPersonajes(){
        return data.getAllPersonajes();
    }

    @RequestMapping(value = "crearPersonaje", method = RequestMethod.POST)
    public void registrarPersonaje(@RequestBody Personaje p){
         data.newPersonaje(p);
    }


}
