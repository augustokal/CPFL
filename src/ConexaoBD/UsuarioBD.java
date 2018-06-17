/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import Classes.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author gabri
 */
public class UsuarioBD {
    
     public void inserir(Usuario usuario) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "INSERT INTO usuario (senha, usuario, tipo,nome) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, usuario.getSenha());
        ps.setString(2, usuario.getUsuario());
        ps.setString(3, usuario.getTipo());
        ps.setString(4, usuario.getNome());
        ps.execute();
        con.close();
    }
    
        public void alterar(Usuario usuario) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "UPDATE usuario SET senha=?, usuario=?, tipo=?, nome=? WHERE id_usuario =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, usuario.getSenha());
        ps.setString(2, usuario.getUsuario());
        ps.setString(3, usuario.getTipo());
        ps.setString(4, usuario.getNome());
        ps.setInt(5, usuario.getId_usuario());
        ps.execute();     
        con.close();
    }
          
    public Usuario getDados(Usuario usuario) throws Exception{
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "SELECT * FROM usuario WHERE id_usuario=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1,usuario.getId_usuario());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            usuario.setSenha(rs.getString("senha"));
            usuario.setUsuario(rs.getString("usuario"));
            usuario.setTipo(rs.getString("tipo"));
            usuario.setNome(rs.getString("nome")); 
        }
        con.close();
        return usuario;        
    } 
}
