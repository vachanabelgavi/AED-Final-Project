/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Ecosystem;
import Business.Network.Network;
import UI.Customer.AddCustomerJPanel;
import UI.Customer.SearchCustomersJPanel;
import UI.Customer.ViewCustomerJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vachanabelgavi
 */
public class ManageCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private JPanel userProcessContainer; 
    private Ecosystem business;
    private CustomerDirectory customerDirectory;
    
    public ManageCustomersJPanel(JPanel userProcessContainer, Ecosystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        
        for(Network n : business.getNetworks()){
            this.customerDirectory = n.getCustomerDirectory();
        }
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        customerJTable = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(63, 130, 117));

        jLabel1.setBackground(new java.awt.Color(63, 130, 117));
        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                                 Customer");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/icons8-back-50.png")); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        customerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Location", "Address", "Phone", "Zipcode", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(customerJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 780, 186));

        btnAdd.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/icons8-add-user-group-woman-man-64.png")); // NOI18N
        btnAdd.setText("Add Customer");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 210, -1));

        btnView.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/auditor.png")); // NOI18N
        btnView.setText("View Customer");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });
        add(btnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 430, 200, -1));

        btnSearch.setIcon(new javax.swing.ImageIcon("/Users/vachanabelgavi/Documents/AED-Final-Project/Images/icons8-search-client-64.png")); // NOI18N
        btnSearch.setText("Search Customer");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 190, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 156, 790, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        AddCustomerJPanel createCustomer = new AddCustomerJPanel(userProcessContainer, business);
        userProcessContainer.add("CreateCustomersJPanel",createCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = customerJTable.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Customer customer = (Customer)customerJTable.getValueAt(selectedRow,0);
        
        ViewCustomerJPanel modifyCustomer = new ViewCustomerJPanel(userProcessContainer, business, customerDirectory, customer);
        userProcessContainer.add("ModifyCustomersJPanel",modifyCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        SearchCustomersJPanel createCustomer = new SearchCustomersJPanel(userProcessContainer, business, customerDirectory);
        userProcessContainer.add("SearchCustomersJPanel",createCustomer);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JTable customerJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void populateTable(){
        
        DefaultTableModel dtm = (DefaultTableModel) customerJTable.getModel();
        dtm.setRowCount(0);
        
        for(Network n : business.getNetworks()){
            
            for(int i=0; i < n.getCustomerDirectory().getCustomerList().size(); i++){
                
                Object [] row = new Object[9];
                row[0] = n.getCustomerDirectory().getCustomerList().get(i).getName();
                row[1] = n.getCustomerDirectory().getCustomerList().get(i).getEmail();
                row[2] = n.getCustomerDirectory().getCustomerList().get(i).getLocation();
                row[3] = n.getCustomerDirectory().getCustomerList().get(i).getAddress();
                row[4] = n.getCustomerDirectory().getCustomerList().get(i).getPhoneNumber();
                row[5] = n.getCustomerDirectory().getCustomerList().get(i).getZipcode();
                row[6] = n.getCustomerDirectory().getCustomerList().get(i).getUsername();
                row[7] = n.getCustomerDirectory().getCustomerList().get(i).getPassword();
                
                dtm.addRow(row);
            }
        }
    }
}
