/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProfessorRole;

import Business.EcoSystem;
import userinterface.ProfessorRole.*;
import Business.Enterprise.Enterprise;
import Business.Organization.ProfessorOrganization;
import Business.Organization.StudentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.UUID;
import javax.swing.JPanel;

/**
 *
 * @author sumana
 */
public class ProfessorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceAgentWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private ProfessorOrganization professorOrganization;
    private Organization studentOrganization;
    private Enterprise enterprise;
    private EcoSystem business;

    public ProfessorWorkAreaJPanel(JPanel jpanel, UserAccount userAccount,Enterprise enterprise, Organization organization, EcoSystem business ) {
        initComponents();
        this.userProcessContainer = jpanel;
        this.userAccount = userAccount;
        this.professorOrganization = (ProfessorOrganization) organization;
        this.studentOrganization =  organization;
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

        btnAddNewCourse = new javax.swing.JButton();
        btnAssignCaseStudies = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        btnAddNewCourse.setBackground(new java.awt.Color(2, 79, 133));
        btnAddNewCourse.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnAddNewCourse.setForeground(new java.awt.Color(255, 255, 255));
        btnAddNewCourse.setText("Add New Course");
        btnAddNewCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewCourseActionPerformed(evt);
            }
        });
        add(btnAddNewCourse);
        btnAddNewCourse.setBounds(150, 160, 184, 41);

        btnAssignCaseStudies.setBackground(new java.awt.Color(2, 79, 133));
        btnAssignCaseStudies.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnAssignCaseStudies.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignCaseStudies.setText("Process Case Studies");
        btnAssignCaseStudies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignCaseStudiesActionPerformed(evt);
            }
        });
        add(btnAssignCaseStudies);
        btnAssignCaseStudies.setBounds(360, 160, 200, 39);

        jLabel8.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 79, 133));
        jLabel8.setText("Insurance Agent Work Area ");
        add(jLabel8);
        jLabel8.setBounds(200, 60, 320, 25);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddNewCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewCourseActionPerformed
        String courseNumber = UUID.randomUUID().toString().substring(0, 7);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddNewCourseJPanel", new AddCourseWorkAreaJPanel(userProcessContainer, userAccount, professorOrganization, enterprise, courseNumber));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAddNewCourseActionPerformed

    private void btnAssignCaseStudiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignCaseStudiesActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ProcessStudentCaseStudyRequestsJPanel", new ProcessStudentCaseStudyRequestsJPanel(userProcessContainer, userAccount, enterprise, studentOrganization, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAssignCaseStudiesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewCourse;
    private javax.swing.JButton btnAssignCaseStudies;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
