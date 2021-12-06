/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationAdminPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
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

    /**
     * Creates new form PharmacyAdminJPanel
     */
    public PharmacyAdminJPanel(Ecosystem system, UserAccount ua, Network network, Organization organization) {
        initComponents();

        this.ecosystem = system;
        this.network = network;
        this.user = ua;
        this.organization = organization;
        this.tableModel = (DefaultTableModel) tableOrder.getModel();

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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableOrder = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 31, 614, 184));

        jButton1.setText("ACCEPT ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jButton2.setText("REJECT ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        jButton3.setText("SEND PRESCRIPTION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 310, -1));

        jLabel1.setText("DOCTOR'S COMMENTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel2.setText("DOCTOR SIGNATURE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jScrollPane3.setViewportView(jTextPane1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 310, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void tableOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableOrderMouseClicked
        // TODO add your handling code here:

        JTable source = (JTable) evt.getSource();
        int row = source.rowAtPoint(evt.getPoint());
        int column = source.columnAtPoint(evt.getPoint());

        this.orderid = (int) source.getModel().getValueAt(row, column);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        WorkQueue queue = this.user.getWorkQueue();
        ArrayList<WorkRequest> workrequests = queue.getWorkRequestList();
        
        PrescriptionUploadWorkRequest pu = new PrescriptionUploadWorkRequest();
        pu.setOrderId(this.orderid);
        pu.setSender(user);
        pu.setCustomer(this.currentCustomer);
        pu.setReceiver(this.organization.getUserAccountDirectory().findUser("nidhi"));
        pu.setPresecription(this.currentOrder.getPrescription());
        pu.generateRequestId();
        pu.setPrescribedOrderItems(this.currentOrder.getItemsOrdered());
        
        workrequests.add(pu);
        this.currentOrder.setStatus("APPROVAL NEEDED");
    }//GEN-LAST:event_jButton3ActionPerformed

    public void fetchOrderObject() {
        for (Customer customer : this.network.getCustomerDirectory().getCustomerList()) {
                for (Order o : customer.getOrderlist()) {
                    if(o.getOrderId() == this.orderid) {
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
                    if (o.getOrganizationname().equals("Pharmacy")) {
                        tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                            o.getOrderId(),
                            customer.getName(),
                            o.getStatus()
                        });
                    }
                }
            }
        } catch (Exception e) {

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tableOrder;
    // End of variables declaration//GEN-END:variables
}