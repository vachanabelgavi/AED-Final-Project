/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationAdminPanels;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class PharmacyProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PharmacyProductJPanel
     */
    private final Ecosystem ecosystem;
    private final Network network;
    private final UserAccount user;
    private final Organization organization;

    DefaultTableModel tableModel;
    private File chosenFile;

    public PharmacyProductJPanel(JPanel userprocessContainer, Ecosystem system, UserAccount ua, Network network, Organization organization, Enterprise enterprise) {
        initComponents();

        this.ecosystem = system;
        this.network = network;
        this.user = ua;
        this.organization = organization;

        this.tableModel = (DefaultTableModel) prodTable.getModel();
        System.out.println("ORGNAME --------- " + this.organization.getName() + this.organization.getOrganizationProducts().size());
        populateProducts();

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
        addBt = new javax.swing.JButton();
        fieldProductName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        fieldProductPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldStock = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 252, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        prodTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "PRODUCT PRICE", "PRODUCT STOCK"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(prodTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, 519, 241));

        addBt.setBackground(new java.awt.Color(0, 102, 102));
        addBt.setForeground(new java.awt.Color(255, 255, 255));
        addBt.setText("ADD PRODUCTS");
        addBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtActionPerformed(evt);
            }
        });
        add(addBt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, -1, -1));
        add(fieldProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 263, -1));

        jLabel1.setText("PRODUCT NAME");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 80, -1, -1));
        add(fieldProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 263, -1));

        jLabel2.setText("PRODUCT PRICE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));
        add(fieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 263, -1));

        jLabel3.setText("STOCK");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("UPDATE PRODUCTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, -1, -1));

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("UPLOAD IMAGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtActionPerformed
        // TODO add your handling code here:
        try {
            if (fieldProductName.getText().trim().length() > 0 && Double.valueOf(fieldProductPrice.getText()) > 0.0 && Integer.valueOf(fieldStock.getText()) > 0) {
                if (this.organization.getOrganizationProducts().size() > 0) {
                    for (Product p : this.organization.getOrganizationProducts()) {
                        if (p.getName().equals(fieldProductName.getText())) {
                            JOptionPane.showMessageDialog(null, "Product already exists");
                            break;
                        } else {
                            Product prod = new Product();
                            prod.setName(fieldProductName.getText());
                            prod.setPrice(Double.valueOf(fieldProductPrice.getText()));
                            prod.setStockunits(Integer.valueOf(fieldStock.getText()));
                            if (this.chosenFile != null) {
                                prod.setProductImage(chosenFile);
                            }
                            this.organization.getOrganizationProducts().add(prod);
                            JOptionPane.showMessageDialog(null, "Added !");
                            break;
                        }
                    }
                } else {
                    Product prod = new Product();
                    prod.setName(fieldProductName.getText());
                    prod.setPrice(Double.valueOf(fieldProductPrice.getText()));
                    prod.setStockunits(Integer.valueOf(fieldStock.getText()));
                    if (this.chosenFile != null) {
                        prod.setProductImage(chosenFile);
                    }
                    this.organization.addProduct(fieldProductName.getText(), Double.valueOf(fieldProductPrice.getText()), Integer.valueOf(fieldStock.getText()));
                    JOptionPane.showMessageDialog(null, "Added !");
                }
            }
            populateProducts();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid data fields");
        }
    }//GEN-LAST:event_addBtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int count = this.tableModel.getRowCount();
        try {
            for (int i = 0; i < count; i++) {
                for (Product p : this.organization.getOrganizationProducts()) {
                    if (p.getProductId() == Integer.valueOf((int) this.tableModel.getValueAt(i, 0))) {

                        System.out.println((int) this.tableModel.getValueAt(i, 3));
                        int idx = this.organization.getOrganizationProducts().indexOf(p);
                        p.setStockunits((int) this.tableModel.getValueAt(i, 3));
                        p.setPrice(Double.valueOf((Double) this.tableModel.getValueAt(i, 2)));
                        this.organization.getOrganizationProducts().set(idx, p);

                    }
                }

            }
            JOptionPane.showMessageDialog(null, "Updated the product!");
            populateProducts();
        } catch (Exception e) {
            System.out.println(e + " ------------- ");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png", "jpg", "jpeg", "pdf");
        chooser.addChoosableFileFilter(filter);
        this.chosenFile = chooser.getSelectedFile();
    }//GEN-LAST:event_jButton3ActionPerformed

    public void populateProducts() {
        tableModel.setRowCount(0);
        for (Product p : this.organization.getOrganizationProducts()) {
            tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                p.getProductId(),
                p.getName(),
                p.getPrice(),
                p.getStockunits(),
                1
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBt;
    private javax.swing.JTextField fieldProductName;
    private javax.swing.JTextField fieldProductPrice;
    private javax.swing.JTextField fieldStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
