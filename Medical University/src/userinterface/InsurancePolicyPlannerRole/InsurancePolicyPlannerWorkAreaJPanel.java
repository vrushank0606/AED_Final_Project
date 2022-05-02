/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsurancePolicyPlannerRole;

import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Insurance.Insurance;
import Business.Organization.InsurancePolicyPlannerOrganization;
import Business.UserAccount.UserAccount;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sumana
 */
public class InsurancePolicyPlannerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private InsurancePolicyPlannerOrganization insurancePolicyPlannerOrganization;
    private InsuranceCompanyEnterprise insuranceCompanyEnterprise;

    /**
     * Creates new form InsurancePolicyPlannerJPanel
     */
    public InsurancePolicyPlannerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, InsurancePolicyPlannerOrganization insurancePolicyPlannerOrganization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.insurancePolicyPlannerOrganization = insurancePolicyPlannerOrganization;
        this.insuranceCompanyEnterprise = (InsuranceCompanyEnterprise) enterprise;

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
        jLabel2 = new javax.swing.JLabel();
        txtPolicyName = new javax.swing.JTextField();
        txtPolicyCoverage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPolicyTC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPolicies = new javax.swing.JTable();
        btnCreatePolicy = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtMonthlyPrem = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("Create a New Policy");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 218, -1));

        jLabel2.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 79, 133));
        jLabel2.setText("Policy Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtPolicyName.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtPolicyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPolicyNameActionPerformed(evt);
            }
        });
        add(txtPolicyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 158, -1));

        txtPolicyCoverage.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtPolicyCoverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 158, -1));

        jLabel3.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 79, 133));
        jLabel3.setText("Policy Coverage: ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        txtPolicyTC.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtPolicyTC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 158, -1));

        jLabel4.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 79, 133));
        jLabel4.setText("Policy Terms & Condition: ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("%");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(692, 465, -1, -1));

        jLabel6.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 79, 133));
        jLabel6.setText("Policy Planner Work Area");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 332, 26));

        tblPolicies.setBackground(new java.awt.Color(2, 79, 133));
        tblPolicies.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        tblPolicies.setForeground(new java.awt.Color(255, 255, 255));
        tblPolicies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Policy Name", "Policy Coverage %", "Monthly Premium", "Policy T&C"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPolicies);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 963, 92));

        btnCreatePolicy.setBackground(new java.awt.Color(2, 79, 133));
        btnCreatePolicy.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnCreatePolicy.setForeground(new java.awt.Color(255, 255, 255));
        btnCreatePolicy.setText("Create Policy");
        btnCreatePolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePolicyActionPerformed(evt);
            }
        });
        add(btnCreatePolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, 40));

        jLabel7.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 79, 133));
        jLabel7.setText("Monthly Premium(USD):");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        txtMonthlyPrem.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtMonthlyPrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 158, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePolicyActionPerformed
        String policyName = txtPolicyName.getText().trim();
        String poliCoverageTxt = txtPolicyCoverage.getText().trim();
        String monthlyPremiumTxt = txtMonthlyPrem.getText().trim();
        String policyTC = txtPolicyTC.getText().trim();
        
        if (policyName.equals("")) {
            JOptionPane.showMessageDialog(null, "Policy Name cannot be blank");
            return;
        }

        if (poliCoverageTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Policy Coverage cannot be blank");
            return;
        }

        if (monthlyPremiumTxt.equals("")) {
            JOptionPane.showMessageDialog(null, "Monthly Premium cannot be blank");
            return;
        }

        if (policyTC.equals("")) {
            JOptionPane.showMessageDialog(null, "Policy TC cannot be blank");
            return;
        }

        double policyCoverage = 0;
        try {
            policyCoverage = Double.parseDouble(poliCoverageTxt);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Input");

            return;
        }

        double monthlyPremium = 0;
        try {
            monthlyPremium = Double.parseDouble(monthlyPremiumTxt);
        } catch (NumberFormatException ne) {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }

        List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePolicyDirectory().getPolicies();
        for (Insurance insurance : policies) {
            if (policyName.equalsIgnoreCase(insurance.getPolicyName())) {
                JOptionPane.showMessageDialog(null, "Policy Name already exists");
                return;
            }
        }
        Insurance insurance = new Insurance(policyName, insuranceCompanyEnterprise.getName(), policyCoverage);
        insurance.setPolicyTC(policyTC);
        insurance.setMonthlyPremium(monthlyPremium);

        insuranceCompanyEnterprise.getInsurancePolicyDirectory().getPolicies().add(insurance);
        JOptionPane.showMessageDialog(null, "Policy added successfully");
        
        populateTable();
    }//GEN-LAST:event_btnCreatePolicyActionPerformed

    private void txtPolicyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPolicyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPolicyNameActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblPolicies.getModel();
        model.setRowCount(0);
        List<Insurance> policies = insuranceCompanyEnterprise.getInsurancePolicyDirectory().getPolicies();
        for (Insurance insurancePolicy : policies) {
            Object[] row = new Object[4];
            row[0] = insurancePolicy;
            row[1] = insurancePolicy.getCoverage();
            row[2] = insurancePolicy.getMonthlyPremium();
            row[3] = insurancePolicy.getPolicyTC();
            model.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        tblPolicies.setRowSorter(sorter);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreatePolicy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPolicies;
    private javax.swing.JTextField txtMonthlyPrem;
    private javax.swing.JTextField txtPolicyCoverage;
    private javax.swing.JTextField txtPolicyName;
    private javax.swing.JTextField txtPolicyTC;
    // End of variables declaration//GEN-END:variables

}