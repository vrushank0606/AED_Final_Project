/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceFinanceRole;

import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceFinanceOrganization;
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
 * @author vrushankhiremath
 * 
 */
public class InsuranceFinanceWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsuranceFinanceOrganization insuranceFinanceOrganization;
    private Enterprise enterprise;

    /**
     * Creates new form InsuranceFinanceWorkAreaJPanel
     */
    public InsuranceFinanceWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, InsuranceFinanceOrganization insuranceFinanceOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.insuranceFinanceOrganization = insuranceFinanceOrganization;
        this.enterprise = enterprise;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFinance = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        processRequestBtn2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("Insurance Finance Work Area");

        tblFinance.setBackground(new java.awt.Color(2, 79, 133));
        tblFinance.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        tblFinance.setForeground(new java.awt.Color(255, 255, 255));
        tblFinance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Policy Number", "Policy Name", "Coverage%", "Claim Amount", "Bill Amount", "Insurance Claim Status", "Requesting HealthCenter ", "Finance Manager"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFinance);

        btnAssign.setBackground(new java.awt.Color(2, 79, 133));
        btnAssign.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        processRequestBtn2.setBackground(new java.awt.Color(2, 79, 133));
        processRequestBtn2.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        processRequestBtn2.setForeground(new java.awt.Color(255, 255, 255));
        processRequestBtn2.setText("Process Request");
        processRequestBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processRequestBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 300, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(processRequestBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processRequestBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblFinance.getModel();
        model.setRowCount(0);

        for (WorkRequest workRequest : insuranceFinanceOrganization.getWorkQueue().getWorkRequests()) {
            InsuranceWorkRequest insuranceworkRequest = ((InsuranceWorkRequest) workRequest);
            Object[] row = new Object[8];
            row[0] = insuranceworkRequest;
            row[1] = insuranceworkRequest.getPolicyName();
            row[2] = insuranceworkRequest.getInsuranceCustomer().getInsurance().getCoverage();
            row[3] = insuranceworkRequest.getClaimAmount();
            row[4] = insuranceworkRequest.getBillAmount();
            row[5] = insuranceworkRequest.getStatus();
            row[6] = insuranceworkRequest.getInsuranceCompany();
            row[7] = insuranceworkRequest.getReceiver() == null ? "" : insuranceworkRequest.getReceiver().getEmployee().getName();

            model.addRow(row);
        }
        
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblFinance.setRowSorter(sorter);
    }
    
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = tblFinance.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {
            WorkRequest request = (InsuranceWorkRequest) tblFinance.getValueAt(selectedRow, 0);
            if (request.getStatus().equals("Sent To Finance Department")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Request is assigned to you successfully");
            } else {
                JOptionPane.showMessageDialog(null, "Failed, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void processRequestBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processRequestBtn2ActionPerformed
        int selectedRow = tblFinance.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row to view details");
            return;
        } else {

            InsuranceWorkRequest insuranceWorkRequest = (InsuranceWorkRequest) tblFinance.getValueAt(selectedRow, 0);
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Sent To Finance Department")) {
                JOptionPane.showMessageDialog(null, "The request must be assigned before proceeding");
                return;
            }
            if (insuranceWorkRequest.getStatus().equalsIgnoreCase("Insurance Claim Approved")) {
                JOptionPane.showMessageDialog(null, "Request has already been completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(insuranceWorkRequest.getReceiver())) {
                JOptionPane.showMessageDialog(null, "You are not authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.getEmployee().equals(insuranceWorkRequest.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request is assigned to different officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (insuranceWorkRequest.getStatus().equals("Insurance Claim Rejected")) {
                JOptionPane.showMessageDialog(null, "The request is rejected and cannot be processed further", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                InsuranceFinanceProcessRequest panel = new InsuranceFinanceProcessRequest(userProcessContainer, userAccount, insuranceWorkRequest, enterprise);
                userProcessContainer.add("OfficerProcessWorkRequestJPanel", panel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_processRequestBtn2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processRequestBtn2;
    private javax.swing.JTable tblFinance;
    // End of variables declaration//GEN-END:variables
}
