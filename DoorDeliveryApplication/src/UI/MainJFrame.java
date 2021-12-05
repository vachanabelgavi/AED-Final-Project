/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.SystemAdmin.NextContainerJFrame;
import java.awt.CardLayout;
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
        this.setSize(800, 600);
        
        System.out.println("CAME HERE -- "+ this.business.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 200, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 200, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/login btn.png")); // NOI18N
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 137, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/icons8-user-50.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/icons8-password-50.png")); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 50, 40));

        jPanel2.setBackground(new java.awt.Color(63, 130, 117));

        jLabel1.setBackground(new java.awt.Color(63, 130, 117));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                          Login");

        btnExit.setBackground(new java.awt.Color(255, 255, 255));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/icons8-exit-sign-64.png")); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/Hnet.com-image (1).jpg")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(0, 40, Short.MAX_VALUE))
        );

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 800, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 150, Short.MAX_VALUE)
                    .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = business.getUserAccountDirectory().authenticateUser(userName, password);

        System.out.println("CAME ttothe auth-- ");
        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network : business.getNetworks()){
                //Step 2.a: check against each enterprise
                for(int i=0; i < network.getEnterpriseDirectory().getEnterpriseList().size(); i++){
                    
                    for(Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
                        
                        userAccount = enterprise.getEnterpriseUserAccountDirectory().authenticateUser(userName, password);
                        if(userAccount==null){
                            //Step 3:check against each organization for each enterprise
                            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                                
                                userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                                if(userAccount!=null){
                                    inEnterprise = enterprise;
                                    inOrganization = organization;
                                    break;
                                }
                            }
                        }
                        else{
                            inEnterprise = enterprise;
                            break;
                        }
                        if(inOrganization!=null){
                            break;
                        }
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            jPanel1.setVisible(false);
            jPanel1.removeAll();
            jPanel2.setVisible(false);
            container.setVisible(true);
            //this.removeAll();
            //this.add(container);
            //container.removeAll();
            //container.remove(jPanel1);
            //container.remove(jPanel2);
            CardLayout layout=(CardLayout)container.getLayout();
            container.add("workArea",userAccount.getEnterpriseRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, this.business));
            layout.next(container);
            //   e.getEnterpriseUserAccountDirectory().createEnterpriseUser("pharmaEnterprise", "pharmaEnterprise", pharmaEntemp, new PharmaceuticalEnterpriseAdminRole());

            
            JFrame newFrame = new JFrame();
            //newFrame.setLayout(new AbsoluteLayout());
            newFrame.getContentPane().add(container);
            newFrame.setSize(900, 800);
            newFrame.setVisible(true);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //new NextContainerJFrame(userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, business)).setVisible(true);
            //this.setVisible(false);
            
        }

        btnLogin.setEnabled(true);
        btnExit.setEnabled(true);
        jPanel1.setVisible(false);
        jPanel1.setVisible(true);
        container.setVisible(true);
        //logoutJButton1.setEnabled(true);
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        container.removeAll();
        dB4OUtil.storeSystem(business);
        jPanel1.setVisible(true);
        container.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_btnExitActionPerformed

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
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
