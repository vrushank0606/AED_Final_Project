/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.WorkQueue.AccountantBillingRequest;
import java.awt.CardLayout;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Kavya
 */
public class EmailBillingInformationToPatient extends javax.swing.JPanel {

    JPanel userPrcessContainer;
    private AccountantBillingRequest accountBillingRequest;

    /**
     * Creates new form EmailBillingInformationToPatient
     */
//    public EmailBillingInformationToPatient() {
//        
//    }
    EmailBillingInformationToPatient(JPanel userProcessContainer, AccountantBillingRequest accountBillingRequest) {
        initComponents();
        this.userPrcessContainer = userProcessContainer;
        this.accountBillingRequest = accountBillingRequest;
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
        emailTxtFiled = new javax.swing.JTextArea();
        btnSendEmail = new javax.swing.JButton();
        btnClearText = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Skia", 1, 24)); // NOI18N
        jLabel1.setText("Email Billing Information to Patient");

        emailTxtFiled.setColumns(20);
        emailTxtFiled.setRows(5);
        jScrollPane1.setViewportView(emailTxtFiled);

        btnSendEmail.setBackground(new java.awt.Color(2, 79, 133));
        btnSendEmail.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        btnSendEmail.setForeground(new java.awt.Color(255, 255, 255));
        btnSendEmail.setText("Send Email");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });

        btnClearText.setBackground(new java.awt.Color(2, 79, 133));
        btnClearText.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        btnClearText.setForeground(new java.awt.Color(255, 255, 255));
        btnClearText.setText("Clear");
        btnClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTextActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(2, 79, 133));
        btnBack.setFont(new java.awt.Font("Skia", 1, 12)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 112, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSendEmail)
                                .addGap(18, 18, 18)
                                .addComponent(btnClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnClearText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addGap(172, 172, 172))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        String text = emailTxtFiled.getText();
        if (emailTxtFiled.getText().trim().equals("")) {
            JOptionPane.showConfirmDialog(null, "You have not typed anything");
            return;
        }
        SendMail(accountBillingRequest.getPatient().getPatientEmail(), text);
        JOptionPane.showMessageDialog(null, "Billing information sent to " + accountBillingRequest.getPatient().getPatientFirstName());
        accountBillingRequest.setStatus("Patient Transaction Completed");
    }//GEN-LAST:event_btnSendEmailActionPerformed

    private void btnClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTextActionPerformed
        emailTxtFiled.setText("");
    }//GEN-LAST:event_btnClearTextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userPrcessContainer.remove(this);
        CardLayout layout = (CardLayout) userPrcessContainer.getLayout();
        layout.previous(userPrcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed
    private void SendMail(String toMail, String text) {
        String to = toMail;
        String from = "hospitalservice20@gmail.com";
        String host = "smtp.gmail.com";
        Properties properties = new Properties();

        // Setup mail server
        properties.put("mail.smtp.from", "hospitalservice20@gmail.com");
        properties.put("mail.smtp.host", host);
        properties.put("mai.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.port", "587");
        properties.setProperty("mail.smtp.user", from);
        properties.setProperty("mail.smtp.password", "Demo@123");
        properties.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication("hospitalservice20@gmail.com", "Demo@123");
            }
        });

        try {
            // Create a default MimeMessage object.
            MimeMessage message = new MimeMessage(session);
            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header.
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // Set Subject: header field
            message.setSubject("Patient Billing Information");

            // Send the actual HTML message, as big as you like
            message.setContent("<h1>" + text + "</h1>", "text/html");

            // Send message
            Transport.send(message);
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnClearText;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JTextArea emailTxtFiled;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}