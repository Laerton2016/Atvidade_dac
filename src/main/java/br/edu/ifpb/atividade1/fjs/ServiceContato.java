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
public class ServiceContato 
{
    private DAOContato dao = new DAOContato();
    
    public Contato save (Contato contato){
        return dao.Save(contato);
    }
    
    public Contato update (Contato contato){
        return dao.update(contato);
    }
    
    public void remove (Contato contato){
        dao.remove(contato);
    }
    
    public Contato findByNome(String nome){
        return dao.findByNome(nome);
    }
    
    public List<Contato> contatos(){
        return dao.findAllByOrderNome();
    }
    
    public List<String> findLetras(){
        List<Contato> contatos = contatos();
        List<String> letras = new LinkedList<>();
        for (Contato contato : contatos) {
            String letra = String.valueOf(contato.getNome().toCharArray()[0]).toUpperCase();
            if (!letras.contains(letra)){
                letras.add(letra);
            }
        }
        return letras;
    }
    
    public List<Contato> findContatoLetra(String letra){
        return dao.findByLetra(letra);
    }
    
}
