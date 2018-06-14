/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author gabri
 */
public class Usuario {
    
        
    private String nome;
    private String senha;
    private String usuario;
    private String tipo;
    
    
    public void getNome(String nome){
        this.nome = nome;
    }
    public String setNome(){
        return this.nome;
    }
    
    public void getSenha (String senha){
        this.senha = senha;
    }
    public String setSenha(){
        return this.senha;
    }
    
    public void getUsuario(String usuario){
        this.usuario = usuario;
    }
    public String setUsuario (){
        return this.usuario;
    }
    
    public void getTipo(String tipo){
        this.tipo = tipo;
    }
    public String setTipo(){
        return this.tipo;
    }
    
    
    
    
}
