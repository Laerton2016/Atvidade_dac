/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade1.fjs;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author laerton
 */
public class ServiceContato {
 
    private DAOContato dao = new DAOContato();
    
    public Contato save (Contato contato){
        return dao.Save(contato);
    }
    
    public Contato update (Contato contato){
        return dao.update(contato);
    }
    
    public List<String> listaLetras(){
        List<String> letras = new LinkedList<>();
        
        
        
        return letras;
    }
    
}
