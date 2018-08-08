/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade1.fjs;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author laerton
 */
public class DAOContato {
    
    
    private EntityManager em;

    public DAOContato() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JSF_PU");
        em = emf.createEntityManager();
    }
    
    public Contato Save (Contato contato){
        
        try {
            em.getTransaction().begin();
            em.persist(contato);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
        return contato;
    }
    
    public Contato update (Contato contato){
        
        try {
            em.getTransaction().begin();
            contato = em.merge(contato);
            em.getTransaction().commit();
        } catch (Exception e) {
        }
        return contato;
    }
    
    public Contato findByNome (String nome ){
        Query q = em.createQuery("Select c from Contato c where c.nome = '" + nome + "'");
        Contato c = (Contato) q.getSingleResult();
        return c;
    }
    
    public List<Contato> findAllByOrderNome(){
        Query q = em.createQuery("Select c from Contato c order by c.nome ");
        return q.getResultList();
    }
    
    public List<Contato> findByLetra(String letra){
        String SQL = "Select c from Contato c where c.nome LIKE '"+ letra.toUpperCase() + "%' or c.nome LIKE '"+ letra.toLowerCase() + "%'";
        Query q = em.createQuery(SQL, Contato.class);
        List<Contato> result = q.getResultList();
        return result;
    }
    public void remove(Contato contato)
    {
        try {
            em.getTransaction().begin();
            contato = em.merge(contato);
            em.remove(contato);
            em.getTransaction().commit();
        } catch (Exception e) {
            
        }
    }
}
