package View;

import Classes.Endereco;
import Classes.Usuario;
import ConexaoBD.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Endereco endereco = new Endereco();

    private boolean checarUsuario() {
        try (Connection con = Conexao.conectar()) {
            String user = txtUsuario.getText();
            String senha = txtSenha.getText();

            String sql = "SELECT u.*, e.* FROM usuario as u INNER JOIN endereco as e on (u.id_usuario = e.id_usuario)"
                    + " where usuario = ? and senha = ?";

            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, user);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
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
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuSuperior = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        FundoLogo = new javax.swing.JLabel();
        iconUser = new javax.swing.JLabel();
        iconSenha = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnEntrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnlMenuSuperior.setBackground(new java.awt.Color(0, 152, 209));
        pnlMenuSuperior.setLayout(null);

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fechar.png"))); // NOI18N
        btnFechar.setToolTipText("");
        btnFechar.setBorderPainted(false);
        btnFechar.setContentAreaFilled(false);
        btnFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        pnlMenuSuperior.add(btnFechar);
        btnFechar.setBounds(360, 0, 40, 34);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel2.setLayout(null);

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo CPFL.png"))); // NOI18N
        jPanel2.add(Logo);
        Logo.setBounds(130, 0, 130, 100);

        FundoLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fundoLogo.png"))); // NOI18N
        jPanel2.add(FundoLogo);
        FundoLogo.setBounds(1, 0, 396, 120);

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconUsuario.png"))); // NOI18N
        jPanel2.add(iconUser);
        iconUser.setBounds(70, 170, 32, 30);

        iconSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/iconSenha.png"))); // NOI18N
        jPanel2.add(iconSenha);
        iconSenha.setBounds(70, 230, 30, 32);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(70, 205, 250, 2);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(70, 265, 250, 2);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("USUÁRIO");
        txtUsuario.setBorder(null);
        jPanel2.add(txtUsuario);
        txtUsuario.setBounds(110, 170, 210, 30);

        txtSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(153, 153, 153));
        txtSenha.setText("SENHA");
        txtSenha.setBorder(null);
        jPanel2.add(txtSenha);
        txtSenha.setBounds(110, 230, 210, 30);

        jLabel2.setBackground(new java.awt.Color(193, 193, 193));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Não possui energia na sua casa?");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 370, 181, 14);

        btnCadastrar.setBackground(new java.awt.Color(0, 152, 209));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 152, 209));
        btnCadastrar.setText("Cadastre-se");
        btnCadastrar.setBorder(null);
        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setFocusPainted(false);
        btnCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadastrar);
        btnCadastrar.setBounds(250, 370, 90, 15);

        btnEntrar.setBackground(new java.awt.Color(0, 152, 209));
        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setBorderPainted(false);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusPainted(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEntrar);
        btnEntrar.setBounds(150, 300, 100, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlMenuSuperior, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMenuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        if (checarUsuario() == true) {
            String nomeU = endereco.getNome();
            if (nomeU != null) {
                if ("Gerente".equals(endereco.getTipo())) {
                    System.out.println("Validou gerente");
                    MenuGerente menuGerente = new MenuGerente(endereco);
                    menuGerente.setVisible(true);
                    dispose();
                }
                if ("Medidor".equals(endereco.getTipo())) {
                    System.out.println("Validou medidor");
                    MenuMedidor menuMedidor = new MenuMedidor();
                    menuMedidor.setVisible(true);
                    dispose();
                }
                if ("Cliente".equals(endereco.getTipo())) {
                    System.out.println("Validou cliente");
                    MenuCliente menuCliente = new MenuCliente(endereco);
                    menuCliente.setVisible(true);
                    dispose();
                }

            }
            //Caso nao localize o login e senha corretos retorna msg de erro
        } else {
            JOptionPane.showMessageDialog(null, "***Nome de usuário ou senha inválidos***");
        }


    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastroCliente cadastrarCli = new CadastroCliente();
        cadastrarCli.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FundoLogo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JLabel iconSenha;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlMenuSuperior;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
