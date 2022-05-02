/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Enterprise.Enterprise;
import Business.Organization.ProfessorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sumana
 */
public class RequestCaseStudyProfessorApprovalJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private PatientTreatmentWorkRequest patientTreatmentWorkRequest;

    /**
     * Creates new form RequestLabTestJPanel
     */
    public RequestCaseStudyProfessorApprovalJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, PatientTreatmentWorkRequest patientTreatmentWorkRequest) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.patientTreatmentWorkRequest = patientTreatmentWorkRequest;
        valueLabel.setText(enterprise.getName());
        requestTestJButton.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCaseStudyType = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtstudentMedPractice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(2, 79, 133));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        requestTestJButton.setBackground(new java.awt.Color(2, 79, 133));
        requestTestJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Request Approval");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });
        add(requestTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 170, 30));

        jLabel1.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("Case Study Type:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 130, -1));

        txtCaseStudyType.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtCaseStudyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 230, 60));

        backJButton.setBackground(new java.awt.Color(2, 79, 133));
        backJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        valueLabel.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(2, 79, 133));
        valueLabel.setText("<value>");
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, 20));

        enterpriseLabel.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(2, 79, 133));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 80, 20));

        jLabel2.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 79, 133));
        jLabel2.setText("Student Medical Practice:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, -1));

        txtstudentMedPractice.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtstudentMedPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 300, 70));

        jLabel3.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 79, 133));
        jLabel3.setText("Case Study Approval Request for Professor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        String studentMedPractice = txtstudentMedPractice.getText().trim();
        txtCaseStudyType.setText(patientTreatmentWorkRequest.getCaseStudyType());
        txtCaseStudyType.setEnabled(false);

        if (studentMedPractice.equals("")) {
            JOptionPane.showMessageDialog(null, "Student Medical Practice cannot be null cannot be blank");
            return;
        }


        patientTreatmentWorkRequest.setCaseStudyStudentMedicalPractice(studentMedPractice);
        patientTreatmentWorkRequest.setSender(userAccount);
        patientTreatmentWorkRequest.setCaseStudyStatus("RequestSentToProfessor");
        patientTreatmentWorkRequest.setReceiver(null);

        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
            if (organization instanceof ProfessorOrganization) {
                org = organization;
                break;
            }
        }
        if (org != null) {
            org.getWorkQueue().getWorkRequests().add(patientTreatmentWorkRequest);
            userAccount.getWorkQueue().getWorkRequests().add(patientTreatmentWorkRequest);
            JOptionPane.showMessageDialog(null, "Case study request submitted successfully");
           txtCaseStudyType.setText("");
           txtstudentMedPractice.setText("");
            requestTestJButton.setEnabled(false);
        }

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StudentCaseStudyRequestsJPanel dwjp = (StudentCaseStudyRequestsJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTextField txtCaseStudyType;
    private javax.swing.JTextField txtstudentMedPractice;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
