/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import UI.SystemAdmin.NextContainerJFrame;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author vachanabelgavi
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    Ecosystem business;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public MainJFrame() {
        initComponents();

        this.business = dB4OUtil.retrieveSystem();
        this.setSize(1500, 1000);
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
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 1000));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 200, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 200, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 137, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 40));

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setOpaque(false);
        container.setLayout(new java.awt.CardLayout());
        jPanel1.add(container, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 640));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 100));

        jSplitPane1.setRightComponent(jPanel1);

        getContentPane().add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1270, 720));

        jPanel2.setMinimumSize(new java.awt.Dimension(1500, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 40));

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
        UserAccount userAccount = business.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : business.getNetworks()) {
//                Check against network
                Customer c = network.getCustomerDirectory().authenticateCustomer(userName, password);
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
                    for (int i = 0; i < network.getEnterpriseDirectory().getEnterpriseList().size(); i++) {

                        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                            userAccount = enterprise.getEnterpriseUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount == null) {
                                //Step 3:check against each organization for each enterprise
                                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                                    userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                    if (userAccount != null) {
                                        inEnterprise = enterprise;
                                        inOrganization = organization;
                                        inNetwork = network;
                                        JOptionPane.showMessageDialog(null, "login successful!");
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
                                    } else {
                                        
                                    }
                                }
                            } else {
                                inNetwork = network;
                                inEnterprise = enterprise;

                                JOptionPane.showMessageDialog(null, "login successful!");

                                jSplitPane1.setLeftComponent(null);
                                jSplitPane1.setRightComponent(null);
                                container.removeAll();
                                container.setVisible(true);
                                CardLayout layout = (CardLayout) container.getLayout();
                                container.setSize(1500, 1000);
                                container.add("enterprise area", userAccount.getEnterpriseRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, business));
                                layout.next(container);
                                jSplitPane1.setRightComponent(container);
                                break;
                            }

                        }
                    }
                }

            }
        } else {
            if (userAccount != null) {
                jSplitPane1.setLeftComponent(null);
                jSplitPane1.setRightComponent(null);
                container.removeAll();
                container.setVisible(true);
                CardLayout layout = (CardLayout) container.getLayout();
                container.setSize(1500, 1000);
                container.add("work rea", userAccount.getRole().createWorkArea(container, userAccount, inNetwork, inOrganization, inEnterprise, business));
                layout.next(container);
                jSplitPane1.setRightComponent(container);
            } else {
                JOptionPane.showMessageDialog(null, "User does not exist!");
            }

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
    }//GEN-LAST:event_jButton1ActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
