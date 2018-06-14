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
public class Endereco {
    private int id_end;
    private String cep;
    private String rua;
    private int num_casa;
    private int id_usuario;
    
    public void setId_end(int id_end){
        this.id_end = id_end;
    }
    public int getId_ende(){
        return this.id_end;
    }

    public void setCep (String cep){
        this.cep = cep;
    }
    public String getCep (){
        return this.cep;
    }
    
    public void setRua (String rua){
        this.rua = rua;
    }
    public String getRua(){
        return this.rua;
    }

    public void setNum_casa(int num_casa){
        this.num_casa = num_casa;
    }
    public int getNum_casa(){
        return this.num_casa;
    }

    public void setId_usuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    public int getId_usuario(){
        return this.id_usuario;
    }
    
}
