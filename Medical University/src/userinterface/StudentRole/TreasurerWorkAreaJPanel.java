/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.GovernmentFundRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author
 */
public class TreasurerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TreasurerWorkAreaJPanel
     */
    private JPanel jPanel;
    private UserAccount userAccount;
    private StudentOrganization treasurerOrganization;
    private Enterprise enterprise;

    public TreasurerWorkAreaJPanel(JPanel jpanel, UserAccount userAccount, Organization organization, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.jPanel = jpanel;
        this.treasurerOrganization = (StudentOrganization) organization;
        this.userAccount = userAccount;

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
        workRequestJTable = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        requestGovSecretaryBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel1.setText("Treasurer Work Area ");

        workRequestJTable.setBackground(new java.awt.Color(2, 79, 133));
        workRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Sender", "Receiver", "Status", "Amount", "Message", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        btnAssign.setBackground(new java.awt.Color(2, 79, 133));
        btnAssign.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign To Me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        requestGovSecretaryBtn.setBackground(new java.awt.Color(2, 79, 133));
        requestGovSecretaryBtn.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        requestGovSecretaryBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestGovSecretaryBtn.setText("Process Request");
        requestGovSecretaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestGovSecretaryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 734, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAssign)
                        .addGap(77, 77, 77)
                        .addComponent(requestGovSecretaryBtn)
                        .addGap(212, 212, 212)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(requestGovSecretaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            WorkRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 5);
            if (request.getStatus().equals("Sent to Treasurer")) {
                request.setReceiver(userAccount);
                request.setStatus("Pending on " + request.getReceiver().getEmployee().getName());
                populateTable();
                JOptionPane.showMessageDialog(null, "Success !! Request is assigned to you ");
            } else {
                JOptionPane.showMessageDialog(null, "Can't assign this work request, as the work request is in " + request.getStatus() + " status", "Warning!", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnAssignActionPerformed

    private void requestGovSecretaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestGovSecretaryBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first from the table to view details");
            return;
        } else {
            GovernmentFundRequest request = (GovernmentFundRequest) workRequestJTable.getValueAt(selectedRow, 5);
            if (request.getStatus().equalsIgnoreCase("Sent to Treasurer")) {
                JOptionPane.showMessageDialog(null, "Please assign selected request first");
                return;
            }
            if (request.getStatus().equalsIgnoreCase("Accepted")) {
                JOptionPane.showMessageDialog(null, "Request already completed", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.equals(request.getReceiver())) {
                JOptionPane.showMessageDialog(null, "Not Authorized", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (!userAccount.getEmployee().equals(request.getReceiver().getEmployee())) {
                JOptionPane.showMessageDialog(null, "Request assigned to other Officer", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (request.getStatus().equals("Rejected")) {
                JOptionPane.showMessageDialog(null, "Cannot process a Rejected Request", "Warning!", JOptionPane.WARNING_MESSAGE);
                return;
            }
            //request.setStatus("Processing");
            TreasurerProcessWorkRequestJPanel treasurerProcessWorkRequestJPanel = new TreasurerProcessWorkRequestJPanel(jPanel, request);
            jPanel.add("TreasurerProcessWorkRequestJPanel", treasurerProcessWorkRequestJPanel);
            CardLayout layout = (CardLayout) jPanel.getLayout();
            layout.next(jPanel);
        }
    }//GEN-LAST:event_requestGovSecretaryBtnActionPerformed

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);

        for (WorkRequest request : treasurerOrganization.getWorkQueue().getWorkRequests()) {
            String status = request.getStatus();
            Object[] row = new Object[6];
            row[0] = request.getSender().getEmployee().getName();
            if (status.equalsIgnoreCase("Sent to Treasurer") || status.equalsIgnoreCase("Sent to Secretary")) {
                row[1] = null;
            } else {
                row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            }

            row[2] = status;
            row[3] = ((GovernmentFundRequest) request).getRequestAmount();
            row[4] = ((GovernmentFundRequest) request).getMessage();
            row[5] = request;

            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        workRequestJTable.setRowSorter(sorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestGovSecretaryBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
