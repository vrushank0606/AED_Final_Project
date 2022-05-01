/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceFinanceRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rakesh
 */
public class InsuranceFinanceProcessRequest extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private InsuranceWorkRequest insuranceWorkRequest;

    InsuranceFinanceProcessRequest(JPanel userProcessContainer, UserAccount userAccount, InsuranceWorkRequest insuranceWorkRequest, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.insuranceWorkRequest = insuranceWorkRequest;
        txtPolicyNumber.setText(insuranceWorkRequest.getPolicyNumber());
        txtSSN.setText(insuranceWorkRequest.getSsn());
        txtPolicyName.setText(insuranceWorkRequest.getPolicyName());
        txtClaimAmount.setText(String.valueOf(insuranceWorkRequest.getClaimAmount()));
        txtBillingAmount.setText(String.valueOf(insuranceWorkRequest.getBillAmount()));
        txtCoverage.setText(String.valueOf(insuranceWorkRequest.getInsuranceCustomer().getInsurance().getCoverage()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDisburse = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        txtPolicyNumber = new javax.swing.JTextField();
        txtPolicyName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtBillingAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtClaimAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSSN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCoverage = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnDisburse.setBackground(new java.awt.Color(2, 79, 133));
        btnDisburse.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnDisburse.setForeground(new java.awt.Color(255, 255, 255));
        btnDisburse.setText("Disburse Amount");
        btnDisburse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisburseActionPerformed(evt);
            }
        });
        add(btnDisburse);
        btnDisburse.setBounds(230, 350, 140, 32);

        btnReject.setBackground(new java.awt.Color(2, 79, 133));
        btnReject.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject Claim");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(390, 350, 114, 32);

        jLabel3.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 79, 133));
        jLabel3.setText("Insurance Finance Request Process Area ");
        add(jLabel3);
        jLabel3.setBounds(160, 20, 454, 25);

        jLabel4.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 79, 133));
        jLabel4.setText("Policy Number:");
        add(jLabel4);
        jLabel4.setBounds(220, 90, 110, 15);

        backBtn.setBackground(new java.awt.Color(2, 79, 133));
        backBtn.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(10, 23, 77, 29);

        txtPolicyNumber.setEditable(false);
        txtPolicyNumber.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtPolicyNumber);
        txtPolicyNumber.setBounds(370, 80, 140, 23);

        txtPolicyName.setEditable(false);
        txtPolicyName.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtPolicyName);
        txtPolicyName.setBounds(370, 210, 140, 23);

        jLabel1.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("PolicyName:");
        add(jLabel1);
        jLabel1.setBounds(240, 210, 90, 15);

        txtBillingAmount.setEditable(false);
        txtBillingAmount.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtBillingAmount);
        txtBillingAmount.setBounds(370, 250, 140, 23);

        jLabel6.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 79, 133));
        jLabel6.setText("Billing Amount:");
        add(jLabel6);
        jLabel6.setBounds(220, 250, 110, 15);

        txtClaimAmount.setEditable(false);
        txtClaimAmount.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtClaimAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaimAmountActionPerformed(evt);
            }
        });
        add(txtClaimAmount);
        txtClaimAmount.setBounds(370, 290, 140, 23);

        jLabel7.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 79, 133));
        jLabel7.setText("Claim Amount:");
        add(jLabel7);
        jLabel7.setBounds(230, 290, 100, 15);

        jLabel8.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 79, 133));
        jLabel8.setText("SSN:");
        add(jLabel8);
        jLabel8.setBounds(290, 130, 40, 15);

        txtSSN.setEditable(false);
        txtSSN.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtSSN);
        txtSSN.setBounds(370, 130, 140, 23);

        jLabel9.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 79, 133));
        jLabel9.setText("Coverage %:");
        add(jLabel9);
        jLabel9.setBounds(240, 170, 90, 15);

        txtCoverage.setEditable(false);
        txtCoverage.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtCoverage);
        txtCoverage.setBounds(370, 170, 140, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisburseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisburseActionPerformed

        btnDisburse.setEnabled(true);
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceWorkRequest.setStatus("Insurance Claim Approved");
            JOptionPane.showMessageDialog(null, "Claim has been approved successfully");
            btnDisburse.setEnabled(false);
            btnReject.setEnabled(false);
        }
    }//GEN-LAST:event_btnDisburseActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?");
        if (dialogResult == JOptionPane.YES_OPTION) {
            insuranceWorkRequest.setStatus("Insurance Claim Rejected");
            btnReject.setEnabled(false);
            btnDisburse.setEnabled(false);
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

    }//GEN-LAST:event_backBtnActionPerformed

    private void txtClaimAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaimAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaimAmountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnDisburse;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBillingAmount;
    private javax.swing.JTextField txtClaimAmount;
    private javax.swing.JTextField txtCoverage;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables
}
