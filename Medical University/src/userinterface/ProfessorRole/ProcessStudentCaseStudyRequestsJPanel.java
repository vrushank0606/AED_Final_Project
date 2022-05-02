/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ProfessorRole;

import userinterface.StudentRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.StudentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sumana
 */
public class ProcessStudentCaseStudyRequestsJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private Organization studentOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public ProcessStudentCaseStudyRequestsJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, Organization organization,  EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.studentOrganization =  organization;
        this.enterprise = enterprise;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : studentOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = ((PatientTreatmentWorkRequest) request).getPatient().getPatientFirstName() + " " + ((PatientTreatmentWorkRequest) request).getPatient().getPatientLastName();
            row[3] = ((PatientTreatmentWorkRequest) request).getReasonForVisit();
            row[4] = ((PatientTreatmentWorkRequest) request).getAssignedDoctor();
            row[5] = ((PatientTreatmentWorkRequest) request).getStudentAssistant();
            row[6] = ((PatientTreatmentWorkRequest) request).getCaseStudyStatus();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }
    //((PatientTreatmentWorkRequest) request).getStudentAssistant();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewCaseStudyJButton = new javax.swing.JButton();
        approveJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        viewCaseStudyJButton.setBackground(new java.awt.Color(2, 79, 133));
        viewCaseStudyJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        viewCaseStudyJButton.setForeground(new java.awt.Color(255, 255, 255));
        viewCaseStudyJButton.setText("View Student Case Study Request");
        viewCaseStudyJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewCaseStudyJButtonActionPerformed(evt);
            }
        });
        add(viewCaseStudyJButton);
        viewCaseStudyJButton.setBounds(150, 390, 310, 40);

        approveJButton.setBackground(new java.awt.Color(2, 79, 133));
        approveJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        approveJButton.setForeground(new java.awt.Color(255, 255, 255));
        approveJButton.setText("Approve");
        approveJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveJButtonActionPerformed(evt);
            }
        });
        add(approveJButton);
        approveJButton.setBounds(510, 390, 170, 40);

        jLabel3.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 79, 133));
        jLabel3.setText("Student Case Study Work Queue");
        add(jLabel3);
        jLabel3.setBounds(380, 40, 410, 29);

        workRequestJTable.setBackground(new java.awt.Color(2, 79, 133));
        workRequestJTable.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Patient Name", "Illness", "Assigned Doctor", "Receiver", "Case Study Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(130, 130, 900, 220);

        refreshJButton1.setBackground(new java.awt.Color(2, 79, 133));
        refreshJButton1.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        refreshJButton1.setForeground(new java.awt.Color(255, 255, 255));
        refreshJButton1.setText("Refresh");
        refreshJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButton1ActionPerformed(evt);
            }
        });
        add(refreshJButton1);
        refreshJButton1.setBounds(750, 390, 140, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void viewCaseStudyJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewCaseStudyJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        PatientTreatmentWorkRequest workRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to request");
            return;
        } else {
            workRequest = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
            
            if (workRequest.getStudentAssistant()!= null) {
               
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    userProcessContainer.add("ViewCaseStudyJPanel", new ViewCaseStudyJPanel(userProcessContainer, userAccount, enterprise, workRequest));
                    layout.next(userProcessContainer);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "You are not Authorised");
                }
            } 
        
    }//GEN-LAST:event_viewCaseStudyJButtonActionPerformed

    private void approveJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        }
        
        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

       // request.setStatus("Processing");
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        if (request.getStudentAssistant() != null) {
            if (request.getCaseStudyStatus() == "RequestSentToProfessor") {
                request.setCaseStudyStatus("ProfessorApproved");
                JOptionPane.showMessageDialog(null, "Case study request approved");
            } else {
                JOptionPane.showMessageDialog(null, "Case study not in requested status");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please approve case study requests before proceeeding.");
        }
    }//GEN-LAST:event_approveJButtonActionPerformed

    private void refreshJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_refreshJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveJButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton1;
    private javax.swing.JButton viewCaseStudyJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
