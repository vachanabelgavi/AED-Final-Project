/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import UI.Alert;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerCartJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerCartJPanel
     */
    Customer customer;
    DefaultTableModel tableModel;
    Ecosystem ecosystem;
    Network network;
    Alert alert;
    Order order;

    public CustomerCartJPanel(Ecosystem system, Network network, Customer customer) {
        initComponents();

        this.customer = customer;
        this.ecosystem = system;
        this.network = network;
        this.tableModel = (DefaultTableModel) cartTable.getModel();
        this.order = new Order();
        this.alert = new Alert();
        this.setVisible(true);
        populateTable();
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
        cartTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Id", "Product Name", "Product Price", "Product Qty", "REMOVE ITEM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(cartTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 133));

        jButton1.setText("FETCH CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jLabel1.setText("ORDER TOTAL:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        labelTotal.setText("<value>");
        add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));

        jButton2.setText("PLACE ORDER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jButton3.setText("EDIT CART");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        EDIT CART
        int rows = tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = this.customer.getCustomerCart().getCartItems();
        Boolean prescriptionReqd =  false;
        
        try {
            for (int i = 0; i < rows; i++) {
                if ((Boolean) tableModel.getValueAt(i, 4)) {
//                    traverse through his cartitems and delete orderitem
                    for (OrderItem o : customerCartItems) {
                        if (o.getProductId() == Integer.valueOf((Integer) tableModel.getValueAt(i, 0))) {
//                            Modify cart
                            customerCartItems.remove(o);
                            this.alert.ShowAlert("Removed form cart!");
                        }
                    }

                } else {
                    for (OrderItem oi : customerCartItems) {
                        
                        if(oi.getOrganizationname().equals("Pharmacy") || oi.getOrganizationname().equals("Supermarket")) {
                            prescriptionReqd = true;
                        }
                        
                        if (oi.getProductName().equals(String.valueOf((String) tableModel.getValueAt(i, 1)))) {
                            oi.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                        }
                    }
                }
            }

//            Set all items ordered to the order 
            this.order.setItemsOrdered(customerCartItems);
            this.order.calcOrderTotal();
                                
            
            if(prescriptionReqd) {
                this.order.setStatus("Required Prescription");
            } else {
                this.order.setStatus("In Progress");
            }
            
            labelTotal.setText("$ " + String.valueOf(this.order.getPrice()));

        } catch (Exception e) {
            System.out.println(e + " CART PROBLEM IN VACCINE");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        ArrayList<Order> customerOrder = this.customer.getOrderlist();
        customerOrder.add(order);
        
        this.alert.ShowAlert("Order placed successfully!");
        this.customer.getCustomerCart().setCartItems(new ArrayList<OrderItem>());
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateTable() {
        tableModel.setRowCount(0);

        ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();
        try {
            for (OrderItem p : cartOrder) {
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    p.getProductId(),
                    p.getProductName(),
                    p.getProductPrice(),
                    p.getQty(),
                    false
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cartTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTotal;
    // End of variables declaration//GEN-END:variables
}
