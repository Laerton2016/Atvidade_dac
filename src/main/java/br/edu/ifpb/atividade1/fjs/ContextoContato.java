/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.atividade1.fjs;

import java.util.List;
import javax.enterprise.context.RequestScoped;

import javax.inject.Named;

/**
 *
 * @author laerton
 */
@Named
@RequestScoped
public class ContextoContato {
    private Contato contato = new Contato();
    private Contato contBusca = new Contato();
    private String nomeBusca = "";
    private ServiceContato service = new ServiceContato();
    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }
  
    public List<String> letras(){
        return service.findLetras();
    }
    
    public List<Contato> contatosLetra(String letra){
        return service.findContatoLetra(letra);
    }
    
    public String findContatoName(String nome){
        contBusca = service.findByNome(nome);
        return null;
    }

    public Contato getContBusca() {
        return contBusca;
    }

    public void setContBusca(Contato contBusca) {
        this.contBusca = contBusca;
    }
    
    public String editar(Contato contato){
        this.contato = contato;
        return null;
    }
    
    
    public String save(){
        service.save(contato);
        contato = new Contato();
        return null;
    }
    
    public String update(){
        service.update(contato);
        contato = new Contato();
        return null;
    }
    
    public String remove(){
        service.remove(contato);
        contato = new Contato();
        return null;
    }

    public String getNomeBusca() {
        return nomeBusca;
    }

    public void setNomeBusca(String nomeBusca) {
        this.nomeBusca = nomeBusca;
    }
    
}
