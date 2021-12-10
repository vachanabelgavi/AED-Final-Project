/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vachanabelgavi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Ecosystem business;
    UserAccount userAccount;
    Customer c;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();

        this.business = dB4OUtil.retrieveSystem();
        this.setSize(1500, 900);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        jSplitPane1.setSize(screenSize);
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
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DOOR TO DOOR DELIVERY");
        setBackground(new java.awt.Color(255, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setDividerLocation(0);
        jSplitPane1.setDividerSize(1);
        jSplitPane1.setAutoscrolls(true);
        jSplitPane1.setMaximumSize(new java.awt.Dimension(1500, 1000));
        jSplitPane1.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(1500, 1000));

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));
        jPanel1.setMinimumSize(new java.awt.Dimension(1500, 900));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsername.setBackground(new java.awt.Color(237, 236, 236));
        txtUsername.setForeground(new java.awt.Color(0, 102, 102));
        txtUsername.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtUsername.setCaretColor(new java.awt.Color(0, 153, 153));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsernameFocusLost(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 260, 40));

        txtPassword.setBackground(new java.awt.Color(237, 236, 236));
        txtPassword.setForeground(new java.awt.Color(0, 102, 102));
        txtPassword.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 260, 40));

        btnLogin.setBackground(new java.awt.Color(0, 102, 102));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, 150, 40));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setMaximumSize(new java.awt.Dimension(1500, 900));
        container.setOpaque(false);
        container.setVerifyInputWhenFocusTarget(false);
        container.setLayout(new java.awt.CardLayout());
        jPanel1.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 1000));

        jLabel1.setText("PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 310, 100, 20));

        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, 100, 20));

        jSplitPane1.setRightComponent(jPanel1);

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1500, 910));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jPanel2.setPreferredSize(new java.awt.Dimension(1500, 900));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 20, 190, 90));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        System.out.println("CAME TO CHECK LOGIN -- -------------- ");
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        this.userAccount = business.getUserAccountDirectory().authenticateUser(userName, password);
        this.c = null;
        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        try {
            if (userAccount == null) {
                //Step 2: Go inside each network and check each enterprise
                for (Network network : business.getNetworks()) {
//                Check against network
                    this.c = network.getCustomerDirectory().authenticateCustomer(userName, password);
                    if (c != null) {
//                   create a customerworkareajpanel

                        JOptionPane.showMessageDialog(null, "login successful!");
                        jSplitPane1.setLeftComponent(null);
                        jSplitPane1.setRightComponent(null);
                        container.setVisible(true);
                        container = new CustomerRole().createWorkArea(container, business, network, c);
                        jSplitPane1.setRightComponent(container);
                        break;

                    } else {

                        //Step 2.a: check against each enterprise
//                    for (int i = 0; i < network.getEnterpriseDirectory().getEnterpriseList().size(); i++) {
                        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                            this.userAccount = enterprise.getEnterpriseUserAccountDirectory().authenticateUser(userName, password);

                            if (userAccount == null) {
//                        CHECK THE DELIVERY AGENTS 
                                ArrayList<DeliveryAgent> deliveryAgents = enterprise.getDeliveryAgentsInEnterpiselist();

                                for (DeliveryAgent agent : deliveryAgents) {
                                    if (agent.getUseraccount().getUsername().equals(userName) && agent.getUseraccount().getPassword().equals(password)) {
                                        this.userAccount = agent.getUseraccount();
                                        inNetwork = network;
                                        inEnterprise = enterprise;

                                        JOptionPane.showMessageDialog(null, "Delivery agent login successful!");

                                        jSplitPane1.setLeftComponent(null);
                                        jSplitPane1.setRightComponent(null);
                                        container.removeAll();
                                        container.setVisible(true);
                                        container.setLayout(new CardLayout());
                                        CardLayout layout = (CardLayout) container.getLayout();
                                        container.setSize(1500, 1000);
                                        container.add("delivery area", userAccount.getRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, business));
                                        layout.next(container);
                                        jSplitPane1.setRightComponent(container);
                                        break;
                                    }
                                }
                            }

//                        CHECK FOR THE ORGANIZATIONAL LEVEL
                            if (userAccount == null) {
                                //Step 3:check against each organization for each enterprise
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                                    this.userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if (userAccount != null) {
                                        inEnterprise = enterprise;
                                        inOrganization = organization;
                                        inNetwork = network;
                                        JOptionPane.showMessageDialog(null, "Organizational login successful!");
                                        jSplitPane1.setLeftComponent(null);
                                        jSplitPane1.setRightComponent(null);
                                        container.removeAll();
                                        container.setVisible(true);
                                        container.setLayout(new CardLayout());
                                        CardLayout layout = (CardLayout) container.getLayout();
                                        container.setSize(1500, 1000);
                                        container.add("org area", userAccount.getRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, business));
                                        layout.next(container);
                                        jSplitPane1.setRightComponent(container);
                                        break;
                                    }
                                }
                                if (this.userAccount == null) {
//                                    Look for delivery agents
                                } else {
                                    break;
                                }
                            } else {
                                inNetwork = network;
                                inEnterprise = enterprise;

                                JOptionPane.showMessageDialog(null, "Enterprise login successful!");

                                jSplitPane1.setLeftComponent(null);
                                jSplitPane1.setRightComponent(null);
                                container.removeAll();
                                container.setVisible(true);
                                container.setLayout(new CardLayout());
                                CardLayout layout = (CardLayout) container.getLayout();
                                container.setSize(1500, 1000);
                                container.add("enterprise area", userAccount.getEnterpriseRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, business));
                                layout.next(container);
                                jSplitPane1.setRightComponent(container);
                                break;
                            }

//                        }
                        }
                    }

                }
            } else {
                if (userAccount != null && this.c == null) {
                    jSplitPane1.setLeftComponent(null);
                    jSplitPane1.setRightComponent(null);
                    container.removeAll();
                    container.setVisible(true);
                    container.setLayout(new CardLayout());
                    CardLayout layout = (CardLayout) container.getLayout();
                    container.setSize(1500, 1000);
                    container.add("work rea", userAccount.getRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, business));
                    layout.next(container);
                    jSplitPane1.setRightComponent(container);
                } else if (this.userAccount == null && this.c == null) {
                    JOptionPane.showMessageDialog(null, "User does not exist!");
                }
            }

        } catch (Exception exc) {
            System.out.println("An exception exc -------- "+ exc);
            JOptionPane.showMessageDialog(null, "User does not exist!");
        }
        btnLogin.setEnabled(true);
//        btnExit.setEnabled(true);
        jPanel1.setVisible(false);
        jPanel1.setVisible(true);
        container.setVisible(true);
        //logoutJButton1.setEnabled(true);
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setLeftComponent(jPanel1);
        jSplitPane1.setRightComponent(null);
        dB4OUtil.storeSystem(business);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusLost

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusLost

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
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
