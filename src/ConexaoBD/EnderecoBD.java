/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import Classes.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gabri
 */
public class EnderecoBD {
    
        public void inserir(Endereco endereco) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "INSERT INTO Endereco (cep, rua, num_casa, id_usuario) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, endereco.getCep());
        ps.setString(2, endereco.getRua());
        ps.setInt(3, endereco.getNum_casa());
        ps.setInt(4, endereco.getId_usuario());
        ps.execute();
        con.close();
    }
        
    public void alterar(Endereco endereco) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "UPDATE endereco SET cep=?, rua=?, num_casa=?, id_usuario=?, WHERE id_end =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, endereco.getCep());
        ps.setString(2, endereco.getRua());
        ps.setInt(3, endereco.getNum_casa());
        ps.setInt(4, endereco.getId_usuario());
        ps.setInt(5, endereco.getId_end());
        ps.execute();     
        con.close();
    }
    
        public Endereco getDados(Endereco endereco) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "SELECT * FROM endereco WHERE id_end=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,endereco.getId_end());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getRua());
            ps.setInt(3, endereco.getNum_casa());
            ps.setInt(4, endereco.getId_usuario());
        }
        con.close();
        return endereco;        
    } 
}
