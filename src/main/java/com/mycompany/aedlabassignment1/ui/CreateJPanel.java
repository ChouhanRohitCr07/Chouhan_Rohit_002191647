/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.aedlabassignment1.ui;

import com.mycompany.aedlabassignment1.model.UserCreation;
import java.io.File;
import javax.swing.JOptionPane;
import java.util.regex.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author jarvis
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form createJPanel
     */
    UserCreation userCreation;
    
    
    public CreateJPanel(UserCreation userCreation) {
        initComponents();
        this.userCreation= userCreation; 
        
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLicense = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtVehicleIndenticationNumber = new javax.swing.JTextField();
        lblSocialSecurityNumber = new javax.swing.JLabel();
        txtDeviceIdentificationNumber = new javax.swing.JTextField();
        lblMedicalRecordNumber = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblHealthPlanNumber = new javax.swing.JLabel();
        lblBankAccountNumber = new javax.swing.JLabel();
        lblLicenseNumber = new javax.swing.JLabel();
        lblVehicleIndentificationNumber = new javax.swing.JLabel();
        txtIPAddress = new javax.swing.JTextField();
        txtUniqueID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        lablTelephone = new javax.swing.JLabel();
        lblUniqueIdentificationNumber = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblDeviceIndentificationNumber = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        lblCreateUser = new javax.swing.JLabel();
        txtFaxNumber = new javax.swing.JTextField();
        txtEmailAddress = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedicalRecordNumber = new javax.swing.JTextField();
        txtHealthPlanNumber = new javax.swing.JTextField();
        txtBankAccountNumber = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();
        lblFingerPrint = new javax.swing.JLabel();
        btnFingerPrint = new javax.swing.JButton();

        lblEmail.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblEmail.setText("Email Address");

        lblSocialSecurityNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblSocialSecurityNumber.setText("Social Security Number");

        lblMedicalRecordNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblMedicalRecordNumber.setText("Medical Record Number");

        lblHealthPlanNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblHealthPlanNumber.setText("Health Plan Number");

        lblBankAccountNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblBankAccountNumber.setText("Bank Account Number");

        lblLicenseNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblLicenseNumber.setText("License Number");

        lblVehicleIndentificationNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblVehicleIndentificationNumber.setText("Vehicle Identification Number");

        lblName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblName.setText("Name");

        lblAddress.setText("Address");

        lblLinkedIn.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblLinkedIn.setText("LinkedIn");

        lblDOB.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblDOB.setText("Date Of Birth");

        lblIPAddress.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblIPAddress.setText("IP Address");

        lablTelephone.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lablTelephone.setText("Telephone");

        lblUniqueIdentificationNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUniqueIdentificationNumber.setText("Unique ID Number");

        lblFax.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblFax.setText("Fax Number");

        lblDeviceIndentificationNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblDeviceIndentificationNumber.setText("Device Identification Number");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtTelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelephoneActionPerformed(evt);
            }
        });

        lblCreateUser.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblCreateUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCreateUser.setText("                                CREATE USER PROFILE");

        txtFaxNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFaxNumberActionPerformed(evt);
            }
        });

        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });

        txtSSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSSNActionPerformed(evt);
            }
        });

        txtHealthPlanNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthPlanNumberActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });

        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("Image");

        btnImage.setText("Upload Image");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        lblFingerPrint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFingerPrint.setText("FingerPrint");

        btnFingerPrint.setText("Upload FingerPrints");
        btnFingerPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFingerPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addComponent(btnSave))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblDOB)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblVehicleIndentificationNumber)
                                                    .addComponent(lblUniqueIdentificationNumber)
                                                    .addComponent(lblIPAddress)
                                                    .addComponent(lblLinkedIn)
                                                    .addComponent(lblDeviceIndentificationNumber))
                                                .addComponent(lblLicenseNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblBankAccountNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblHealthPlanNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblMedicalRecordNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblSocialSecurityNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblFax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lablTelephone)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtIPAddress)
                                        .addComponent(txtLinkedIn, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtDeviceIdentificationNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtVehicleIndenticationNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtLicense, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtHealthPlanNumber)
                                        .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtAddress)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFingerPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(btnFingerPrint))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(btnImage)))))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblCreateUser)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddress))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lablTelephone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaxNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSocialSecurityNumber))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedicalRecordNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedicalRecordNumber))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHealthPlanNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVehicleIndenticationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehicleIndentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDeviceIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDeviceIndentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUniqueIdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnImage)
                        .addGap(38, 38, 38)
                        .addComponent(lblFingerPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFingerPrint)))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here 
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtTelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelephoneActionPerformed

    private void txtFaxNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFaxNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFaxNumberActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private void txtSSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSSNActionPerformed

    private void txtHealthPlanNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthPlanNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthPlanNumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
         // TODO add your handling code here:
        
        if (txtName.getText()== null || txtName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name field Can't be Empty");
        } else if (!Pattern.matches("[A-Za-z]+([ A-Za-z]+)*{20}", txtName.getText())) {
            JOptionPane.showMessageDialog(this, "Wrong input for name");
        } else{
            userCreation.setName(txtName.getText());
           
        }
        
        if (txtAddress.getText()==null || txtAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "You Need to fill address");
        } else if (!Pattern.matches("[/d A-Za-z0-9]", txtAddress.getText())) { 
            userCreation.setAddress(txtAddress.getText());
        } else{
            JOptionPane.showMessageDialog(this, "Your Address must start with digit eg Apt Number ");
        }
        
        if (txtDOB.getText()==null || txtDOB.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Date Of Birth");
            
        } else if (!Pattern.matches("(0[1-9]|1[012])[- /.](0[1-9]|[12][0-9]|3[01])[- /.](19|20)\\d\\d", txtDOB.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid DOB Input, Format - MM-DD-YYYY ");
        } else{
           userCreation.setDateOfBirth(txtDOB.getText()); 
        }
        
         if (txtTelephone.getText()==null || txtTelephone.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Telephone number required");    
        } else if (!Pattern.matches("^[1-9]{1}[0-9]{9}", (txtTelephone.getText()))) {
            JOptionPane.showMessageDialog(this, "Enter US telephone number format  ");
        } else{
           long num = Long.parseLong(txtTelephone.getText());
           userCreation.setTelephone(num); 
        }
         
         if (txtFaxNumber.getText()==null || txtFaxNumber.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fax number required");    
        } else if (!Pattern.matches("^(\\+?\\d{1,}(\\s?|\\-?)\\d*(\\s?|\\-?)\\(?\\d{2,}\\)?(\\s?|\\-?)\\d{3,}\\s?\\d{3,})$", txtFaxNumber.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Fax Number  ");
        } else{
           userCreation.setFaxNumber(txtFaxNumber.getText()); 
        }
         
         if (txtEmailAddress.getText()==null || txtEmailAddress.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Email Address is Mandatory");
            
        } else if (!Pattern.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$", txtEmailAddress.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Email Format");
        } else{
           userCreation.setEmailAddress(txtEmailAddress.getText()); 
        }
        
        
        userCreation.setFaxNumber(txtFaxNumber.getText());
        userCreation.setEmailAddress(txtEmailAddress.getText());
        userCreation.setSocialSecurityNumber(txtSSN.getText());
        userCreation.setMedicalRecordNumber(txtMedicalRecordNumber.getText());
        userCreation.setHealthPlanBeneficiaryNumber(txtHealthPlanNumber.getText());
        userCreation.setBankAccountNumber(txtBankAccountNumber.getText());
        userCreation.setLicenseNumber(txtLicense.getText());
        userCreation.setVehicleIndentificationSerialNumber(txtVehicleIndenticationNumber.getText());
        userCreation.setDeviceIdentificationSerialNumber(txtDeviceIdentificationNumber.getText());
        userCreation.setLinkedin(txtLinkedIn.getText());
        userCreation.setUniqueIdentificationNumber(txtUniqueID.getText());
        
        
        JOptionPane.showMessageDialog(this, "Information Saved.");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here 
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void btnFingerPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFingerPrintActionPerformed
        // TODO add your handling code here:
        JFileChooser jfileChooser= new JFileChooser();
        jfileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images","jpg","png","gif","jpeg"));
        int resultFingerPrintImage = jfileChooser.showOpenDialog(this);
        if (resultFingerPrintImage== javax.swing.JFileChooser.APPROVE_OPTION) {
            File FingerPrintFile = jfileChooser.getSelectedFile();
            String fFingerPrintString = FingerPrintFile.toString();
            userCreation.setFingerPrintImageSrc(fFingerPrintString);
            lblFingerPrint.setText(fFingerPrintString);
        }
    }//GEN-LAST:event_btnFingerPrintActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
        JFileChooser jfileChooser1= new JFileChooser();
        jfileChooser1.addChoosableFileFilter(new FileNameExtensionFilter("Images","jpg","png","gif","jpeg"));
        int resultImage = jfileChooser1.showOpenDialog(this);
        if(resultImage == javax.swing.JFileChooser.APPROVE_OPTION){
            File SelectedFile = jfileChooser1.getSelectedFile();
            String fName = SelectedFile.toString();
            userCreation.setImageSrc(fName);
            lblImage.setText(fName);
        }
    }//GEN-LAST:event_btnImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFingerPrint;
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lablTelephone;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBankAccountNumber;
    private javax.swing.JLabel lblCreateUser;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceIndentificationNumber;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblFingerPrint;
    private javax.swing.JLabel lblHealthPlanNumber;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicenseNumber;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedicalRecordNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSocialSecurityNumber;
    private javax.swing.JLabel lblUniqueIdentificationNumber;
    private javax.swing.JLabel lblVehicleIndentificationNumber;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBankAccountNumber;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDeviceIdentificationNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFaxNumber;
    private javax.swing.JTextField txtHealthPlanNumber;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedicalRecordNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelephone;
    private javax.swing.JTextField txtUniqueID;
    private javax.swing.JTextField txtVehicleIndenticationNumber;
    // End of variables declaration//GEN-END:variables
}