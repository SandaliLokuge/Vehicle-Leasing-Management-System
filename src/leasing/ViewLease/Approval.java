/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leasing.ViewLease;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import leasing.Controllers.ChequeforLeaseController;
import leasing.Controllers.LeaseController;
import leasing.Controllers.LeasingOfficerController;
import leasing.Main.Login;
import leasing.models.Check_for_Lease;
import leasing.models.Lease;
import leasing.models.LeasingOfficer;

/**
 *
 * @author Sandali
 */
public class Approval extends javax.swing.JFrame {

    /**
     * Creates new form Approval2
     */
    public Approval() {
        initComponents();
        leaseidText.setText(Customer_details.LeaseId);
        chequePanel.setVisible(false);
        LeaseButton.setVisible(false);
        approvedButton.setEnabled(false);
        detailsinputbyText.setText(Login.userid);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        approvedbyText = new javax.swing.JTextField();
        recoveryofficerText = new javax.swing.JTextField();
        leasingofficerText = new javax.swing.JTextField();
        detailsinputbyText = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        LeaseButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        leaseidText = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        chequePanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        issuedateText = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        chqnoText = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        amountText = new javax.swing.JTextField();
        bankCombo = new javax.swing.JComboBox();
        issuedbyText = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        approvedButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Approved by : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Recovery Officer :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Leasing Officer :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Details input by  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        approvedbyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedbyTextActionPerformed(evt);
            }
        });
        approvedbyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                approvedbyTextKeyReleased(evt);
            }
        });
        jPanel2.add(approvedbyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 270, -1));

        recoveryofficerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recoveryofficerTextActionPerformed(evt);
            }
        });
        recoveryofficerText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                recoveryofficerTextKeyReleased(evt);
            }
        });
        jPanel2.add(recoveryofficerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 270, -1));

        leasingofficerText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leasingofficerTextActionPerformed(evt);
            }
        });
        leasingofficerText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                leasingofficerTextKeyReleased(evt);
            }
        });
        jPanel2.add(leasingofficerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 270, -1));

        detailsinputbyText.setEditable(false);
        detailsinputbyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsinputbyTextActionPerformed(evt);
            }
        });
        detailsinputbyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                detailsinputbyTextKeyReleased(evt);
            }
        });
        jPanel2.add(detailsinputbyText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 270, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Miss" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 60, -1));

        jComboBox3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Miss" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, -1));

        jComboBox4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Miss" }));
        jPanel2.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 670, 220));

        LeaseButton.setBackground(new java.awt.Color(255, 255, 255));
        LeaseButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LeaseButton.setText("Lease");
        LeaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(LeaseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 630, 180, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Trial Calculation");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 113, 30));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jLabel25.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Lease ID");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        leaseidText.setEditable(false);
        leaseidText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        leaseidText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(leaseidText, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 210, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 750, 30));

        jPanel4.setBackground(new java.awt.Color(1, 162, 201));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 238, 238));
        jLabel9.setText("Vehicle Leasing");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(558, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 750, 30));

        chequePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("Cheque No. :");

        issuedateText.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Issued Date :");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setText("Amount  :");

        chqnoText.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setText("Bank :");

        amountText.setEditable(false);

        bankCombo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        bankCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bank of Ceylon", "NSB", "People's Bank" }));

        issuedbyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuedbyTextActionPerformed(evt);
            }
        });
        issuedbyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                issuedbyTextKeyReleased(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Issued by :");

        jComboBox5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr.", "Mrs.", "Miss" }));

        javax.swing.GroupLayout chequePanelLayout = new javax.swing.GroupLayout(chequePanel);
        chequePanel.setLayout(chequePanelLayout);
        chequePanelLayout.setHorizontalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePanelLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chequePanelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(issuedbyText, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(chequePanelLayout.createSequentialGroup()
                                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel10))
                                .addGap(39, 39, 39)
                                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chqnoText, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(issuedateText)
                                        .addComponent(bankCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(203, 203, 203))
        );
        chequePanelLayout.setVerticalGroup(
            chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chequePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(chequePanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(issuedateText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bankCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chqnoText, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountText, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(chequePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(issuedbyText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.add(chequePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 560, 250));

        approvedButton.setBackground(new java.awt.Color(255, 255, 255));
        approvedButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        approvedButton.setText("Approved");
        approvedButton.setEnabled(false);
        approvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approvedButtonActionPerformed(evt);
            }
        });
        jPanel1.add(approvedButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaseButtonActionPerformed
        
        String Approvedby = approvedbyText.getText();
        String RecoveryOfficer = recoveryofficerText.getText();
        String LeasingOfficer = leasingofficerText.getText();
        String Details_Inputby = detailsinputbyText.getText();
        String date = issuedateText.getText();
        
        Lease lease = new Lease(Customer_details.LeaseId, Trial_Calculation.TC_No, Customer_details.Clientcode, Login.userid, Vehicle_details.VehicleId, date, Trial_Calculation.Amount, Trial_Calculation.No_Installments, Trial_Calculation.InterestAmount, Trial_Calculation.InstallmentAmount, Approvedby, RecoveryOfficer, LeasingOfficer,Trial_Calculation.PrepaidAmount, Trial_Calculation.Period);
        
        try {
            int res = LeaseController.addLease(lease);
            if (res > 0) {
                JOptionPane.showMessageDialog(this, "Lease Details are added successfully");
            } else {
                JOptionPane.showMessageDialog(this, "Error on inserting details");
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Approval.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Approval.class.getName()).log(Level.SEVERE, null, ex);
        }
        String bankname = bankCombo.getSelectedItem().toString();
        String chequeno = chqnoText.getText();
        String issuedby = issuedbyText.getText();
        String issuedate = issuedateText.getText();
        
        Check_for_Lease check = new Check_for_Lease(chequeno, Customer_details.LeaseId, bankname, issuedby, issuedate, Trial_Calculation.Amount);
        try {
            int res1 = ChequeforLeaseController.addLeaseCheck(check);
        } catch (SQLException ex) {
            Logger.getLogger(Approval.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Approval.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);
        new ViewDetails().setVisible(true);
    }//GEN-LAST:event_LeaseButtonActionPerformed
    
    private void approvedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedButtonActionPerformed
        chequePanel.setVisible(true);
        LeaseButton.setVisible(true);
        LeaseButton.setEnabled(false);
        approvedButton.setVisible(false);
        setDate();
        amountText.setText(Double.toString(Trial_Calculation.Amount));
    }//GEN-LAST:event_approvedButtonActionPerformed
    
    private void issuedbyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuedbyTextActionPerformed
        LeaseButton.setEnabled(true);
    }//GEN-LAST:event_issuedbyTextActionPerformed
    
    private void issuedbyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issuedbyTextKeyReleased
        if (issuedbyText.getText().equals("") == true) {
            LeaseButton.setEnabled(false);
        }
    }//GEN-LAST:event_issuedbyTextKeyReleased
    
    private void approvedbyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approvedbyTextActionPerformed
        recoveryofficerText.requestFocus();
    }//GEN-LAST:event_approvedbyTextActionPerformed
    
    private void recoveryofficerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recoveryofficerTextActionPerformed
        leasingofficerText.requestFocus();
    }//GEN-LAST:event_recoveryofficerTextActionPerformed
    
    private void leasingofficerTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leasingofficerTextActionPerformed
        detailsinputbyText.requestFocus();
        if (approvedbyText.getText().equals("") | recoveryofficerText.getText().equals("") | leasingofficerText.getText().equals("") | detailsinputbyText.getText().equals("") == false) {
            approvedButton.setEnabled(true);
            
        }
    }//GEN-LAST:event_leasingofficerTextActionPerformed
    
    private void approvedbyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_approvedbyTextKeyReleased
        if (approvedbyText.getText().equals("") == true) {
            approvedButton.setEnabled(false);
        }
    }//GEN-LAST:event_approvedbyTextKeyReleased
    
    private void recoveryofficerTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_recoveryofficerTextKeyReleased
        if (recoveryofficerText.getText().equals("") == true) {
            approvedButton.setEnabled(false);
        }
    }//GEN-LAST:event_recoveryofficerTextKeyReleased
    
    private void leasingofficerTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_leasingofficerTextKeyReleased
        if (leasingofficerText.getText().equals("") == true) {
            approvedButton.setEnabled(false);
        }
    }//GEN-LAST:event_leasingofficerTextKeyReleased
    
    private void detailsinputbyTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_detailsinputbyTextKeyReleased
        if (detailsinputbyText.getText().equals("") == true) {
            approvedButton.setEnabled(false);
        }
    }//GEN-LAST:event_detailsinputbyTextKeyReleased
    
    private void detailsinputbyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsinputbyTextActionPerformed
    }//GEN-LAST:event_detailsinputbyTextActionPerformed

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
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Approval().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LeaseButton;
    private javax.swing.JTextField amountText;
    private javax.swing.JButton approvedButton;
    private javax.swing.JTextField approvedbyText;
    private javax.swing.JComboBox bankCombo;
    private javax.swing.JPanel chequePanel;
    private javax.swing.JTextField chqnoText;
    private javax.swing.JTextField detailsinputbyText;
    private javax.swing.JTextField issuedateText;
    private javax.swing.JTextField issuedbyText;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField leaseidText;
    private javax.swing.JTextField leasingofficerText;
    private javax.swing.JTextField recoveryofficerText;
    // End of variables declaration//GEN-END:variables

    private void setDate() {
        new Thread() {
            public void run() {
                while (true) {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
                    issuedateText.setText(dateFormat.format(new Date()));
                }
            }
        }.start();
    }
}
