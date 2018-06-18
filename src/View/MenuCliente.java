/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.CardLayout;

/**
 *
 * @author thais
 */
public class MenuCliente extends javax.swing.JFrame {

    /**
     * Creates new form MenuCliente
     */
    public MenuCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        Faturas = new javax.swing.JPanel();
        MeuCadastro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtfNum = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfUF = new javax.swing.JTextField();
        jtfRua = new javax.swing.JTextField();
        jtfCEP = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        CampoCidade = new javax.swing.JLabel();
        CampoRua3 = new javax.swing.JLabel();
        CampoRua5 = new javax.swing.JLabel();
        CampoCEP1 = new javax.swing.JLabel();
        CampoBairro1 = new javax.swing.JLabel();
        CampoRua6 = new javax.swing.JLabel();
        CampoRua7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfSenha = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        MenuSuperior = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        btnMeuCadastro = new javax.swing.JButton();
        btnFaturas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setLayout(new java.awt.CardLayout());

        Faturas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout FaturasLayout = new javax.swing.GroupLayout(Faturas);
        Faturas.setLayout(FaturasLayout);
        FaturasLayout.setHorizontalGroup(
            FaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1389, Short.MAX_VALUE)
        );
        FaturasLayout.setVerticalGroup(
            FaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 605, Short.MAX_VALUE)
        );

        Principal.add(Faturas, "Faturas");
        Faturas.getAccessibleContext().setAccessibleName("");

        MeuCadastro.setBackground(new java.awt.Color(255, 255, 255));
        MeuCadastro.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 152, 209));
        jLabel2.setText("UF:");
        MeuCadastro.add(jLabel2);
        jLabel2.setBounds(760, 290, 30, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 152, 209));
        jLabel3.setText("Nome:");
        MeuCadastro.add(jLabel3);
        jLabel3.setBounds(440, 30, 38, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 152, 209));
        jLabel4.setText("Rua:");
        MeuCadastro.add(jLabel4);
        jLabel4.setBounds(440, 90, 38, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 152, 209));
        jLabel5.setText("Nº:");
        MeuCadastro.add(jLabel5);
        jLabel5.setBounds(750, 90, 38, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 152, 209));
        jLabel6.setText("CEP:");
        MeuCadastro.add(jLabel6);
        jLabel6.setBounds(440, 150, 38, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 152, 209));
        jLabel7.setText("Bairro:");
        MeuCadastro.add(jLabel7);
        jLabel7.setBounds(440, 230, 60, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 152, 209));
        jLabel8.setText("Cidade:");
        MeuCadastro.add(jLabel8);
        jLabel8.setBounds(440, 290, 60, 15);

        jtfNum.setBackground(new java.awt.Color(235, 235, 235));
        jtfNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNum.setBorder(null);
        MeuCadastro.add(jtfNum);
        jtfNum.setBounds(760, 120, 50, 20);

        jtfNome.setBackground(new java.awt.Color(235, 235, 235));
        jtfNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNome.setBorder(null);
        MeuCadastro.add(jtfNome);
        jtfNome.setBounds(440, 50, 360, 20);

        jtfUF.setBackground(new java.awt.Color(235, 235, 235));
        jtfUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfUF.setBorder(null);
        MeuCadastro.add(jtfUF);
        jtfUF.setBounds(760, 320, 50, 20);

        jtfRua.setBackground(new java.awt.Color(235, 235, 235));
        jtfRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfRua.setBorder(null);
        MeuCadastro.add(jtfRua);
        jtfRua.setBounds(440, 120, 240, 20);

        jtfCEP.setBackground(new java.awt.Color(235, 235, 235));
        jtfCEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfCEP.setBorder(null);
        MeuCadastro.add(jtfCEP);
        jtfCEP.setBounds(440, 180, 360, 20);

        jtfBairro.setBackground(new java.awt.Color(235, 235, 235));
        jtfBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfBairro.setBorder(null);
        MeuCadastro.add(jtfBairro);
        jtfBairro.setBounds(440, 250, 360, 20);

        jtfCidade.setBackground(new java.awt.Color(235, 235, 235));
        jtfCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfCidade.setBorder(null);
        MeuCadastro.add(jtfCidade);
        jtfCidade.setBounds(440, 315, 270, 20);

        CampoCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campo.png"))); // NOI18N
        MeuCadastro.add(CampoCidade);
        CampoCidade.setBounds(430, 310, 300, 40);

        CampoRua3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campo.png"))); // NOI18N
        MeuCadastro.add(CampoRua3);
        CampoRua3.setBounds(430, 110, 300, 40);

        CampoRua5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoPequeno.png"))); // NOI18N
        MeuCadastro.add(CampoRua5);
        CampoRua5.setBounds(750, 310, 80, 50);

        CampoCEP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        MeuCadastro.add(CampoCEP1);
        CampoCEP1.setBounds(430, 170, 390, 50);

        CampoBairro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        MeuCadastro.add(CampoBairro1);
        CampoBairro1.setBounds(430, 240, 390, 50);

        CampoRua6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        MeuCadastro.add(CampoRua6);
        CampoRua6.setBounds(430, 40, 390, 50);

        CampoRua7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoPequeno.png"))); // NOI18N
        MeuCadastro.add(CampoRua7);
        CampoRua7.setBounds(750, 110, 80, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 152, 209));
        jLabel11.setText("Usuário:");
        MeuCadastro.add(jLabel11);
        jLabel11.setBounds(440, 360, 60, 15);

        CampoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        MeuCadastro.add(CampoUsuario);
        CampoUsuario.setBounds(430, 370, 390, 50);

        jtfUsuario.setBackground(new java.awt.Color(235, 235, 235));
        jtfUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfUsuario.setBorder(null);
        MeuCadastro.add(jtfUsuario);
        jtfUsuario.setBounds(440, 380, 240, 20);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 152, 209));
        jLabel12.setText("Senha:");
        MeuCadastro.add(jLabel12);
        jLabel12.setBounds(440, 420, 60, 15);

        jtfSenha.setBackground(new java.awt.Color(235, 235, 235));
        jtfSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfSenha.setBorder(null);
        MeuCadastro.add(jtfSenha);
        jtfSenha.setBounds(440, 440, 240, 20);

        CampoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        MeuCadastro.add(CampoSenha);
        CampoSenha.setBounds(430, 430, 390, 50);

        btnCancelar.setBackground(new java.awt.Color(0, 152, 209));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        MeuCadastro.add(btnCancelar);
        btnCancelar.setBounds(690, 520, 90, 30);

        btnEditar.setBackground(new java.awt.Color(0, 152, 209));
        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setFocusPainted(false);
        MeuCadastro.add(btnEditar);
        btnEditar.setBounds(590, 520, 90, 30);

        btnSalvar.setBackground(new java.awt.Color(0, 152, 209));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        MeuCadastro.add(btnSalvar);
        btnSalvar.setBounds(490, 520, 90, 30);

        Principal.add(MeuCadastro, "meuCadastro");

        MenuSuperior.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo CPFL.png"))); // NOI18N

        Menu.setBackground(new java.awt.Color(0, 152, 209));
        Menu.setLayout(null);

        btnMeuCadastro.setBackground(new java.awt.Color(0, 152, 209));
        btnMeuCadastro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMeuCadastro.setForeground(new java.awt.Color(255, 255, 255));
        btnMeuCadastro.setText("Meu Cadastro");
        btnMeuCadastro.setBorder(null);
        btnMeuCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMeuCadastro.setFocusPainted(false);
        btnMeuCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuCadastroActionPerformed(evt);
            }
        });
        Menu.add(btnMeuCadastro);
        btnMeuCadastro.setBounds(180, 0, 190, 40);

        btnFaturas.setBackground(new java.awt.Color(0, 152, 209));
        btnFaturas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFaturas.setForeground(new java.awt.Color(255, 255, 255));
        btnFaturas.setText("Minhas Faturas");
        btnFaturas.setBorder(null);
        btnFaturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFaturas.setFocusPainted(false);
        btnFaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaturasActionPerformed(evt);
            }
        });
        Menu.add(btnFaturas);
        btnFaturas.setBounds(0, 0, 180, 40);

        javax.swing.GroupLayout MenuSuperiorLayout = new javax.swing.GroupLayout(MenuSuperior);
        MenuSuperior.setLayout(MenuSuperiorLayout);
        MenuSuperiorLayout.setHorizontalGroup(
            MenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSuperiorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MenuSuperiorLayout.setVerticalGroup(
            MenuSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuSuperiorLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MenuSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MenuSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaturasActionPerformed
        MudarTelaMenu("Faturas");
    }//GEN-LAST:event_btnFaturasActionPerformed

    private void btnMeuCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuCadastroActionPerformed
        MudarTelaMenu("meuCadastro");
    }//GEN-LAST:event_btnMeuCadastroActionPerformed

    private void MudarTelaMenu(String tela) {
        CardLayout cl = (CardLayout) Principal.getLayout();
        cl.show(Principal, tela);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CampoBairro1;
    private javax.swing.JLabel CampoCEP1;
    private javax.swing.JLabel CampoCidade;
    private javax.swing.JLabel CampoRua3;
    private javax.swing.JLabel CampoRua5;
    private javax.swing.JLabel CampoRua6;
    private javax.swing.JLabel CampoRua7;
    private javax.swing.JLabel CampoSenha;
    private javax.swing.JLabel CampoUsuario;
    private javax.swing.JPanel Faturas;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuSuperior;
    private javax.swing.JPanel MeuCadastro;
    private javax.swing.JPanel Principal;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFaturas;
    private javax.swing.JButton btnMeuCadastro;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCEP;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNum;
    private javax.swing.JTextField jtfRua;
    private javax.swing.JTextField jtfSenha;
    private javax.swing.JTextField jtfUF;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
