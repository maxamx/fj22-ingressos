package br.com.caelum.ingresso.dao;

import br.com.caelum.ingresso.model.Filme;
import br.com.caelum.ingresso.model.Ingresso;
import br.com.caelum.ingresso.model.Sala;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

/**
 * Created by nando on 03/03/17.
 */
@Repository
public class IngressoDao {

    @PersistenceContext
    private EntityManager manager;

    public List<Ingresso> findAll(){
    	return manager.createQuery("select i from Ingresso i", Ingresso.class).getResultList();
    	
    }
   
}
