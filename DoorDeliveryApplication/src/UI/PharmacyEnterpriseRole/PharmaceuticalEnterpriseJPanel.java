/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PharmacyEnterpriseRole;

import Business.Customer.CustomerDirectory;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import java.awt.CardLayout;
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
     
    public PharmaceuticalEnterpriseJPanel() {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        
        
        
        
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
        jLabel2 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pharmacy Enterprise Work Area");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50))
        );

        btndeliveryagents.setText("Manage Delivery Agents");
        btndeliveryagents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliveryagentsActionPerformed(evt);
            }
        });

        btnmanageorders.setText("Manage Orders");
        btnmanageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmanageordersActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Selected Node:");

        lblSelectedNode.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblSelectedNode.setForeground(new java.awt.Color(102, 102, 255));
        lblSelectedNode.setText("<View_selected_node>");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmanageorders, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndeliveryagents, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(lblSelectedNode)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblSelectedNode))
                .addGap(71, 71, 71)
                .addComponent(btnmanageorders)
                .addGap(18, 18, 18)
                .addComponent(btndeliveryagents)
                .addContainerGap(304, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 937, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(131, 131, 131)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btndeliveryagentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliveryagentsActionPerformed
        // TODO add your handling code here:
        ManageDeliveryAgentJPanel manageDeliveryAgentJPanel=new ManageDeliveryAgentJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageDeliveryAgentJPanel",manageDeliveryAgentJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btndeliveryagentsActionPerformed

    private void btnmanageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageordersActionPerformed
        // TODO add your handling code here:

        ManagePharmaOrdersJPanel managePharmaOrdersJPanel=new ManagePharmaOrdersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("managePharmaOrdersJPanel",managePharmaOrdersJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnmanageordersActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeliveryagents;
    private javax.swing.JButton btnmanageorders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
