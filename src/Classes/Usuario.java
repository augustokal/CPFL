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
    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setSenha (String senha){
        this.senha = senha;
    }
    public String getSenha(){
        return this.senha;
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getUsuario (){
        return this.usuario;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    
    
    
    
}
