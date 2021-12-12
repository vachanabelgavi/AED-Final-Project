/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import UI.Alert;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class VaccineJPanel extends javax.swing.JPanel {

    private Ecosystem ecosystem;
    private Network network;
    private Customer customer;
    DefaultTableModel tableModel;
    private Enterprise enterprise;
    private Organization organization;

    Alert alert;

    /**
     * Creates new form VaccineJPanel
     */
    public VaccineJPanel(Ecosystem system, Network network, Customer customer) {
        initComponents();

        this.ecosystem = system;
        this.network = network;
        this.customer = customer;
        this.alert = new Alert();
        this.tableModel = (DefaultTableModel) prodTable.getModel();

        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Immunization & Vaccination");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Immunization");

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
        prodTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 252, 249));
        setMinimumSize(new java.awt.Dimension(1500, 1000));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT", "PRICE", "QTY", "ADD TO CART"
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
        jScrollPane1.setViewportView(prodTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 830, 360));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, -1, -1));

        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 540, 100, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\AED-D-Drive\\AED_PROJECT_LATEST\\AED-Final-Project\\DoorDeliveryApplication\\src\\UI\\resources\\vaccine.png")); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 880, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int rows = tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = custoemrcart.getCartItems();

        try {
            for (int i = 0; i < rows; i++) {
                if ((Boolean) tableModel.getValueAt(i, 4)) {

                    Boolean found = false;
                    if (customerCartItems.size() > 0) {
                        System.out.println("IN  VACCINE CART > 0 ");
                        for (OrderItem item : customerCartItems) {
                            System.out.println(item + " ************** Item in vaccine");
                            if (item.getProductName().equals(String.valueOf(tableModel.getValueAt(i, 1)))) {
                                this.alert.ShowAlert("Chosen item" + item.getProductName() + " already in cart!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            OrderItem o1 = new OrderItem();
                            o1.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                            o1.setProductName((String) tableModel.getValueAt(i, 1));
                            o1.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                            o1.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                            o1.setOrganizationname("Immunization");
                            customerCartItems.add(o1);
                            this.alert.ShowAlert("Added " + o1.getProductName() + " to cart!");
                        }
                    } else {
                        System.out.println("ULIKELY IN VACCINE");
                        System.out.println(custoemrcart.getCartId() + " :: THIS IS HIS CART ID");
                        OrderItem o1 = new OrderItem();
                        o1.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                        o1.setProductName((String) tableModel.getValueAt(i, 1));
                        o1.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                        o1.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                        o1.setOrganizationname("Immunization");
                        customerCartItems.add(o1);
                        this.alert.ShowAlert("Added " + o1.getProductName() + " to cart!");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e + " CART PROBLEM IN VACCINE");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    public void populateTable() {
        tableModel.setRowCount(0);

        ArrayList<Product> products = this.organization.getOrganizationProducts();
        try {
            for (Product p : products) {
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    p.getProductId(),
                    p.getName(),
                    p.getPrice(),
                    1,
                    false
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
