/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.Main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import leasing.Controllers.LeasingOfficerController;
import leasing.Controllers.VehicleController;
import leasing.ViewLease.Trial_Calculation;
import leasing.models.LeasingOfficer;
import leasing.models.Vehicle;

/**
 *
 * @author Sandali
 */
public class Login extends javax.swing.JFrame {

    public static String userid;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        try {
            FillUserIDCombo();
            userid = (String) usernameCombo.getSelectedItem();
            incorrectLabel.setVisible(false);
            loginButton.setEnabled(false);
            unlockLabel.setVisible(false);


        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }




    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lockLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        usernameCombo = new javax.swing.JComboBox();
        incorrectLabel = new javax.swing.JLabel();
        unlockLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lockLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leasing/images/lock.jpg"))); // NOI18N
        lockLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.add(lockLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 74, 73));

        jPanel2.setBackground(new java.awt.Color(1, 162, 201));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Vehicle Leasing");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 460, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, 170, 30));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 20));

        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordFieldMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordFieldMouseReleased(evt);
            }
        });
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        jPanel1.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 290, 40));

        loginButton.setBackground(new java.awt.Color(153, 153, 153));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel1.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 290, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, 29));

        usernameCombo.setEditable(true);
        usernameCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        usernameCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin" }));
        usernameCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                usernameComboItemStateChanged(evt);
            }
        });
        jPanel1.add(usernameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 170, 30));

        incorrectLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        incorrectLabel.setForeground(new java.awt.Color(204, 0, 0));
        incorrectLabel.setText("Password you entered is incorrect");
        jPanel1.add(incorrectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        unlockLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unlockLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leasing/images/unlock.jpg"))); // NOI18N
        jPanel1.add(unlockLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LeasingOfficer leasingOfficer = new LeasingOfficer();
        new Trial_Calculation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void usernameComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_usernameComboItemStateChanged
    }//GEN-LAST:event_usernameComboItemStateChanged

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        if (usernameCombo.getSelectedItem().equals("Admin") & passwordField.getText().equals("Admin")) {
            loginButton.requestFocus();
            loginButton.setEnabled(true);
            unlockLabel.setVisible(true);
            lockLabel.setVisible(false);
        } else {
            incorrectLabel.setVisible(true);
        }
        try {
            LeasingOfficer leasingOfficer = LeasingOfficerController.searchOfficer(usernameCombo.getSelectedItem());
            if (leasingOfficer != null) {
                if (passwordField.getPassword().equals(leasingOfficer.getPassword())) {
                    loginButton.requestFocus();
                    loginButton.setEnabled(true);
                    unlockLabel.setVisible(true);
                    lockLabel.setVisible(false);

                }else{
                    incorrectLabel.setVisible(true); 
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseClicked
    }//GEN-LAST:event_passwordFieldMouseClicked

    private void passwordFieldMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseReleased
        incorrectLabel.setVisible(false);
    }//GEN-LAST:event_passwordFieldMouseReleased

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
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lockLabel;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel unlockLabel;
    private javax.swing.JComboBox usernameCombo;
    // End of variables declaration//GEN-END:variables

    private void FillUserIDCombo() throws ClassNotFoundException, SQLException {
        ArrayList<LeasingOfficer> alluser = LeasingOfficerController.viewAllUser();
        for (LeasingOfficer leasingOfficer : alluser) {
            usernameCombo.addItem(leasingOfficer.getUserName());
        }
    }
}
