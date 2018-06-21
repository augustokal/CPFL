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
import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class FaturasBD {

    public int verificarEndereco(Endereco endereco) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        String sql = " SELECT * FROM ENDERECO WHERE CEP=? and num_casa= ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, endereco.getCep());
        ps.setInt(2, endereco.getNum_casa());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getInt("ID_usuario");
        }
        return 0;
    }

    public Tarifas puxarImposto(Tarifas tarifa) throws Exception {
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

    public void gerarFatura(Faturas fatura) throws Exception {
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
        if (rs.next()) {
            fatura.setId_tarifa(rs.getInt("Max"));

            fatura.setValorTotal(calcularTotal(fatura.getId_tarifa(), fatura));

            sql = "INSERT INTO faturas (id_tarifa,id_usuario, kw_gasto, valorTotal) VALUES (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, fatura.getId_tarifa());
            ps.setInt(2, id_usuario);
            ps.setDouble(3, fatura.getKwGastos());
            ps.setDouble(4, fatura.getValorTotal());
            ps.execute();

        }
        con.close();
    }

    public void alterar(Faturas fatura) throws Exception {
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

    public ArrayList<Faturas> getDados(int idUser) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();
        
        String sql = "SELECT ft.*, tf.* FROM faturas AS ft INNER JOIN tarifas AS tf ON (ft.id_tarifa = tf.id_tarifa) WHERE ft.id_usuario =?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idUser);
        
        ResultSet rs = ps.executeQuery();

        ArrayList<Faturas> listaFaturas = new ArrayList<>();

        while (rs.next()) {
            Faturas fatura = new Faturas();
            
            fatura.setDt_fatura(rs.getDate("dt_fatura"));
            fatura.setValorTotal(rs.getDouble("valorTotal"));            
            fatura.setDt_venc(rs.getDate("dt_venc"));
            fatura.setKwGastos(rs.getDouble("kw_gasto"));
            fatura.setId_tarifa(rs.getInt("id_tarifa"));
            fatura.setId_fatura(rs.getInt("id_fatura"));
            fatura.setVal_kw(rs.getDouble("val_kw"));
            fatura.setVal_imposto(rs.getDouble("val_imposto"));
            fatura.setCor(rs.getString("cor"));
            fatura.setPorcentagem(rs.getDouble("porcentagem"));
            
            listaFaturas.add(fatura);
        }
        con.close();
        return listaFaturas;
    }

    private double calcularTotal(int idtarifa, Faturas fatura) throws Exception {
        Connection con;
        Conexao c = new Conexao();
        con = c.conectar();

        Tarifas tarifa = new Tarifas();
        double valorGasto = 0;

        String sql = "SELECT * FROM tarifas WHERE id_tarifa=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, idtarifa);

        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            tarifa.setVal_kw(rs.getDouble("val_kw"));
            tarifa.setVal_imposto(rs.getDouble("val_imposto"));
            tarifa.setCor(rs.getString("cor"));
            tarifa.setPorcentagem(rs.getDouble("porcentagem"));

            valorGasto = fatura.getKwGastos() * tarifa.getVal_kw();
            valorGasto += valorGasto * (tarifa.getVal_imposto() / 100);
            valorGasto += valorGasto * (tarifa.getPorcentagem() / 100);
        }
        return valorGasto;
    }

}
