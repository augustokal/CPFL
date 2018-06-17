/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import Classes.Faturas;
import Classes.Tarifas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gabri
 */
public class FaturasBD {
    
    public void inserir(Faturas fatura) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "INSERT INTO faturas (dt_fatura, dt_venc, id_tarifa,id_usuario) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDate(1, (Date) fatura.getDt_fatura());
        ps.setDate(2, (Date) fatura.getDt_venc());
        ps.setInt(3, fatura.getId_tarifa());
        ps.setInt(4, fatura.getId_usuario());
        ps.execute();
        con.close();
    }
    
    public void alterar(Faturas fatura) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "UPDATE faturas SET dt_fatura=?, dt_venc=?, id_tarifa=?, id_usuario=?, WHERE id_fatura=?";
        PreparedStatement ps = con.prepareStatement(sql);        
        ps.setDate(1, (Date) fatura.getDt_fatura());
        ps.setDate(2, (Date) fatura.getDt_venc());
        ps.setInt(3, fatura.getId_tarifa());
        ps.setInt(4, fatura.getId_usuario());
        ps.setInt(5, fatura.getId_fatura());
        ps.execute();     
        con.close();
    }
    
    public Faturas getDados(Faturas fatura) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "SELECT * FROM faturas WHERE id_fatura=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,fatura.getId_fatura());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            fatura.setDt_fatura(rs.getDate("dt_fatura"));
            fatura.setDt_venc(rs.getDate("dt_venc"));
            fatura.setId_tarifa(rs.getInt("id_tarifa"));
            fatura.setId_fatura(rs.getInt("id_fatura")); 
        }
        con.close();
        return fatura;        
    }
    
}
