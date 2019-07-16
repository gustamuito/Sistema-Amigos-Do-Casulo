/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacasulono;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author VTGuilherme-Inf181
 */
public class InformacoesGerais extends javax.swing.JFrame {

    /**
     * Creates new form InformaçõesGerais
     */
    public InformacoesGerais() {
        initComponents();
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblEnd = new javax.swing.JLabel();
        txtEnd = new javax.swing.JTextField();
        lblFone = new javax.swing.JLabel();
        lblDiri = new javax.swing.JLabel();
        txtDiri = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ftxtData = new javax.swing.JFormattedTextField();
        lblData = new javax.swing.JLabel();
        lblGuia = new javax.swing.JLabel();
        txtGuia = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnProx = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        txtFone = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome do Serviço de Acolhimento Institucional:");
        getContentPane().add(lblNome);
        lblNome.setBounds(76, 264, 287, 15);
        getContentPane().add(txtNome);
        txtNome.setBounds(369, 257, 387, 28);

        lblEnd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEnd.setText("Endereço:");
        getContentPane().add(lblEnd);
        lblEnd.setBounds(303, 314, 60, 25);
        getContentPane().add(txtEnd);
        txtEnd.setBounds(369, 312, 325, 28);

        lblFone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFone.setText("Telefone:");
        getContentPane().add(lblFone);
        lblFone.setBounds(307, 368, 56, 25);

        lblDiri.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiri.setText("Dirigiente:");
        getContentPane().add(lblDiri);
        lblDiri.setBounds(300, 427, 63, 25);
        getContentPane().add(txtDiri);
        txtDiri.setBounds(369, 427, 191, 28);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setText("INFORMAÇÕES DO SERVIÇO DE ACOLHIMENTO");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(98, 176, 872, 48);

        try {
            ftxtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(ftxtData);
        ftxtData.setBounds(1005, 313, 75, 26);

        lblData.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblData.setText("Data:");
        getContentPane().add(lblData);
        lblData.setBounds(959, 313, 40, 27);

        lblGuia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGuia.setText("Nº Guia de Recolhimento: ");
        getContentPane().add(lblGuia);
        lblGuia.setBounds(840, 264, 159, 15);
        getContentPane().add(txtGuia);
        txtGuia.setBounds(1005, 257, 75, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MiniLogo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 350, 170);

        btnGravar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/disquete.png"))); // NOI18N
        btnGravar.setText("Gravar");
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGravar);
        btnGravar.setBounds(810, 499, 90, 40);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Limpar.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar);
        btnLimpar.setBounds(910, 499, 90, 40);

        btnProx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Seta.png"))); // NOI18N
        btnProx.setText("Próxima etapa");
        btnProx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProxActionPerformed(evt);
            }
        });
        getContentPane().add(btnProx);
        btnProx.setBounds(1010, 499, 136, 40);

        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu);
        btnMenu.setBounds(710, 499, 90, 40);

        try {
            txtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtFone);
        txtFone.setBounds(370, 370, 130, 28);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fundo.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1210, 560);

        setSize(new java.awt.Dimension(1185, 558));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtFone.setText("");
        txtDiri.setText("");
        txtGuia.setText("");
        txtEnd.setText("");
        txtNome.setText("");
        ftxtData.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        try {
            /*Connection - classe usada para estabelecer uma conexão com o banco. Neste momento devemos informar
             o endereço do servidor(IP) o nome do Banco e o usuário e nenha de acesso   */
            Connection con;
            con = (Connection) DriverManager.getConnection("jdbc:mysql://127.0.0.1/sistemacasulo", "root", "");
            String sql;// String para receber a Scrip(O comando SQL que será usado-Insert/Update/DLETE)
            sql = "INSERT INTO inf_d_serv_d_acolhi(N_Guia_Recolhimento,Data,Nome_d_serv_d_acolhi_insti,Endereco,Telefone,Dirigente)VALUES(?,?,?,?,?,?)";
            /*uma forma de você fazer uma inserção no banco mais segura,
             onde você prepara os parametros para serem inseridos */
            PreparedStatement ps;
            ps = (PreparedStatement) con.prepareStatement(sql);
            ps.setString(1, txtGuia.getText());
            ps.setString(2, ftxtData.getText());
            ps.setString(3, txtNome.getText());
            ps.setString(4, txtEnd.getText());
            ps.setString(5, txtFone.getText());
            ps.setString(6, txtDiri.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Falha no Cadastro");
            }
        } catch (SQLException ex)//Se ocorrer algum erro uma mensagem é exibida.
        {
            JOptionPane.showMessageDialog(null, "SQLException: ");
            JOptionPane.showMessageDialog(null, "SQLException: " + ex.getMessage() + "\nSQLState: " + ex.getSQLState()
                    + "\nVendorError: " + ex.getErrorCode());
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnProxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProxActionPerformed
        InfCA pnelso = new InfCA();
        pnelso.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnProxActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu pnelso = new Menu();
        pnelso.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(InformacoesGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacoesGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacoesGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacoesGerais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacoesGerais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProx;
    private javax.swing.JFormattedTextField ftxtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblDiri;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblFone;
    private javax.swing.JLabel lblGuia;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtDiri;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JFormattedTextField txtFone;
    private javax.swing.JTextField txtGuia;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
