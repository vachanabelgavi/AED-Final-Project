/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationAdminPanels;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Ecosystem ecosystem;
    private UserAccount user;
    private Network network;
    private Organization organization;
    private Enterprise enterprise;

    DefaultTableModel tableModel;
    private final ArrayList<PrescriptionUploadWorkRequest> workRequest;
    private File chosenFile;
    private Order currentOrder;

    private Customer currentCustomer;

    PrescriptionUploadWorkRequest currentRequest;

//    CROSS NETWORK FIELDS
    Network customerNetwork;
    Enterprise customerEnterprise;
    Organization customerOrganization;
    UserAccount toPharmacist;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount ua, Network network, Organization organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = system;
        this.user = ua;
        this.network = network;
        this.organization = organization;
        this.enterprise = enterprise;
        this.workRequest = this.ecosystem.getPrescriptionWorkList();

        this.tableModel = (DefaultTableModel) itemTable.getModel();

        populateOrderDropdown();

        populateNetworks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelCustomer = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldComment = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        orderComboBox = new javax.swing.JComboBox();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        fieldSign = new javax.swing.JTextPane();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fieldNewCheckBox = new javax.swing.JCheckBox();
        btnCreateACustomerPresc = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        searchACustomerBtn = new javax.swing.JButton();
        fieldName = new javax.swing.JTextField();
        networkCombo = new javax.swing.JComboBox();
        fieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fieldAddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        zipcodeCombo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        uploadFileBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        fieldNotes = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        fieldSignature = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " ITEM NO.", "ITEM NAME", "ITEM QTY"
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
        jScrollPane1.setViewportView(itemTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, 268));

        jLabel2.setText("Hello Doctor");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 420, 597));

        jLabel3.setText("NOTES");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        labelCustomer.setText("<customer>");
        jPanel1.add(labelCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 105, -1));

        fieldComment.setColumns(20);
        fieldComment.setRows(5);
        jScrollPane2.setViewportView(fieldComment);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 373, 90));

        jButton2.setText("APPROVE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 610, -1, -1));

        orderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        orderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(orderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 175, -1));

        jButton6.setText("GO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, -1, -1));

        jLabel13.setText("SIGNATURE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jScrollPane4.setViewportView(fieldSign);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 240, -1));

        jButton7.setText("REJECT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 610, -1, -1));

        jLabel14.setText("ORDER STATUS :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, 10));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, -1, -1));

        jTabbedPane1.addTab("MY REQUESTS", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 61, 399, 571));

        fieldNewCheckBox.setText("NEW CUSTOMER");
        jPanel2.add(fieldNewCheckBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        btnCreateACustomerPresc.setText("CREATE ");
        btnCreateACustomerPresc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateACustomerPrescActionPerformed(evt);
            }
        });
        jPanel2.add(btnCreateACustomerPresc, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 610, -1, -1));

        jTextField1.setText("Search Customer");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 510, -1));

        searchACustomerBtn.setText("GO");
        searchACustomerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchACustomerBtnActionPerformed(evt);
            }
        });
        jPanel2.add(searchACustomerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        fieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNameActionPerformed(evt);
            }
        });
        jPanel2.add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 250, -1));

        networkCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkComboActionPerformed(evt);
            }
        });
        jPanel2.add(networkCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 200, -1));
        jPanel2.add(fieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 250, -1));

        jLabel5.setText("CUSTOMER NAME");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel6.setText("EMAIL ADDRESS");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        jPanel2.add(fieldPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 250, -1));

        jLabel7.setText("PHONE NUMBER");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));
        jPanel2.add(fieldAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 250, 60));

        jLabel8.setText("ADDRESS");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, -1, -1));

        jPanel2.add(zipcodeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 120, -1));

        jLabel9.setText("Network");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jLabel10.setText("Zip code");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, -1));

        uploadFileBtn.setText("UPLOAD PRESCRIPTION");
        uploadFileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadFileBtnActionPerformed(evt);
            }
        });
        jPanel2.add(uploadFileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));

        fieldNotes.setColumns(20);
        fieldNotes.setRows(5);
        jScrollPane3.setViewportView(fieldNotes);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, 240, 90));

        jLabel11.setText("NOTES");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));
        jPanel2.add(fieldSignature, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 650, 230, -1));

        jLabel12.setText("SIGNATURE");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 650, -1, -1));

        jTabbedPane1.addTab("CREATE PRESCRIPTION", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_fieldNameActionPerformed

    private void uploadFileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadFileBtnActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("png", "jpg", "jpeg", "pdf");
        chooser.addChoosableFileFilter(filter);
        this.chosenFile = chooser.getSelectedFile();

        try {
            ImageIcon ii = new ImageIcon(this.chosenFile.getAbsolutePath());
            jLabel4.setIcon(ii);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Looks like you missed an attachment!");
        }


    }//GEN-LAST:event_uploadFileBtnActionPerformed

    private void btnCreateACustomerPrescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateACustomerPrescActionPerformed
        // TODO add your handling code here:

        try {
            if (chosenFile == null) {
                JOptionPane.showMessageDialog(null, "PRESCRIPTION REQUIRED!");
            } else {
//        CHECK IF ITS A NEW CUSTOMER
                if (fieldNewCheckBox.isSelected() == true) {
                    Network selectedNetwork = (Network) networkCombo.getSelectedItem();
                    System.out.println("SELECTED NETWORK ------------ " + selectedNetwork + selectedNetwork.getNetworkName());
                    Boolean b = checkIfCustomerExists();

                    if (!b) {
                        System.out.println("CAME INTO CREATING NEW CUSTOMER");
                        Customer newCustoemr = selectedNetwork.getCustomerDirectory().createCustomer(fieldName.getText(), fieldEmail.getText(), "", "", (int) zipcodeCombo.getSelectedItem(), selectedNetwork.getNetworkName(), fieldAddress.getText(), Integer.valueOf(fieldPhone.getText()));

//           Create order for customer in pharmacy admin panel
//           Prescription work request is at the system level
// get the pharmacist in this  network's pharmacy organization
                        Enterprise e = selectedNetwork.getEnterpriseDirectory().getEnterprise("Pharmaceutical");
                        this.customerOrganization = e.getOrganizationDirectory().getOrganizationByName("Pharmacy");

                        try {

                            this.toPharmacist = this.customerOrganization.getUserAccountDirectory().getUserAccountList().get(0);

                            PrescriptionUploadWorkRequest pq = new PrescriptionUploadWorkRequest();
                            pq.setSender(user);
                            pq.setCustomer(newCustoemr);
                            pq.setReceiver(toPharmacist);
                            pq.setPresecription(chosenFile);
                            pq.setSignature(fieldSignature.getText());
                            pq.setComments(fieldNotes.getText());
                            pq.setStatus("INCOMING PRESCRIPTION");
                            pq.generateRequestId();
                            this.workRequest.add(pq);

                            JOptionPane.showMessageDialog(null, "PRESCRIPTION SENT TO " + this.toPharmacist.getEmployee().getName());
                        } catch (Exception err) {
                            System.out.println("error --- " + err);
                            JOptionPane.showMessageDialog(null, "Looks like there is no pharmacy admin for the organization!");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "CUSTOMER EXISTS.");
                    }

//                    MAILING SERVICE
                } else {

                    System.out.println(this.toPharmacist + " 888888888888888 PHARMACIST OBJECT");
                    PrescriptionUploadWorkRequest pq = new PrescriptionUploadWorkRequest();
                    pq.setSender(user);
                    pq.setCustomer(this.currentCustomer);
                    pq.setReceiver(this.toPharmacist);
                    pq.setPresecription(chosenFile);
                    pq.setSignature(fieldSignature.getText());
                    pq.setComments(fieldNotes.getText());
                    pq.setStatus("INCOMING PRESCRIPTION");
                    pq.generateRequestId();
                    this.workRequest.add(pq);

                    JOptionPane.showMessageDialog(null, "PRESCRIPTION SENT TO " + this.toPharmacist.getEmployee().getName());
                }
            }
        } catch (Exception e) {
            System.out.println("EXCEPTION --------------- " + e);
        }
    }//GEN-LAST:event_btnCreateACustomerPrescActionPerformed

    private void orderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderComboBoxActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        GET ORDER BUTTON
        try {
            for (PrescriptionUploadWorkRequest work : this.workRequest) {
                if (work.getOrderId() == Integer.valueOf((int) orderComboBox.getSelectedItem())) {
//            once order is found in the request
//      Get customer info
                    this.currentRequest = work;
                    labelCustomer.setText(work.getCustomer().getName());
                    Order o = work.getCustomer().findOrderById(work.getOrderId());

                    this.currentOrder = o;

                    tableModel.setRowCount(0);

                    for (OrderItem oi : o.getItemsOrdered()) {
                        tableModel.insertRow(tableModel.getRowCount(), new Object[]{
                            oi.getProductId(),
                            oi.getProductName(),
                            oi.getQty()
                        });
                    }

                    fieldComment.setText(work.getComments());
                    fieldSign.setText(work.getSignature());
                    jLabel15.setText(o.getStatus());

                    ImageIcon ii = new ImageIcon(work.getPresecription().getAbsolutePath());
                    jLabel1.setIcon(ii);

                    break;
                }
            }
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (this.currentRequest != null) {
            this.currentRequest.setComments(fieldComment.getText());
            this.currentRequest.setSignature(fieldSign.getText());
            this.currentOrder.setStatus("PRESCRIPTION APPROVED");
            this.currentRequest.setStatus("PRESCRIPTION APPROVED");

            JOptionPane.showMessageDialog(null, "Your request is closed!");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (this.currentRequest != null) {
            this.currentRequest.setComments(fieldComment.getText());
            this.currentRequest.setSignature(fieldSign.getText());
            this.currentOrder.setStatus("PRESCRIPTION REJECTED");
            this.currentRequest.setStatus("PRESCRIPTION REJECTED");

            JOptionPane.showMessageDialog(null, "Your request is closed!");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1FocusGained

    private void searchACustomerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchACustomerBtnActionPerformed
        // TODO add your handling code here:

        if (jTextField1.getText().trim().length() > 0) {
            //        FIND THE CUSTOMER AND HIS DETAILS ACROSS NETWORK

            Customer customer = new Customer();

//            CROSS NETWORK REQUEST
            for (Network network : this.ecosystem.getNetworks()) {
                customer = network.getCustomerDirectory().searchCustomer(jTextField1.getText());
                System.out.println("NETWORK --- " + network.getNetworkName());
                if (customer != null) {
                    fieldName.setText(customer.getName());
                    fieldEmail.setText(customer.getEmail());
                    fieldPhone.setText(String.valueOf(customer.getPhoneNumber()));
                    fieldAddress.setText(customer.getAddress());
                    networkCombo.setSelectedItem(network);
                    zipcodeCombo.setSelectedItem(customer.getZipcode());
                    this.currentCustomer = customer;

//                    Registering the customer's network, pharmacy organization
                    this.customerNetwork = network;
                    this.customerOrganization = network.getEnterpriseDirectory().getEnterprise("Pharmaceutical").getOrganizationDirectory().getOrganizationByName("Pharmacy");
                    if (network.getNetworkName().equals("California")) {
                        System.out.println("ADDED PANNAGA ----------------");
                        this.toPharmacist = this.customerOrganization.getUserAccountDirectory().getUserAccountList().get(0);
                    } else {
                        System.out.println("ADDED BOSTON PHARMACIST --------------------- ");
                        this.toPharmacist = this.customerOrganization.getUserAccountDirectory().getUserAccountList().get(0);
                    }

                    JOptionPane.showMessageDialog(null, "Done!");
                    break;
                } else {

                }
            }

            if (customer == null) {
                JOptionPane.showMessageDialog(null, "This customer does not exist with us!");
            }

        }


    }//GEN-LAST:event_searchACustomerBtnActionPerformed

    private void networkComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkComboActionPerformed
        // TODO add your handling code here:
        populateZipcodes();
    }//GEN-LAST:event_networkComboActionPerformed

    public void populateZipcodes() {

        try {
            for (Network n : this.ecosystem.getNetworks()) {
                Network nSelected = (Network) networkCombo.getSelectedItem();
                if (nSelected != null) {
                    if (n.getNetworkName().equals(nSelected.getNetworkName())) {
                        for (Integer i : n.getZipcodes()) {
                            zipcodeCombo.addItem(i);
                        }
                    }
                }

            }
        } catch (Exception e) {

        }
    }

    public Boolean checkIfCustomerExists() {
        for (Network n : this.ecosystem.getNetworks()) {
//            if the customer account is present - it returns a NOT null
            System.out.println(fieldName.getText() + " ********* customer new **********");
            if (n.getCustomerDirectory().searchCustomer(fieldName.getText()) != null) {
                System.out.println("FOUND A CUSTOMER WITH THIS NAEM !");
                return true;
            } else {

            }
        }

        return false;
    }

    public void populateNetworks() {

        for (Network n : this.ecosystem.getNetworks()) {
            networkCombo.addItem(n);
        }

    }

    public void populateOrderDropdown() {
        for (PrescriptionUploadWorkRequest work : this.workRequest) {
            if (work != null) {
                System.out.println("WORK :: " + work.getRequestId() + work.getOrderId());
                orderComboBox.addItem(work.getOrderId());
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateACustomerPresc;
    private javax.swing.JTextField fieldAddress;
    private javax.swing.JTextArea fieldComment;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JTextField fieldName;
    private javax.swing.JCheckBox fieldNewCheckBox;
    private javax.swing.JTextArea fieldNotes;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JTextPane fieldSign;
    private javax.swing.JTextField fieldSignature;
    private javax.swing.JTable itemTable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCustomer;
    private javax.swing.JComboBox networkCombo;
    private javax.swing.JComboBox orderComboBox;
    private javax.swing.JButton searchACustomerBtn;
    private javax.swing.JButton uploadFileBtn;
    private javax.swing.JComboBox zipcodeCombo;
    // End of variables declaration//GEN-END:variables
}
