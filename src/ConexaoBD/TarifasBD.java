/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import Classes.Tarifas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gabri
 */
public class TarifasBD {
    
     public void inserir(Tarifas tarifa) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "INSERT INTO tarifas (Val_kw, Val_imposto, Cor,Porcentagem) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setDouble(1, tarifa.getVal_kw());
        ps.setDouble(2, tarifa.getVal_imposto());
        ps.setString(3, tarifa.getCor());
        ps.setDouble(4, tarifa.getPorcentagem());
        ps.execute();
        con.close();
    }


    public void alterar(Tarifas tarifa) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "UPDATE tarifas SET val_kw=?, val_impost=?, cor=?, porcentagem=?, WHERE id_tarifa=?";
        PreparedStatement ps = con.prepareStatement(sql);        
        ps.setDouble(1, tarifa.getVal_kw());
        ps.setDouble(2, tarifa.getVal_imposto());
        ps.setString(3, tarifa.getCor());
        ps.setDouble(4, tarifa.getPorcentagem());
        ps.setInt(5, tarifa.getId_tarifa());
        ps.execute();     
        con.close();
    }
    
        public Tarifas getDados(Tarifas tarifa) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "SELECT * FROM tarifas WHERE id_tarifa=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,tarifa.getId_tarifa());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            tarifa.setVal_kw(rs.getDouble("val_kw"));
            tarifa.setVal_imposto(rs.getDouble("val_impost"));
            tarifa.setCor(rs.getString("cor"));
            tarifa.setPorcentagem(rs.getDouble("porcentagem")); 
        }
        con.close();
        return tarifa;        
    } 
}
