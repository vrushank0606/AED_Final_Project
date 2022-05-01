/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.*;
import Business.Network.Network;
import Business.Role.EnterpriseAdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * 
 * @author Kavya
 */

public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;
    private Employee employee;
    private UserAccountDirectory userAccountDirectory;

    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        usernameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        reEnterPasswordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        nameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateNetworkComboBox();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworks()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[4];
                    row[0] = enterprise.getName();
                    row[1] = network.getName();
                    row[2] = userAccount.getUsername();
                    row[3] = enterprise.getEnterpriseType().getValue();

                    model.addRow(row);
                }
                TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        enterpriseJTable.setRowSorter(sorter);
            }
        }
         TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        enterpriseJTable.setRowSorter(sorter);
    }

    private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : system.getNetworks()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterpriseComboBox(Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            enterpriseJComboBox.addItem(enterprise);
        }

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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        usernameJLabel = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        passwordJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        nameJLabel = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        backJButton = new javax.swing.JButton();
        reEnterPasswordJPasswordField = new javax.swing.JPasswordField();
        rePasswordJLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        enterpriseJTable.setBackground(new java.awt.Color(71, 71, 168));
        enterpriseJTable.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        enterpriseJTable.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Username", "Enterprise Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(250, 410, 671, 88);

        jLabel1.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 79, 133));
        jLabel1.setText("Network:");
        add(jLabel1);
        jLabel1.setBounds(290, 100, 70, 19);

        networkJComboBox.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox);
        networkJComboBox.setBounds(360, 100, 136, 30);

        usernameJLabel.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        usernameJLabel.setForeground(new java.awt.Color(2, 79, 133));
        usernameJLabel.setText("Username:");
        add(usernameJLabel);
        usernameJLabel.setBounds(450, 150, 80, 19);

        usernameJTextField.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(usernameJTextField);
        usernameJTextField.setBounds(530, 150, 136, 25);

        jLabel3.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 79, 133));
        jLabel3.setText("Enterprise:");
        add(jLabel3);
        jLabel3.setBounds(610, 100, 80, 20);

        enterpriseJComboBox.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseJComboBox);
        enterpriseJComboBox.setBounds(700, 100, 136, 30);

        submitJButton.setBackground(new java.awt.Color(102, 102, 102));
        submitJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton);
        submitJButton.setBounds(680, 320, 80, 27);

        passwordJLabel.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        passwordJLabel.setForeground(new java.awt.Color(2, 79, 133));
        passwordJLabel.setText("Password:");
        add(passwordJLabel);
        passwordJLabel.setBounds(440, 200, 80, 19);

        nameJTextField.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(nameJTextField);
        nameJTextField.setBounds(530, 270, 136, 28);

        nameJLabel.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        nameJLabel.setForeground(new java.awt.Color(2, 79, 133));
        nameJLabel.setText("Name:");
        add(nameJLabel);
        nameJLabel.setBounds(470, 280, 50, 19);

        passwordJPasswordField.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(passwordJPasswordField);
        passwordJPasswordField.setBounds(530, 190, 136, 25);

        backJButton.setBackground(new java.awt.Color(2, 79, 133));
        backJButton.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(20, 30, 67, 27);

        reEnterPasswordJPasswordField.setFont(new java.awt.Font("Skia", 0, 14)); // NOI18N
        add(reEnterPasswordJPasswordField);
        reEnterPasswordJPasswordField.setBounds(530, 230, 136, 29);

        rePasswordJLabel.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        rePasswordJLabel.setForeground(new java.awt.Color(2, 79, 133));
        rePasswordJLabel.setText("Re-enter Password:");
        add(rePasswordJLabel);
        rePasswordJLabel.setBounds(380, 240, 140, 19);

        jLabel2.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel2.setText("Manage Enterprise Admin");
        add(jLabel2);
        jLabel2.setBounds(520, 30, 297, 32);
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterpriseComboBox(network);
        }
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[$+_])(?=\\S+$).{6,}$");
        Matcher m = p.matcher(String.valueOf(passwordJPasswordField.getPassword()));
        boolean b = m.matches();
        return b;
    }
    
    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();

        String username = usernameJTextField.getText();
        Role role = null;
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String rePassword = String.valueOf(reEnterPasswordJPasswordField.getPassword());
        String name = nameJTextField.getText();

        if (username == null || username.equals("")) {
            usernameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            usernameJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Username cannot be blank");
            return;
        }
        if (password == null || password.equals("")) {
            usernameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            usernameJLabel.setForeground(Color.BLACK);
            passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password cannot be blank");
            return;
        }
        
        if (!passwordPatternCorrect()) {
            JOptionPane.showMessageDialog(null, "Password should be at least 6 characters, "
                    + "combination of number, uppercase letter, "
                    + "lowercase letter and special characters $, +, _");
            passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJLabel.setForeground(Color.RED);
            return;
        }

        if (!password.equals(rePassword)) {
            JOptionPane.showMessageDialog(null, "Passwords do not match");
            passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            reEnterPasswordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            passwordJLabel.setForeground(Color.RED);
            rePasswordJLabel.setForeground(Color.RED);
            return;
        }

        if (name == null || name.equals("")) {
            passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            reEnterPasswordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordJLabel.setForeground(Color.BLACK);
            rePasswordJLabel.setForeground(Color.BLACK);
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            nameJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Name cannot be blank");
            return;
            
        } else {
            List<UserAccount> userAccountList = enterprise.getUserAccountDirectory().getUserAccountList();
            for (UserAccount userAccount : userAccountList) {
                if (userAccount.getUsername().equals(username)) {
                    JOptionPane.showMessageDialog(null, "Username already taken");
                    usernameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
                    return;
                }
            }
            
            Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
            UserAccount userAccount = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new EnterpriseAdminRole());
            populateTable();
            
            passwordJLabel.setForeground(Color.BLACK);
            rePasswordJLabel.setForeground(Color.BLACK);
            nameJLabel.setForeground(Color.BLACK);
            nameJTextField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            passwordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            reEnterPasswordJPasswordField.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            nameJTextField.setText("");
            passwordJPasswordField.setText("");
            reEnterPasswordJPasswordField.setText("");
            usernameJTextField.setText("");

        }
    }//GEN-LAST:event_submitJButtonActionPerformed



    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JLabel passwordJLabel;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JPasswordField reEnterPasswordJPasswordField;
    private javax.swing.JLabel rePasswordJLabel;
    private javax.swing.JButton submitJButton;
    private javax.swing.JLabel usernameJLabel;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
