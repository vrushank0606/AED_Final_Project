/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeanRole;

import userinterface.InsuranceAgentRole.*;
import Business.Enterprise.Enterprise;

import Business.Organization.DeanOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Kavya
 */

public class StudentCaseStudyRequestsJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private DeanOrganization deanOrganization;

    public StudentCaseStudyRequestsJPanel(JPanel userProcessContainer, UserAccount userAccount, DeanOrganization deanOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.deanOrganization = deanOrganization;
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblInsuranceWorkTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : deanOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[8];
            String status = request.getStatus();
            row[0] = ((InsuranceWorkRequest) request);
            row[1] = ((InsuranceWorkRequest) request).getInsuranceCustomer().getCustomerFirstName() + " " + ((InsuranceWorkRequest) request).getInsuranceCustomer().getCustomerLastName();
            row[2] = ((InsuranceWorkRequest) request).getHealthCenter();

            row[3] = request.getSender().getEmployee().getName();
            row[4] = request.getReceiver();

            row[5] = ((InsuranceWorkRequest) request).getBillAmount();

            row[6] = ((InsuranceWorkRequest) request).getClaimAmount();
            row[7] = request.getStatus();

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblInsuranceWorkTable.setRowSorter(sorter);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInsuranceWorkTable = new javax.swing.JTable();
        btnProcessRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        tblInsuranceWorkTable.setBackground(new java.awt.Color(2, 79, 133));
        tblInsuranceWorkTable.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        tblInsuranceWorkTable.setForeground(new java.awt.Color(255, 255, 255));
        tblInsuranceWorkTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Patient Id", "Patient Name", "Health Center", "Sender ", "University", "Receiver Dean", "Course Name", "Medical Pactice", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInsuranceWorkTable);

        btnProcessRequest.setBackground(new java.awt.Color(2, 79, 133));
        btnProcessRequest.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnProcessRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnProcessRequest.setText("Process Request");
        btnProcessRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessRequestActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(2, 79, 133));
        btnBack.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(2, 79, 133));
        btnAssign.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("View Student Assessment");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(2, 79, 133));
        jLabel8.setText("Case Study Request Area ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)
                                .addGap(273, 273, 273)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(btnAssign)
                                .addGap(64, 64, 64)
                                .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcessRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessRequestActionPerformed
        int selectedRow = tblInsuranceWorkTable.getSelectedRow();
        InsuranceWorkRequest insuranceWorkRequest;

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to process");
            return;
        } else {
            insuranceWorkRequest = (InsuranceWorkRequest) tblInsuranceWorkTable.getValueAt(selectedRow, 0);

            if (insuranceWorkRequest.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "The request is rejected and cannot be processed further", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Sent to Secretary")) {
                JOptionPane.showMessageDialog(null, "The request is already processed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Sent")) {
                JOptionPane.showMessageDialog(null, "The request must be assigned first");
                return;
            }
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Sent to Finance Department")) {
                JOptionPane.showMessageDialog(null, "The request has been already sent to finance department");
                return;
            }
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Insurance Claim Approved")) {
                JOptionPane.showMessageDialog(null, "The insurance claim is already approved");
                return;
            }

            if (!userAccount.equals(insuranceWorkRequest.getReceiver())) {
                JOptionPane.showMessageDialog(null, "The user is not authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {

                CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
                userProcessContainer.add("ProcessRequestJPanel", new ProcessRequestJPanel(userProcessContainer, userAccount, enterprise, insuranceWorkRequest));
                cardLayout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnProcessRequestActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblInsuranceWorkTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view request");
            return;
        } else {
            InsuranceWorkRequest insuranceWorkRequest = (InsuranceWorkRequest) tblInsuranceWorkTable.getValueAt(selectedRow, 0);
            if (insuranceWorkRequest.getStatus().equals("Sent")) {
                insuranceWorkRequest.setReceiver(userAccount);
                insuranceWorkRequest.setStatus("Pending on Agent: " + userAccount.getEmployee().getName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is assigned to you successfully");
            } else {
                JOptionPane.showMessageDialog(null, "The request cannot be assigned as it is in " + insuranceWorkRequest.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcessRequest;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInsuranceWorkTable;
    // End of variables declaration//GEN-END:variables
}
