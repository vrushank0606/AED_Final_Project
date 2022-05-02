/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.Course.Course;
import userinterface.ProfessorRole.*;
import Business.Enterprise.Enterprise;
import Business.Enterprise.UniversityEnterprise;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCustomer;
import Business.Student.Student;
import Business.Student.StudentDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author sumana
 */

public class RegisterCourseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private UniversityEnterprise universityEnterprise;
//    private String studentId;

    public RegisterCourseJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.universityEnterprise = (UniversityEnterprise) enterprise;
        this.userAccount = userAccount;
//        this.studentId = studentId;
        populateFields();
        populateTable();
    }
    
    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblCourse.getModel();

        dtm.setRowCount(0);
        List<Course> courses = universityEnterprise.getCourseDirectory().getCourses();
        for (Course course : courses) {
            Object[] row = new Object[4];
            row[0] = course;
            row[1] = course.getCourseNumber();
            row[2] = course.getMedicalPractice();
            row[3] = course.getRequirement();

            dtm.addRow(row);
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(dtm);
        tblCourse.setRowSorter(sorter);
    }
    
//    private boolean phonePatternCorrect() {
//        Pattern pattern = Pattern.compile("\\d{10}|(?:\\d{3}-){2}\\d{4}|\\(\\d{3}\\)\\d{3}-?\\d{4}");
//        Matcher matcher = pattern.matcher(txtPhone.getText());
//
//        boolean b = false;
//
//        if (matcher.matches()) {
//            b = true;
//        } else {
//            b = false;
//        }
//
//        return b;
//    }
//
//    private boolean emailPatternCheck() {
//        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",Pattern.CASE_INSENSITIVE);
//        Matcher matcher = pattern.matcher(txtEmailAddress.getText());
//
//        boolean b = false;
//
//        if (matcher.matches()) {
//            b = true;
//        } else {
//            b = false;
//        }
//
//        return b;
//    }
//    
//    private void refresh() {
////        txtPolicyNumber.setText(UUID.randomUUID().toString().substring(0, 7));
//        txtFirstName.setText("");
//        txtLastName.setText("");
//        txtPhone.setText("");
//        txtEmailAddress.setText("");
//        jDateChooserDob.setDate(null);
//        txtAddress.setText("");
//    }

    private void populateFields() {
//        txtPolicyNumber.setText(policyNumber);
        List<Course> courses = universityEnterprise.getCourseDirectory().getCourses();

        for (Course course : courses) {
            cmbCourseNumber.addItem(course);
        }

        Course selectedCourse = (Course) cmbCourseNumber.getSelectedItem();
        
        if(selectedCourse != null)
        {
        txtCourseName.setText(String.valueOf(selectedCourse.getCourseName()));
        txtMedicalPractice.setText(String.valueOf(selectedCourse.getMedicalPractice()));
        txtRequirement.setText(String.valueOf(selectedCourse.getRequirement()));
        }
        else{
            JOptionPane.showMessageDialog(null , "No existing course available");
            return;
        }
    }
    
    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPolicyNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cmbCourseNumber = new javax.swing.JComboBox();
        btnAddCustomer = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        txtMedicalPractice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtRequirement = new javax.swing.JTextField();

        txtPolicyNumber.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        txtPolicyNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPolicyNumberActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Skia", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("Register for Course");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 79, 133));
        jLabel2.setText("Course Number :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 79, 133));
        jLabel10.setText("Course Name:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        cmbCourseNumber.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        cmbCourseNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbCourseNumberFocusGained(evt);
            }
        });
        cmbCourseNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCourseNumberActionPerformed(evt);
            }
        });
        add(cmbCourseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 128, 220, 37));

        btnAddCustomer.setBackground(new java.awt.Color(0, 153, 255));
        btnAddCustomer.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        btnAddCustomer.setForeground(new java.awt.Color(2, 79, 133));
        btnAddCustomer.setText("Register for Course");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });
        add(btnAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, 40));

        jLabel12.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(2, 79, 133));
        jLabel12.setText("Course  Information");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 84, -1, -1));

        tblCourse.setBackground(new java.awt.Color(2, 79, 133));
        tblCourse.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        tblCourse.setForeground(new java.awt.Color(255, 255, 255));
        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course Name", "Course Number", "Medical Pactice", "Requirement"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCourse);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 813, 99));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("All Customers");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 380, -1, -1));

        backBtn.setBackground(new java.awt.Color(2, 79, 133));
        backBtn.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 17, -1, 40));

        jLabel14.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(2, 79, 133));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Requirement:");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, 122, -1));

        txtCourseName.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 220, 32));

        txtMedicalPractice.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtMedicalPractice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 220, 30));

        jLabel15.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(2, 79, 133));
        jLabel15.setText("Medical Practice:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        txtRequirement.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(txtRequirement, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 220, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        
//        if (txtFirstName.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Fisrt Name cannot be blank");
//            return;
//        }
//
//        if (txtLastName.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Last Name cannot be blank");
//            return;
//        }
//        
//        if (jDateChooserDob.getDate() == null) {
//            JOptionPane.showMessageDialog(null, "Date of birth cannot be blank");
//            return;
//        }
//
//        if (cmbGender.getItemCount() == 0) {
//            JOptionPane.showMessageDialog(null, "Please select a gender");
//            return;
//        }
//
//        if (cmbGender.getItemCount() == 0) {
//            JOptionPane.showMessageDialog(null, "Please select a gender");
//            return;
//        }
//
//        if (txtEmailAddress.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Email cannot be blank");
//            return;
//        }
//
//        if (txtPhone.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Phone number cannot be blank");
//            return;
//        }
//
//        if (txtAddress.getText().trim().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Address cannot be blank");
//            return;
//        }
//
////        if (txtCourseName.getText().trim().isEmpty()) {
////            JOptionPane.showMessageDialog(null, "Course name cannot be blank");
////            return;
////        }
////        if (txtMedicalPractice.getText().trim().isEmpty()) {
////            JOptionPane.showMessageDialog(null, "Medical Practice cannot be blank");
////            return;
////        } 
////        if (txtRequirement.getText().trim().isEmpty()) {
////            JOptionPane.showMessageDialog(null, "Requirement cannot be blank");
////            return;
////        }
//        else {
//            String firstName = txtFirstName.getText().trim();
//            String lastName = txtLastName.getText().trim();
//            SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
//            String dateOfBirth = "";
//            try {
//                dateOfBirth = sdf.format(jDateChooserDob.getDate());
//            } catch (Exception e) {
//                JOptionPane.showMessageDialog(null, "Please select date of birth");
//            }
//            String gender = cmbGender.getSelectedItem().toString();
//
//            String email = txtEmailAddress.getText().trim();
//            if (!emailPatternCheck()) {
//                JOptionPane.showMessageDialog(null, "Email is of pattern abc@email.com");
//                txtEmailAddress.setBorder(BorderFactory.createLineBorder(Color.RED));
//
//                return;
//            }
//
//            if (emailPatternCheck()) {
//                txtEmailAddress.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//            }
//
//            String address = txtAddress.getText().trim();
//
//            String phone = txtPhone.getText().trim();
//
//            if (!phonePatternCorrect()) {
//                JOptionPane.showMessageDialog(null, "Enter phone number in valid format");
//                txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED));
//                return;
//            }
//
//            if (phonePatternCorrect()) {
//                txtPhone.setBorder(BorderFactory.createLineBorder(Color.GRAY));
//            }

            String courseNumber = cmbCourseNumber.getSelectedItem().toString();
            String courseName = txtCourseName.getText().trim();
            String medicalPractice = txtMedicalPractice.getText().trim();
            double varRequirement = Double.parseDouble(txtRequirement.getText().trim());

            try {
                Double.parseDouble(txtRequirement.getText().trim());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter requirement in valid format");
                return;
            }

            Course course = new Course(courseNumber);

        universityEnterprise.getCourseDirectory().addNewCourse(course);
        JOptionPane.showMessageDialog(null, "Student registered successfully");
            populateTable();
//            refresh();
            JOptionPane.showMessageDialog(null, "Student registered successfully");
//        }
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void cmbCourseNumberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbCourseNumberFocusGained

    }//GEN-LAST:event_cmbCourseNumberFocusGained

    private void cmbCourseNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCourseNumberActionPerformed
        Course course = (Course) cmbCourseNumber.getSelectedItem();
        txtCourseName.setText(String.valueOf(course.getCourseName()));
        txtMedicalPractice.setText(String.valueOf(course.getMedicalPractice()));
        txtRequirement.setText(String.valueOf(course.getRequirement()));
    }//GEN-LAST:event_cmbCourseNumberActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtPolicyNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPolicyNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPolicyNumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JComboBox cmbCourseNumber;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtMedicalPractice;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtRequirement;
    // End of variables declaration//GEN-END:variables
}
