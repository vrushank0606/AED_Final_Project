/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProfessorRole;

import userinterface.DoctorRole.*;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sumana
 */
public class ViewCaseStudyJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private PatientTreatmentWorkRequest request;

    /**
     * Creates new form ViewPatientJPanel
     */

    ViewCaseStudyJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, PatientTreatmentWorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.request = workRequest;
        
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMedicalCondition = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        txtMedicalPractice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCaseStudyType = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("Case Study Request Report");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 32, -1, -1));

        txtAge.setEditable(false);
        txtAge.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(478, 103, 139, -1));

        jLabel24.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(2, 79, 133));
        jLabel24.setText("Age :");
        add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 108, -1, -1));

        jLabel2.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 79, 133));
        jLabel2.setText("Patient Medical Condition:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 79, 133));
        jLabel3.setText("Student Medical Practice :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        txtPatientId.setEditable(false);
        txtPatientId.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtPatientId, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 103, 128, -1));

        jLabel4.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 79, 133));
        jLabel4.setText("Patient ID :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 108, -1, -1));

        txtMedicalCondition.setEditable(false);
        txtMedicalCondition.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtMedicalCondition, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 386, -1));

        backJButton.setBackground(new java.awt.Color(2, 79, 133));
        backJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 16, -1, -1));

        txtMedicalPractice.setEditable(false);
        txtMedicalPractice.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtMedicalPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 386, -1));

        jLabel5.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 79, 133));
        jLabel5.setText("Case Study Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        txtCaseStudyType.setEditable(false);
        txtCaseStudyType.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtCaseStudyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 386, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCaseStudyType;
    private javax.swing.JTextField txtMedicalCondition;
    private javax.swing.JTextField txtMedicalPractice;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables

    private void populate() {
//        txtFirstName.setText(request.getPatient().getPatientFirstName());
//        txtLastName.setText(request.getPatient().getPatientLastName());
        txtPatientId.setText(String.valueOf(request.getPatient().getPatientId()));
//        txtAddress.setText(request.getPatient().getAddress());
//        txtHomePhone.setText(request.getPatient().getContactNumber());
        txtAge.setText(String.valueOf(request.getPatient().getPatientAge()));
        txtMedicalCondition.setText(request.getReasonForVisit());
       txtMedicalPractice.setText(request.getCaseStudyStudentMedicalPractice());
       txtCaseStudyType.setText(request.getCaseStudyType());
    }
}
