/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabSamples;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Cart;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vachanabelgavi
 */
public class SampleCollectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SampleCollectionJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem business;
    private Network network;
    private Customer customer;
    DefaultTableModel tableModel;
    private Enterprise enterprise;
    private Organization organization;

    
    public SampleCollectionJPanel(JPanel userProcessContainer, Ecosystem business, Network network, Customer customer) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.network = network;
        this.customer = customer;
        
        this.enterprise = this.network.getEnterpriseDirectory().getEnterprise("Lab Center & Diagnostics");
        this.organization = this.enterprise.getOrganizationDirectory().getOrganizationByName("Lab Center");

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAddtoCart = new javax.swing.JButton();
        btnLabAssistant = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(63, 130, 117));

        jLabel1.setBackground(new java.awt.Color(63, 130, 117));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                      Sample Collection");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/icons8-back-50.png"))); // NOI18N
        btnBack.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addComponent(btnBack))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Lab Tests");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel3.setText("Order Total: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel4.setText("<value>");

        btnAddtoCart.setText("Add to Cart");
        btnAddtoCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddtoCartActionPerformed(evt);
            }
        });

        btnLabAssistant.setText("Lab Asisstant");
        btnLabAssistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabAssistantActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Test ID", "Test", "Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAddtoCart, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(280, 280, 280))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAddtoCart)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(40, 40, 40)
                .addComponent(btnLabAssistant, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLabAssistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabAssistantActionPerformed
        // TODO add your handling code here:
        
        LabAgentSampleCollectionJPanel manageCustomerJPanel = new LabAgentSampleCollectionJPanel(userProcessContainer, business, network, customer);
        userProcessContainer.add("manageCustomerJPanel",manageCustomerJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLabAssistantActionPerformed

    private void btnAddtoCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddtoCartActionPerformed
        // TODO add your handling code here:
        
        int rows = tableModel.getRowCount();
        Cart custoemrcart = this.customer.getCustomerCart();

        ArrayList<OrderItem> customerCartItems = custoemrcart.getCartItems();

        try {
            for (int i = 0; i < rows; i++) {
                if ((Boolean) tableModel.getValueAt(i, 4)) {

                    Boolean found = false;
                    if (customerCartItems.size() > 0) {
                        System.out.println("IN  Lab Test CART > 0 ");
                        for (OrderItem item : customerCartItems) {
                            System.out.println(item + " ************** Item in Lab Test");
                            if (item.getProductName().equals(String.valueOf(tableModel.getValueAt(i, 1)))) {
                                //this.alert.ShowAlert("Chosen item" + item.getProductName() + " already in cart!");
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            OrderItem o1 = new OrderItem();
                            o1.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                            o1.setProductName((String) tableModel.getValueAt(i, 1));
                            o1.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                            //o1.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                            o1.setOrganizationname("Lab Center");
                            customerCartItems.add(o1);
                            //this.alert.ShowAlert("Added " + o1.getProductName() + " to cart!");
                        }
                    } else {
                        System.out.println("ULIKELY IN LAB TEST");
                        System.out.println(custoemrcart.getCartId() + " :: THIS IS HIS CART ID");
                        OrderItem o1 = new OrderItem();
                        o1.setProductId(Integer.valueOf((Integer) tableModel.getValueAt(i, 0)));
                        o1.setProductName((String) tableModel.getValueAt(i, 1));
                        o1.setProductPrice(Double.valueOf((Double) tableModel.getValueAt(i, 2)));
                        o1.setQty(Integer.valueOf((Integer) tableModel.getValueAt(i, 3)));
                        o1.setOrganizationname("Immunization");
                        customerCartItems.add(o1);
                        //this.alert.ShowAlert("Added " + o1.getProductName() + " to cart!");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e + " CART PROBLEM IN VACCINE");
        }
        
    }//GEN-LAST:event_btnAddtoCartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddtoCart;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLabAssistant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

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
}