/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import Classes.Endereco;
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
    
    public int verificarEndereco (Endereco endereco) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = " SELECT * FROM ENDERECO WHERE CEP=? and num_casa= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1,endereco.getCep());
        ps.setInt(2, endereco.getNum_casa());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            return rs.getInt("ID_usuario");
        } 
        return 0;
    }
    
    public Tarifas puxarImposto ( Tarifas tarifa) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = " SELECT * FROM TARIFAS ";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            tarifa.setId_tarifa(rs.getInt("Id_tarifa"));
            tarifa.setVal_kw(rs.getDouble("val_kw"));
            tarifa.setVal_imposto(rs.getDouble("val_imposto"));
            tarifa.setCor(rs.getString("cor"));
            tarifa.setPorcentagem(rs.getDouble("porcentagem"));
        }
        return tarifa;
    }
    
    public void gerarFatura (Faturas fatura) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        
        
        
    }
    
    public void inserir(Faturas fatura, int id_usuario) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "select max(id_tarifa) FROM tarifas";
        PreparedStatement ps = con.prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            fatura.setId_tarifa(rs.getInt("Max"));
            sql = "INSERT INTO faturas (id_tarifa,id_usuario, kw_gasto) VALUES (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, fatura.getId_tarifa());
            ps.setInt(2, id_usuario);
            ps.setDouble(3, fatura.getKw_gasto());
            ps.execute();
        }
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
