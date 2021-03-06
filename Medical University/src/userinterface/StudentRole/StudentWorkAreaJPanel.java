/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.EcoSystem;
import userinterface.InsuranceAgentRole.*;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JPanel;

/**
 *
 * @author sumana
 */
public class StudentWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAgentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private StudentOrganization studentOrganization;
    private Enterprise enterprise;
    private EcoSystem business;

    public StudentWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = jpanel;
        this.userAccount = userAccount;
        this.studentOrganization = (StudentOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegisterNewCourse = new javax.swing.JButton();
        btnProcessCaseStudyRequests = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnRegisterNewCourse.setBackground(new java.awt.Color(2, 79, 133));
        btnRegisterNewCourse.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnRegisterNewCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterNewCourse.setText("Register New Course");
        btnRegisterNewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewCourseActionPerformed(evt);
            }
        });
        add(btnRegisterNewCourse);
        btnRegisterNewCourse.setBounds(150, 160, 184, 41);

        btnProcessCaseStudyRequests.setBackground(new java.awt.Color(2, 79, 133));
        btnProcessCaseStudyRequests.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnProcessCaseStudyRequests.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessCaseStudyRequests.setText("Solve Case Studies");
        btnProcessCaseStudyRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessCaseStudyRequestsActionPerformed(evt);
            }
        });
        add(btnProcessCaseStudyRequests);
        btnProcessCaseStudyRequests.setBounds(360, 160, 200, 39);

        jLabel8.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 79, 133));
        jLabel8.setText("Student Work Area");
        add(jLabel8);
        jLabel8.setBounds(230, 60, 250, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterNewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewCourseActionPerformed
        String studentId = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RegisterCourseJPanel", new RegisterCourseJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnRegisterNewCourseActionPerformed

    private void btnProcessCaseStudyRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessCaseStudyRequestsActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StudentAssistantWorkAreaJPanel", new StudentCaseStudyRequestsJPanel(userProcessContainer, userAccount, studentOrganization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessCaseStudyRequestsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcessCaseStudyRequests;
    private javax.swing.JButton btnRegisterNewCourse;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
