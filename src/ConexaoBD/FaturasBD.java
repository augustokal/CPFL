/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexaoBD;

import Classes.Faturas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
