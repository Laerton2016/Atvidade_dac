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
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
        return (Contato) q.getSingleResult();
    }
    
    public List<Contato> findAllByOrderNome(){
        Query q = em.createQuery("Select c from Contato c order by c.nome ");
        return q.getResultList();
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
