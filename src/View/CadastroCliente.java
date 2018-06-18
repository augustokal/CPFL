/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Thais
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
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

        Superior = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        Principal = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtfCidade = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfCEP = new javax.swing.JTextField();
        jtfRua = new javax.swing.JTextField();
        jtfUF = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jtfNum = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JTextField();
        jtfUsuario = new javax.swing.JTextField();
        CampoSenha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CampoNum = new javax.swing.JLabel();
        CampoRua6 = new javax.swing.JLabel();
        CampoBairro1 = new javax.swing.JLabel();
        CampoCEP1 = new javax.swing.JLabel();
        CampoRua5 = new javax.swing.JLabel();
        CampoRua3 = new javax.swing.JLabel();
        CampoCidade = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        Superior.setBackground(new java.awt.Color(0, 152, 209));

        btnFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fechar.png"))); // NOI18N
        btnFechar.setToolTipText("");
        btnFechar.setBorderPainted(false);
        btnFechar.setContentAreaFilled(false);
        btnFechar.setFocusPainted(false);
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SuperiorLayout = new javax.swing.GroupLayout(Superior);
        Superior.setLayout(SuperiorLayout);
        SuperiorLayout.setHorizontalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SuperiorLayout.createSequentialGroup()
                .addGap(0, 512, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        SuperiorLayout.setVerticalGroup(
            SuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFechar)
        );

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Principal.setLayout(null);

        btnSalvar.setBackground(new java.awt.Color(0, 152, 209));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(null);
        btnSalvar.setBorderPainted(false);
        btnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalvar.setFocusPainted(false);
        Principal.add(btnSalvar);
        btnSalvar.setBounds(140, 500, 90, 30);

        btnCancelar.setBackground(new java.awt.Color(0, 152, 209));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        Principal.add(btnCancelar);
        btnCancelar.setBounds(310, 500, 90, 30);

        jtfCidade.setBackground(new java.awt.Color(235, 235, 235));
        jtfCidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfCidade.setBorder(null);
        Principal.add(jtfCidade);
        jtfCidade.setBounds(70, 325, 270, 20);

        jtfBairro.setBackground(new java.awt.Color(235, 235, 235));
        jtfBairro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfBairro.setBorder(null);
        Principal.add(jtfBairro);
        jtfBairro.setBounds(70, 260, 360, 20);

        jtfCEP.setBackground(new java.awt.Color(235, 235, 235));
        jtfCEP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfCEP.setBorder(null);
        Principal.add(jtfCEP);
        jtfCEP.setBounds(70, 200, 360, 20);

        jtfRua.setBackground(new java.awt.Color(235, 235, 235));
        jtfRua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfRua.setBorder(null);
        Principal.add(jtfRua);
        jtfRua.setBounds(70, 135, 270, 20);

        jtfUF.setBackground(new java.awt.Color(235, 235, 235));
        jtfUF.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfUF.setBorder(null);
        Principal.add(jtfUF);
        jtfUF.setBounds(380, 325, 50, 20);

        jtfNome.setBackground(new java.awt.Color(235, 235, 235));
        jtfNome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNome.setBorder(null);
        Principal.add(jtfNome);
        jtfNome.setBounds(70, 70, 360, 20);

        jtfNum.setBackground(new java.awt.Color(235, 235, 235));
        jtfNum.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfNum.setBorder(null);
        Principal.add(jtfNum);
        jtfNum.setBounds(380, 135, 50, 20);

        jtfSenha.setBackground(new java.awt.Color(235, 235, 235));
        jtfSenha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfSenha.setBorder(null);
        Principal.add(jtfSenha);
        jtfSenha.setBounds(70, 450, 370, 20);

        jtfUsuario.setBackground(new java.awt.Color(235, 235, 235));
        jtfUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtfUsuario.setBorder(null);
        Principal.add(jtfUsuario);
        jtfUsuario.setBounds(70, 390, 370, 20);

        CampoSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        Principal.add(CampoSenha);
        CampoSenha.setBounds(60, 440, 390, 50);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 152, 209));
        jLabel12.setText("Senha:");
        Principal.add(jLabel12);
        jLabel12.setBounds(70, 430, 60, 15);

        CampoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        Principal.add(CampoUsuario);
        CampoUsuario.setBounds(60, 380, 390, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 152, 209));
        jLabel11.setText("Usuário:");
        Principal.add(jLabel11);
        jLabel11.setBounds(70, 370, 60, 15);

        CampoNum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoPequeno.png"))); // NOI18N
        Principal.add(CampoNum);
        CampoNum.setBounds(375, 128, 80, 50);

        CampoRua6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        Principal.add(CampoRua6);
        CampoRua6.setBounds(60, 60, 390, 50);

        CampoBairro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        Principal.add(CampoBairro1);
        CampoBairro1.setBounds(60, 250, 390, 50);

        CampoCEP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoMaior.png"))); // NOI18N
        Principal.add(CampoCEP1);
        CampoCEP1.setBounds(60, 190, 390, 50);

        CampoRua5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campoPequeno.png"))); // NOI18N
        Principal.add(CampoRua5);
        CampoRua5.setBounds(370, 318, 80, 50);

        CampoRua3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campo.png"))); // NOI18N
        Principal.add(CampoRua3);
        CampoRua3.setBounds(60, 130, 300, 40);

        CampoCidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/campo.png"))); // NOI18N
        Principal.add(CampoCidade);
        CampoCidade.setBounds(60, 320, 300, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 152, 209));
        jLabel8.setText("Cidade:");
        Principal.add(jLabel8);
        jLabel8.setBounds(70, 300, 60, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 152, 209));
        jLabel7.setText("Bairro:");
        Principal.add(jLabel7);
        jLabel7.setBounds(70, 240, 60, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 152, 209));
        jLabel6.setText("CEP:");
        Principal.add(jLabel6);
        jLabel6.setBounds(70, 170, 38, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 152, 209));
        jLabel4.setText("Rua:");
        Principal.add(jLabel4);
        jLabel4.setBounds(70, 110, 38, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 152, 209));
        jLabel3.setText("Nome:");
        Principal.add(jLabel3);
        jLabel3.setBounds(70, 50, 38, 15);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 152, 209));
        jLabel2.setText("UF:");
        Principal.add(jLabel2);
        jLabel2.setBounds(380, 300, 30, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 152, 209));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8-torre-de-transmissão-filled-50.png"))); // NOI18N
        Principal.add(jLabel5);
        jLabel5.setBounds(370, 0, 50, 50);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 152, 209));
        jLabel9.setText("Cadastre-se");
        Principal.add(jLabel9);
        jLabel9.setBounds(210, 10, 141, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 152, 209));
        jLabel10.setText("Nº:");
        Principal.add(jLabel10);
        jLabel10.setBounds(380, 110, 38, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CampoBairro1;
    private javax.swing.JLabel CampoCEP1;
    private javax.swing.JLabel CampoCidade;
    private javax.swing.JLabel CampoNum;
    private javax.swing.JLabel CampoRua3;
    private javax.swing.JLabel CampoRua5;
    private javax.swing.JLabel CampoRua6;
    private javax.swing.JLabel CampoSenha;
    private javax.swing.JLabel CampoUsuario;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Superior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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