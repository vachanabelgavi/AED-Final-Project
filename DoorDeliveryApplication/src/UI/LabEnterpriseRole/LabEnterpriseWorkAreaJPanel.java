/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabEnterpriseRole;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author pannaga
 */
public class LabEnterpriseWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabEnterpriseWorkAreaJPanel
     */

    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private UserAccount account;
    private UserAccountDirectory useraccountdirectory;
    private Enterprise enterprise;
    private Customer customer;
    private Organization organization;
    private Network network;


    public LabEnterpriseWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise,Ecosystem ecosystem) {
        initComponents();
        
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = new Network();
        this.customer = new Customer();

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
        btnlabassistants = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lab Enterprise Work Area");

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

        btnlabassistants.setText("Manage Lab Assistants");
        btnlabassistants.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlabassistantsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(221, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(lblSelectedNode))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btndeliveryagents, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmanageorders, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlabassistants, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)))
                .addGap(200, 200, 200))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectedNode)
                    .addComponent(jLabel2))
                .addGap(69, 69, 69)
                .addComponent(btnmanageorders)
                .addGap(18, 18, 18)
                .addComponent(btndeliveryagents)
                .addGap(18, 18, 18)
                .addComponent(btnlabassistants)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
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
        ManageLabDeliveryAgentJPanel manageDeliveryAgentJPanel=new ManageLabDeliveryAgentJPanel(userProcessContainer,ecosystem, account,useraccountdirectory,enterprise);
        userProcessContainer.add("manageDeliveryAgentJPanel",manageDeliveryAgentJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btndeliveryagentsActionPerformed

    private void btnmanageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmanageordersActionPerformed
        // TODO add your handling code here:

        ManageLabOrdersJPanel manageLabOrdersJPanel=new ManageLabOrdersJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageLabOrdersJPanel",manageLabOrdersJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnmanageordersActionPerformed

    private void btnlabassistantsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlabassistantsActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnlabassistantsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeliveryagents;
    private javax.swing.JButton btnlabassistants;
    private javax.swing.JButton btnmanageorders;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}
