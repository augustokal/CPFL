/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

public class Faturas extends Tarifas{
    private int id_fatura;
    private Date dt_fatura;
    private Date dt_venc;
    private int id_usuario;
    private double kwGastos;
    private double valorTotal;
    
    
    public void setId_fatura(int id_fatura){
        this.id_fatura = id_fatura;
    }
    public int getId_fatura(){
        return this.id_fatura;
    }
    
    public void setDt_fatura(Date dt_fatura){
        this.dt_fatura = dt_fatura;
    }
    public Date getDt_fatura(){
        return this.dt_fatura;
    }
        
    public void setDt_venc(Date dt_venc){
        this.dt_venc = dt_venc;
    }
    public Date getDt_venc(){
        return this.dt_venc;
    }
    
    public void setId_usuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    public int getId_usuario(){
        return this.id_usuario;
    }
    
    public double getKwGastos() {
        return kwGastos;
    }

    public void setKwGastos(double kwGastos) {
        this.kwGastos = kwGastos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
}
