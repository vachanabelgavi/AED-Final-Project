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
    private final Order pharmacyOrder;
    private final Order supermarketOrder;
    private final Order vaccineOrder;
    private final Order equipmentOrder;

    public CustomerCartJPanel(Ecosystem system, Network network, Customer customer) {
        initComponents();

        this.customer = customer;
        this.ecosystem = system;
        this.network = network;
        this.tableModel = (DefaultTableModel) cartTable.getModel();
        this.pharmacyOrder = new Order();
        this.supermarketOrder = new Order();
        this.vaccineOrder = new Order();
        this.equipmentOrder = new Order();

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, 160));

        jButton1.setText("FETCH CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

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
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
//        EDIT CART
        int rows = tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = this.customer.getCustomerCart().getCartItems();

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
                        if (oi.getProductName().equals(String.valueOf((String) tableModel.getValueAt(i, 1)))) {
                            oi.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                        }
                    }
                }
            }

            populateTable();
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
        Boolean prescriptionReqd = false;
        ArrayList<OrderItem> pharmacyItems = this.pharmacyOrder.getItemsOrdered();
        ArrayList<OrderItem> equipmentItems = this.equipmentOrder.getItemsOrdered();
        ArrayList<OrderItem> supermarketItems = this.supermarketOrder.getItemsOrdered();
        ArrayList<OrderItem> vaccineItems = this.vaccineOrder.getItemsOrdered();

        for (OrderItem oi : this.customer.getCustomerCart().getCartItems()) {
            if (oi.getOrganizationname().equalsIgnoreCase("pharmacy")) {
                pharmacyItems.add(oi);
            } else if (oi.getOrganizationname().equalsIgnoreCase("equipments")) {
                equipmentItems.add(oi);
            } else if (oi.getOrganizationname().equalsIgnoreCase("immunization")) {
                vaccineItems.add(oi);
            } else if (oi.getOrganizationname().equalsIgnoreCase("supermarket")) {
                supermarketItems.add(oi);
            }
        }

        ArrayList<Order> customerOrder = this.customer.getOrderlist();
        if (pharmacyItems.size() > 0) {
            this.pharmacyOrder.setItemsOrdered(pharmacyItems);
            this.pharmacyOrder.setOrganizationname("Pharmacy");
            this.pharmacyOrder.setEnterprisename("Pharmaceutical");
            this.pharmacyOrder.setStatus("PRESCRIPTION REQUIRED");
            this.pharmacyOrder.calcOrderTotal();
            customerOrder.add(pharmacyOrder);

        }

        if (vaccineItems.size() > 0) {
            this.vaccineOrder.setItemsOrdered(vaccineItems);
            this.vaccineOrder.setOrganizationname("Immunization");
            this.vaccineOrder.setEnterprisename("Immunization & Vaccination");
            this.vaccineOrder.setStatus("IN PROGRESS");
            this.vaccineOrder.calcOrderTotal();
            customerOrder.add(vaccineOrder);
        }

        if (equipmentItems.size() > 0) {
            this.equipmentOrder.setItemsOrdered(equipmentItems);
            this.equipmentOrder.setOrganizationname("Equipments");
            this.equipmentOrder.setEnterprisename("Medical Equipment");
            this.equipmentOrder.setStatus("IN PROGRESS");
            this.equipmentOrder.calcOrderTotal();
            customerOrder.add(equipmentOrder);
        }

        if (supermarketItems.size() > 0) {
            this.supermarketOrder.setItemsOrdered(supermarketItems);
            this.supermarketOrder.setOrganizationname("Supermarket");
            this.supermarketOrder.setEnterprisename("Pharmaceutical");
            this.supermarketOrder.setStatus("PRESCRIPTION REQUIRED");
            this.supermarketOrder.calcOrderTotal();
            customerOrder.add(supermarketOrder);
        }

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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
