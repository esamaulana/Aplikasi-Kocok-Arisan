/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok1.kocokarisan.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author faldi
 */
public class ArisanBerjalan extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public ArisanBerjalan() {
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
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backgroundWall = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainFrame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        mainFrame.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        jLabel2.setBackground(new java.awt.Color(244, 173, 71));
        jLabel2.setFont(new java.awt.Font("Nexa Bold", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 173, 71));
        jLabel2.setText("Nama Group");
        mainFrame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 60));

        jLabel3.setBackground(new java.awt.Color(244, 173, 71));
        jLabel3.setFont(new java.awt.Font("Nexa Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 173, 71));
        jLabel3.setText("Jumlah Anggota");
        mainFrame.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 300, 60));

        jLabel4.setBackground(new java.awt.Color(244, 173, 71));
        jLabel4.setFont(new java.awt.Font("Nexa Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 173, 71));
        jLabel4.setText("Storan tiap pertemuan");
        mainFrame.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 300, 60));

        jLabel5.setBackground(new java.awt.Color(244, 173, 71));
        jLabel5.setFont(new java.awt.Font("Nexa Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(244, 173, 71));
        jLabel5.setText("Jadwal Pertemuan");
        mainFrame.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 300, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/plus bold.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        mainFrame.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        mainFrame.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 740, 340));

        backgroundWall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background.png"))); // NOI18N
        backgroundWall.setToolTipText("");
        mainFrame.add(backgroundWall, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        getContentPane().add(mainFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
         int dialogbtn = JOptionPane.YES_NO_OPTION;
        int dialogresult = JOptionPane.showConfirmDialog(this, "Yakin Kocok?", "Konfirmasi", dialogbtn);
        
        
        if (dialogresult == 0){
            KocokArisan nKocokArisan = new KocokArisan();
        nKocokArisan.setVisible(true);
            
                    }
        else
        {
        
        }
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        int dialogbtn = JOptionPane.YES_NO_OPTION;
        int dialogresult = JOptionPane.showConfirmDialog(this, "Yakin Keluar?", "Konfirmasi", dialogbtn);
        
        
        if (dialogresult == 0){
            Login nLogin = new Login();
            nLogin.setVisible(true);
            dispose();
            
                    }
        else
        {
        
        }
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(ArisanBerjalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ArisanBerjalan().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundWall;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel mainFrame;
    // End of variables declaration//GEN-END:variables
}