package com.example.challengeAlkemy.challengeAlkemy.controllers;

import com.example.challengeAlkemy.challengeAlkemy.dao.PeliculaDao;
import com.example.challengeAlkemy.challengeAlkemy.models.Pelicula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class peliculasController {
    @Autowired
    private PeliculaDao peliculaDao;

    @RequestMapping(value = "getPeliculas")
    public List<Pelicula> getPeliculas(){
        return peliculaDao.getAllPeliculas();
    }
}
