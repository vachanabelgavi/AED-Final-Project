/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationAdminPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Organization.Organization;
import Business.Organization.PharmacyOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import UI.Alert;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class PharmacyAdminJPanel extends javax.swing.JPanel {

    private final Ecosystem ecosystem;
    private final Network network;
    private final UserAccount user;
    private final Organization organization;

    DefaultTableModel tableModel;
    private int orderid;
    private Order currentOrder;
    private Customer currentCustomer;
    private final Enterprise enterprise;
    Alert alerts;
    JPanel userProcessContainer;
    /**
     * Creates new form PharmacyAdminJPanel
     */
    public PharmacyAdminJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount ua, Network network, Organization organization, Enterprise enterprise) {
        initComponents();

        this.ecosystem = system;
        this.network = network;
        this.user = ua;
        this.organization = organization;
        this.enterprise = enterprise;
        this.tableModel = (DefaultTableModel) tableOrder.getModel();
        this.alerts = new Alert();
        this.userProcessContainer = userProcessContainer;
        populatePharmacyOrders();
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
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnSendPrescription = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("REFRESH");
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 420, -1, -1));

        jButton2.setText("REJECT ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        jButton1.setText("ACCEPT ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, -1, -1));

        btnSendPrescription.setText("SEND PRESCRIPTION");
        btnSendPrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendPrescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(btnSendPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        tableOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "ORDER STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableOrder);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 614, 184));

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setText("MANAGE PRODUCTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 190, 60));

        jButton5.setText("MANAGE ORDERS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(btnSendPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 310, -1));

        jLabel1.setText("DOCTOR'S COMMENTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, -1));

        jLabel2.setText("DOCTOR SIGNATURE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));
=======
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 190, 60));
>>>>>>> 07eb6e8b733b0cc4972965583a6ace0c83e6d759

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, -5, 1250, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void tableOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseClicked
        // TODO add your handling code here:

        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = source.columnAtPoint(evt.getPoint());

        this.orderid = Integer.valueOf((Integer) source.getModel().getValueAt(row, column));
        fetchOrderObject();

    }//GEN-LAST:event_tableOrderMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
            for (Order o : customer.getOrderlist()) {
                if (o.getOrderId() == this.orderid) {
                    o.setStatus("ACCEPTED");
                }
            }
        }
        populatePharmacyOrders();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
            for (Order o : customer.getOrderlist()) {
                if (o.getOrderId() == this.orderid) {
                    o.setStatus("REJECTED");
                }
            }
        }
        populatePharmacyOrders();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnSendPrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendPrescriptionActionPerformed
        // TODO add your handling code here:

        ArrayList<PrescriptionUploadWorkRequest> workrequests = this.ecosystem.getPrescriptionWorkList();

        UserAccount doctorUser = this.enterprise.getOrganizationDirectory().getOrganizationByName("Doctor Associate").getUserAccountDirectory().findUser("nidhi");

        PrescriptionUploadWorkRequest pu = new PrescriptionUploadWorkRequest();
        pu.setOrderId(this.orderid);
        pu.setSender(user);
        pu.setCustomer(this.currentCustomer);
        pu.setReceiver(doctorUser);
        pu.setPresecription(this.currentOrder.getPrescription());
        pu.generateRequestId();
        pu.setPrescribedOrderItems(this.currentOrder.getItemsOrdered());
        
        workrequests.add(pu);

//        GET DOCTOR's WORKREQUEST
//        created a new work request between organization admin and the doctor
        doctorUser.getWorkQueue().getWorkRequestList().add(pu);
//        add the prescription to customer workqueue as well
        this.currentCustomer.getWorkQueue().getWorkRequestList().add(pu);
        this.currentOrder.setStatus("APPROVAL NEEDED");
        
        this.alerts.ShowAlert("SENT PRESCRIPTION FOR APPROVAL!");
        populatePharmacyOrders();

    }//GEN-LAST:event_btnSendPrescriptionActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(null);
        jSplitPane1.setRightComponent(new PharmacyProductJPanel());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jSplitPane1.removeAll();
        jSplitPane1.add(new PharmacyAdminJPanel(userProcessContainer, ecosystem, user, network, organization, enterprise));
    }//GEN-LAST:event_jButton5ActionPerformed

    public void fetchOrderObject() {
        for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
            for (Order o : customer.getOrderlist()) {
                if (o.getOrderId() == this.orderid) {
                    this.currentOrder = o;
                    this.currentCustomer = customer;
                }
            }
        }
    }

    public void populatePharmacyOrders() {

        tableModel.setRowCount(0);

        try {
            for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
                for (Order o : customer.getOrderlist()) {
                    if (o.getOrganizationname().equalsIgnoreCase("pharmacy")) {
                        tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                            o.getOrderId(),
                            customer.getName(),
                            o.getStatus()
                        });
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendPrescription;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable tableOrder;
    // End of variables declaration//GEN-END:variables
}
