/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JSplitPane;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicSplitPaneDivider;
import javax.swing.plaf.basic.BasicSplitPaneUI;

/**
 *
 * @author Kavya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem ecosystem;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
       
        initComponents();
        ecosystem = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBackground(new java.awt.Color(255, 255, 255));
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(196, 44, 73));
        jPanel1.setFocusable(false);
        jPanel1.setRequestFocusEnabled(false);

        loginJButton.setBackground(new java.awt.Color(255, 102, 0));
        loginJButton.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton.setText("Login");
        loginJButton.setBorder(null);
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        userNameJTextField.setBackground(new java.awt.Color(2, 79, 133));
        userNameJTextField.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        userNameJTextField.setForeground(new java.awt.Color(255, 255, 255));
        userNameJTextField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        userNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameJTextFieldActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(2, 79, 133));
        passwordField.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        logoutJButton.setBackground(new java.awt.Color(255, 0, 51));
        logoutJButton.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        logoutJButton.setForeground(new java.awt.Color(255, 255, 255));
        logoutJButton.setText("Logout");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Account Login ");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Screenshot__217_-removebg-preview.png"))); // NOI18N

        cancelButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelButton.setFont(new java.awt.Font("Skia", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 102, 204));
        cancelButton.setText("EXIT");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelButtonMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");

        jLabel4.setFont(new java.awt.Font("Skia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginJLabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(loginJLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(logoutJButton)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Skia", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(2, 79, 133));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WELCOME TO MEDI UNIVERSITY");
        jLabel5.setMinimumSize(new java.awt.Dimension(0, 0));
        jLabel5.setPreferredSize(new java.awt.Dimension(630, 50));
        container.add(jLabel5, "card2");
        jLabel5.getAccessibleContext().setAccessibleName("");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cancelButtonMousePressed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed

        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);
        userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void userNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameJTextFieldActionPerformed

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        UserAccount userAccount=ecosystem.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            for(Network network:ecosystem.getNetworks()){
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizations()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            // passwordJLabel.setForeground(Color.RED);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.RED));
            //usernameJLabel.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Invalid login details");

            return;
        }
        else{
            userNameJTextField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            // passwordJLabel.setForeground(Color.GRAY);
            passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            // usernameJLabel.setForeground(Color.GRAY);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, ecosystem));
            layout.next(container);
        }

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables

    
    public class JSplitPaneWithZeroSizeDivider
	extends JSplitPane
{
	/**
	 * The size of the transparent drag area.
	 */
	private int dividerDragSize = 9;

	/**
	 * The offset of the transparent drag area relative to the visible divider line.
	 * Positive offset moves the drag area left/top to the divider line.
	 * If zero then the drag area is right/bottom of the divider line.
	 * Useful values are in the range 0 to {@link #dividerDragSize}.
	 * Default is centered.
	 */
	private int dividerDragOffset = 4;

	public JSplitPaneWithZeroSizeDivider() {
		this( HORIZONTAL_SPLIT );
	}

	public JSplitPaneWithZeroSizeDivider( int orientation ) {
		super( orientation );
		setContinuousLayout( true );
		setDividerSize( 1 );
	}

	public int getDividerDragSize() {
		return dividerDragSize;
	}

	public void setDividerDragSize( int dividerDragSize ) {
		this.dividerDragSize = dividerDragSize;
		revalidate();
	}

	public int getDividerDragOffset() {
		return dividerDragOffset;
	}

	public void setDividerDragOffset( int dividerDragOffset ) {
		this.dividerDragOffset = dividerDragOffset;
		revalidate();
	}

	@Override
	@SuppressWarnings("deprecation")
	public void layout() {
		super.layout();

		// increase divider width or height
		BasicSplitPaneDivider divider = ((BasicSplitPaneUI)getUI()).getDivider();
		Rectangle bounds = divider.getBounds();
		if( orientation == HORIZONTAL_SPLIT ) {
			bounds.x -= dividerDragOffset;
			bounds.width = dividerDragSize;
		} else {
			bounds.y -= dividerDragOffset;
			bounds.height = dividerDragSize;
		}
		divider.setBounds( bounds );
	}

	@Override
	public void updateUI() {
		setUI( new SplitPaneWithZeroSizeDividerUI() );
		revalidate();
	}

	//---- class SplitPaneWithZeroSizeDividerUI -------------------------------

	private class SplitPaneWithZeroSizeDividerUI
		extends BasicSplitPaneUI
	{
		@Override
		public BasicSplitPaneDivider createDefaultDivider() {
			return new ZeroSizeDivider( this );
		}
	}

	//---- class ZeroSizeDivider ----------------------------------------------

	private class ZeroSizeDivider
		extends BasicSplitPaneDivider
	{
		public ZeroSizeDivider( BasicSplitPaneUI ui ) {
			super( ui );
			super.setBorder( null );
			setBackground( UIManager.getColor( "controlShadow" ) );
		}

		@Override
		public void setBorder( Border border ) {
			// ignore
		}

		@Override
		public void paint( Graphics g ) {
			g.setColor( getBackground() );
			if( orientation == HORIZONTAL_SPLIT )
				g.drawLine( dividerDragOffset, 0, dividerDragOffset, getHeight() - 1 );
			else
				g.drawLine( 0, dividerDragOffset, getWidth() - 1, dividerDragOffset );
		}

		@Override
		protected void dragDividerTo( int location ) {
			super.dragDividerTo( location + dividerDragOffset );
		}

		@Override
		protected void finishDraggingTo( int location ) {
			super.finishDraggingTo( location + dividerDragOffset );
		}
	}
}




}
