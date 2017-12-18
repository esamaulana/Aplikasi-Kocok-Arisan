/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.arisanuhuy.kocokarisan;

import javax.swing.JFrame;

/**
 *
 * @author faldi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public Login() {
        initComponents();
        
        setExtendedState(JFrame.WIDTH);
        setVisible(true);      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loginPanel = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        checkRememberMe = new javax.swing.JCheckBox();
        inputPassword = new javax.swing.JTextField();
        inputUsername = new javax.swing.JTextField();
        Logos = new javax.swing.JLabel();
        backgroundWall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(38, 56, 89));
        jLabel2.setForeground(new java.awt.Color(244, 173, 71));
        jLabel2.setText("Forget Password");
        jLabel2.setPreferredSize(new java.awt.Dimension(93, 23));
        mainFrame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 110, 20));

        loginPanel.setBackground(new java.awt.Color(244, 173, 71));
        loginPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPanelMouseClicked(evt);
            }
        });

        loginLabel.setBackground(new java.awt.Color(244, 173, 71));
        loginLabel.setFont(new java.awt.Font("Nexa Bold", 0, 24)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setText("LOG iN");
        loginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
        );

        mainFrame.add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 260, 40));

        checkRememberMe.setBackground(new java.awt.Color(38, 56, 89));
        checkRememberMe.setForeground(new java.awt.Color(244, 173, 71));
        checkRememberMe.setText("Remember Me");
        mainFrame.add(checkRememberMe, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        inputPassword.setBackground(new java.awt.Color(38, 56, 89));
        inputPassword.setForeground(new java.awt.Color(244, 173, 71));
        inputPassword.setBorder(null);
        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });
        mainFrame.add(inputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 260, 30));

        inputUsername.setBackground(new java.awt.Color(38, 56, 89));
        inputUsername.setForeground(new java.awt.Color(244, 173, 71));
        inputUsername.setBorder(null);
        inputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputUsernameActionPerformed(evt);
            }
        });
        mainFrame.add(inputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 260, 30));

        Logos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/logo.png"))); // NOI18N
        mainFrame.add(Logos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        backgroundWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background.png"))); // NOI18N
        backgroundWall.setText("adwdawa");
        backgroundWall.setToolTipText("");
        mainFrame.add(backgroundWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));
        backgroundWall.getAccessibleContext().setAccessibleName("");

        getContentPane().add(mainFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputUsernameActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void loginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginLabelMouseClicked

    private void loginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPanelMouseClicked

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logos;
    private javax.swing.JLabel backgroundWall;
    private javax.swing.JCheckBox checkRememberMe;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel mainFrame;
    // End of variables declaration//GEN-END:variables
}
