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
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class EnderecoBD {

    public void inserir(Endereco endereco) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();

        String sql = "INSERT INTO usuario (senha, usuario, tipo,nome) VALUES (?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, endereco.getSenha());
        ps.setString(2, endereco.getUsuario());
        ps.setString(3, endereco.getTipo());
        ps.setString(4, endereco.getNome());
        ps.execute();

        sql = "SELECT MAX(id_usuario) FROM usuario";
        ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            endereco.setId_usuario(rs.getInt("MAX"));
            
            sql = "INSERT INTO Endereco (cep, rua, num_casa, bairro, cidade, uf, id_usuario) VALUES (?,?,?,?,?,?,?)";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getRua());
            ps.setInt(3, endereco.getNum_casa());
            ps.setString(4, endereco.getBairro());
            ps.setString(5, endereco.getCidade());
            ps.setString(6, endereco.getUF());
            ps.setInt(7, endereco.getId_usuario());
            ps.execute();
        }
        con.close();
    }

    public void alterar(Endereco usuario) throws Exception {
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
       
        sql = "UPDATE endereco SET cep=?, rua=?, num_casa=?, bairro=?, cidade=?, uf=? WHERE id_end =?";
        ps = con.prepareStatement(sql);
        
        ps.setString(1, usuario.getCep());
        ps.setString(2, usuario.getRua());
        ps.setInt(3, usuario.getNum_casa());
        ps.setString(4, usuario.getBairro());
        ps.setString(5, usuario.getCidade());
        ps.setString(6, usuario.getUF());
        ps.setInt(7, usuario.getId_end());
        
        ps.execute();
       
        con.close();
    }

    public ArrayList<Endereco> listarFuncionarios() throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = "SELECT u.*, e.* FROM usuario AS u INNER JOIN endereco AS e ON (u.id_usuario = e.id_usuario) WHERE u.tipo='Medidor' or u.tipo='Gerente'";
        PreparedStatement ps = con.prepareStatement(sql);

        ArrayList<Endereco> listFuncionarios = new ArrayList<>();

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Endereco endereco = new Endereco();

            endereco.setId_usuario(rs.getInt("id_usuario"));
            endereco.setNome(rs.getString("nome"));
            endereco.setCep(rs.getString("cep"));
            endereco.setRua(rs.getString("rua"));
            endereco.setNum_casa(rs.getInt("num_casa"));
            endereco.setBairro(rs.getString("bairro"));
            endereco.setCidade(rs.getString("cidade"));
            endereco.setUF(rs.getString("uf"));
            endereco.setTipo(rs.getString("tipo"));
            endereco.setUsuario(rs.getString("usuario"));
            endereco.setSenha(rs.getString("senha"));
            endereco.setId_end(rs.getInt("id_end"));

            listFuncionarios.add(endereco);
        }
        con.close();
        return listFuncionarios;
    }
}
