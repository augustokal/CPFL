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
public class Tarifas {
    
    private double val_kw;
    private double val_imposto;
    private String cor;
    private double porcentagem;
    
    
    public void setVal_kw(double val_kw){
        this.val_kw = val_kw;
    }
    public double getVal_kw(){
        return this.val_kw;
    }
    
    public void setVal_imposto(double val_imposto){
        this.val_imposto = val_imposto;
    }    
    public double getVal_imposto(){
        return this.val_imposto;
    }
    
    public void setCor (String cor){
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }
    
    public void setPorcentagem(double porcentagem){
        this.porcentagem = porcentagem;
    }
    public double getPorcentagem(){
        return this.porcentagem;
    }
    
    
    
}
