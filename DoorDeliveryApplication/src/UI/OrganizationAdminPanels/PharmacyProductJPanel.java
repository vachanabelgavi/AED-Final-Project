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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
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

        addBt.setText("ADD PRODUCTS");
        addBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtActionPerformed(evt);
            }
        });

        jLabel1.setText("PRODUCT NAME");

        jLabel2.setText("PRODUCT PRICE");

        jLabel3.setText("STOCK");

        jButton1.setText("UPDATE PRODUCTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(fieldProductName)
                                .addComponent(fieldProductPrice)
                                .addComponent(fieldStock, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(addBt)
                        .addGap(76, 76, 76)
                        .addComponent(jButton1)))
                .addGap(162, 241, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBt)
                    .addComponent(jButton1))
                .addGap(15, 15, 15))
        );
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

    public void populateProducts() {
        tableModel.setRowCount(0);
        for (Product p : this.organization.getOrganizationProducts()) {
            if (p.getStockunits() != 0) {
                tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                    p.getProductId(),
                    p.getName(),
                    p.getPrice(),
                    p.getStockunits(),
                    1
                });
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBt;
    private javax.swing.JTextField fieldProductName;
    private javax.swing.JTextField fieldProductPrice;
    private javax.swing.JTextField fieldStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable prodTable;
    // End of variables declaration//GEN-END:variables
}
