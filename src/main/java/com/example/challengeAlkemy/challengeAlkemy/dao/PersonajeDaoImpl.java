package com.example.challengeAlkemy.challengeAlkemy.dao;
import com.example.challengeAlkemy.challengeAlkemy.models.Personaje;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class PersonajeDaoImpl implements PersonajeDao {

    @PersistenceContext
    EntityManager entityManager;

    public Personaje getPersonaje(){
        Personaje p1 =  new Personaje();
        p1.setId(1l);
        p1.setName("minnie");

        return p1;
    }

    @Override
    public List<Personaje> getAllPersonajes() {
       String query = "FROM Personaje";
       return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void newPersonaje(Personaje p) {
        entityManager.merge(p);
    }


}
