/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.devschool.login.visao;

import br.com.devschool.entidade.Funcionario;
import br.com.devschool.funcionario.servico.FuncionarioServico;
import br.com.devschool.funcionario.visao.FuncionarioFrame;
import br.com.devschool.principal.visao.PrincipalFrame;
import br.com.devschool.util.FrameUtil;
import br.com.devschool.util.MensagemUtil;
import br.com.devschool.util.PDVException;
import br.com.devschool.util.StringUtil;

/**
 *
 * @author Lab 19 M 01
 */
public class LoginFrame extends javax.swing.JFrame {

    private FuncionarioServico servico;
    
    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        try {
            servico = new FuncionarioServico();
        } catch (Exception ex) {
            MensagemUtil.addMensagemErro(ex.getMessage());
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextFieldCpf = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter data= new
            javax.swing.text.MaskFormatter("###.###.###-##");
            jFormattedTextFieldCpf = new 
            javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){
        }
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonLogar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelPrincipal.setLayout(null);

        jLabel1.setText("CPF:");
        jPanelPrincipal.add(jLabel1);
        jLabel1.setBounds(350, 170, 110, 20);
        jPanelPrincipal.add(jFormattedTextFieldCpf);
        jFormattedTextFieldCpf.setBounds(350, 190, 110, 20);

        jLabel2.setText("Senha:");
        jPanelPrincipal.add(jLabel2);
        jLabel2.setBounds(350, 230, 80, 20);
        jPanelPrincipal.add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(350, 250, 110, 20);

        jButtonLogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        jButtonLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogarActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonLogar);
        jButtonLogar.setBounds(350, 293, 50, 40);

        jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        jPanelPrincipal.add(jButtonSair);
        jButtonSair.setBounds(410, 293, 50, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(816, 638));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogarActionPerformed

        logar();
    }//GEN-LAST:event_jButtonLogarActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JFormattedTextField jFormattedTextFieldCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    // End of variables declaration//GEN-END:variables

    /**
     * Este método consulta o acesso do funcionário na base de dados.
     */
    private void logar() {
        try {
            validarCamposObrigatorios();
            String cpf = jFormattedTextFieldCpf.getText();
            String senha = StringUtil.criptografar(new String(jPasswordFieldSenha.getPassword()));
            
            Funcionario funcionario = servico.consultarPor(cpf, senha);
            
            if (funcionario == null || funcionario.isTransient()) {
                throw new PDVException("CPF/Senha incorretos.");
            } else {
                FrameUtil.funcionarioLogado = funcionario;
                new PrincipalFrame().setVisible(Boolean.TRUE);
                dispose();
            }
        } catch (Exception e) {
            MensagemUtil.addMensagemErro(e.getMessage());
        }
    }
    
    private void validarCamposObrigatorios() throws PDVException {
        String cpf = jFormattedTextFieldCpf.getText();
            
        if (cpf == null || cpf.equals("") || cpf.equals("   .   .   -  ")
                || jPasswordFieldSenha.getPassword().length == 0) {
            jFormattedTextFieldCpf.setBorder(FrameUtil.BORDA_VERMELHA);
            jPasswordFieldSenha.setBorder(FrameUtil.BORDA_VERMELHA);
            
            throw new PDVException("Os campos CPF e Senha devem ser preenchidos!");
        }
    }
}
