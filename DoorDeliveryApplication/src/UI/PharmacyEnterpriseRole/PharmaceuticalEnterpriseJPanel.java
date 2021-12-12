
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PharmacyEnterpriseRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pannaga
 */
public class PharmaceuticalEnterpriseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmaceuticalEnterpriseJPanel
     */

    JPanel userProcessContainer;
     Ecosystem ecosystem;
     UserAccount account;
     UserAccountDirectory useraccountdirectory;
     Enterprise enterprise;
     Customer customer;
     Organization organization;
     Network network;

    public PharmaceuticalEnterpriseJPanel(JPanel userProcessContainer, UserAccount account,Network network,Organization organization, Enterprise enterprise,Ecosystem ecosystem) {
        initComponents();

        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.customer = new Customer();

        System.out.println("HAS TO CIome  in phharma e ");

        if(this.ecosystem == null) {
            JOptionPane.showMessageDialog(null, "Something went wrong");
        } else {
            System.out.println("this.ecosystem for pharma is not null");
        }


       // populateTree();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btndeliveryagents = new javax.swing.JButton();
        btnmanageorders = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy Enterprise Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(253, 252, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btndeliveryagents.setBackground(new java.awt.Color(0, 102, 102));
        btndeliveryagents.setText("Manage Delivery Agents");
        btndeliveryagents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveryagentsActionPerformed(evt);
            }
        });
        jPanel2.add(btndeliveryagents, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 180, 40));

        btnmanageorders.setBackground(new java.awt.Color(0, 102, 102));
        btnmanageorders.setText("Manage Orders");
        btnmanageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageordersActionPerformed(evt);
            }
        });
        jPanel2.add(btnmanageorders, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 200, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/resources/illustration-male-pharmacist-female-customer-counter.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 700, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1224, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1212, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeliveryagentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliveryagentsActionPerformed
        // TODO add your handling code here:
        ManageDeliveryAgentJPanel manageDeliveryAgentJPanel=new ManageDeliveryAgentJPanel(userProcessContainer, ecosystem,network,account,useraccountdirectory,enterprise);
        userProcessContainer.add("manageDeliveryAgentJPanel",manageDeliveryAgentJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btndeliveryagentsActionPerformed

    private void btnmanageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageordersActionPerformed
        // TODO add your handling code here:

        ManagePharmaOrdersJPanel managePharmaOrdersJPanel=new ManagePharmaOrdersJPanel(userProcessContainer, ecosystem,network,useraccountdirectory,enterprise,customer,organization, account);
        userProcessContainer.add("managePharmaOrdersJPanel",managePharmaOrdersJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnmanageordersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeliveryagents;
    private javax.swing.JButton btnmanageorders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
