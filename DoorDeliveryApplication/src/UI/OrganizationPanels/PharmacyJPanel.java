/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.OrganizationPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class PharmacyJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyJPanel
     */
    Ecosystem ecosystem;
    Network network;
    Enterprise enterprise;
    Organization organization;
    Customer customer;
    DefaultTableModel tableModel;

    public PharmacyJPanel(Ecosystem system, Network network, Customer c) {
        initComponents();

        this.ecosystem = system;
        this.network = network;
        this.customer = c;
        
        this.tableModel = (DefaultTableModel) prodTable.getModel();

        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Pharmaceutical");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Pharmacy");

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        prodTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PRODUCTS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, 260));

        jButton1.setText("ADD TO CART");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 100, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Customer adds to cart

        int rows = tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();
        
        ArrayList<OrderItem> customerCartItems = this.customer.getCustomerCart().getCartItems();
        
        try {
            for(int i = 0; i < rows; i++) {
                if((Boolean) tableModel.getValueAt(i, 4)) {
                    
                    System.out.println( custoemrcart.getCartId() + " :: THIS IS HIS CART ID" );
                    OrderItem o = new OrderItem();
                    o.setProductId( Integer.valueOf((Integer) tableModel.getValueAt(i, 0)) );
                    o.setProductName((String) tableModel.getValueAt(i, 1));
                    o.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                    o.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                    o.setOrganizationname("Pharmacy");
                    customerCartItems.add(o);
                }
            }
        } catch(Exception e) {
            System.out.println(e + " CART PROBLEM ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateTable() {
//        populate pharmacy products
        tableModel.setRowCount(0);

        ArrayList<Product> products = this.organization.getOrganizationProducts();
        try {
            for (Product p : products) {
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    p.getProductId(),
                    p.getName(),
                    p.getPrice(),
                    0,
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
