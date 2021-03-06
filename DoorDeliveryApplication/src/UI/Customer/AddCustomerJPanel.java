/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Customer.CustomerDirectory;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Network.Network;
import UI.SystemAdmin.ManageCustomersJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author vachanabelgavi
 */
public class AddCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCustomerJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem business;
    private Employee employee;
    private CustomerDirectory customerdirectory;

    public AddCustomerJPanel(JPanel userProcessContainer, Ecosystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.business = business;

        try {
            for(Network n: this.business.getNetworks()) {
                if(n != null) {
                    comboLoc.addItem(n.getNetworkName());
                }
            }
        } catch(Exception e) {

        }
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        comboLoc = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 252, 249));
        setPreferredSize(new java.awt.Dimension(1500, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(253, 252, 249));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Customer");

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1499, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1499, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 161, -1, -1));

        jLabel3.setText("Email Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 205, -1, -1));

        jLabel4.setText("Location");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 248, -1, -1));

        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 294, -1, -1));

        jLabel6.setText("Phone Number");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 338, -1, -1));

        jLabel7.setText("Zipcode");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 382, -1, -1));

        jLabel8.setText("Username");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 426, -1, -1));

        jLabel9.setText("Password");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 470, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 156, 180, -1));
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 200, 180, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 289, 180, -1));
        add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 333, 180, -1));
        add(txtZipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 377, 180, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 421, 180, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 465, 180, -1));

        btnAdd.setBackground(new java.awt.Color(0, 102, 102));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 524, 100, -1));

        add(comboLoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 244, 180, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/resources/animated_register.gif"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 900, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        String name = txtName.getText();
        int phone = Integer.valueOf(txtPhone.getText());
        int zip = Integer.valueOf(txtZipcode.getText());
        String streetaddress = txtAddress.getText();
        String email = txtEmail.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (name.isEmpty() || txtPhone.getText().isEmpty() || email.isEmpty() || streetaddress.isEmpty()
                || txtPassword.getText().isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill the empty fields", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtPhone.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "Phone Number must be 10 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (txtZipcode.getText().length() < 5 || txtZipcode.getText().length() > 6) {
            JOptionPane.showMessageDialog(null, "Zip code must be 5 or 6 digits", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean flag1;
        flag1 = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if (!flag1) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of username@email.com");
            return;
        }

        for (Network n : business.getNetworks()) {
            if (n.getNetworkName().equals(comboLoc.getSelectedItem().toString())) {
                for (int i = 0; i < n.getCustomerDirectory().getCustomerList().size(); i++) {

                    if (n.getCustomerDirectory().getCustomerList().get(i).getEmail().equals(email)) {
                        JOptionPane.showMessageDialog(null, "Email Address already exists");
                    }
                }
            }

        }

        boolean flag = business.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        if (flag == false) {
            JOptionPane.showMessageDialog(null, "User name already exists");
        } else {
            for (Network n : business.getNetworks()) {
                if (n.getNetworkName().equals(comboLoc.getSelectedItem().toString())) {
                    n.getCustomerDirectory().createCustomer(name, email, username, password, zip, comboLoc.getSelectedItem().toString() , streetaddress, phone);
                    JOptionPane.showMessageDialog(null, "Customer Added.");
                    break;
                }
            }

            //ecosystem.getUserAccountDirectory().createUserAccount(username, password, employee, new CustomerRole());
        }
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtZipcode.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageCustomersJPanel sysAdminwjp = (ManageCustomersJPanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboLoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
