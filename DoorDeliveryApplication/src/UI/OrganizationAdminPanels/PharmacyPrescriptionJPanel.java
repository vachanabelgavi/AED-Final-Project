/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.OrganizationAdminPanels;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PrescriptionUploadWorkRequest;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class PharmacyPrescriptionJPanel extends javax.swing.JPanel {

    private final JPanel userprocesscontainer;
    private final Ecosystem ecosystem;
    private final Network network;
    private final UserAccount user;
    private final Enterprise enterprise;

    ArrayList<PrescriptionUploadWorkRequest> workrequest;
    private final Organization organization;
    private PrescriptionUploadWorkRequest currentWorkingRequest;

    DefaultTableModel tableModel;

    /**
     * Creates new form PharmacyPrescriptionJPanel
     */
    public PharmacyPrescriptionJPanel(JPanel userProcessContainer, Ecosystem system, UserAccount user, Network network, Organization organization, Enterprise enterprise) {
        initComponents();

        this.userprocesscontainer = userProcessContainer;
        this.ecosystem = system;
        this.network = network;
        this.enterprise = enterprise;
        this.user = user;
        this.organization = organization;

        this.workrequest = this.ecosystem.getPrescriptionWorkList();
        this.tableModel = (DefaultTableModel) jTable2.getModel();
        if (workrequest.size() != 0) {
//            populate prescription dropdown
//populate product dropdown
            populatePres();
            populateProducts();
            System.out.println("IN PHARM PPRESC  ----- " + this.organization.getName() + this.organization.getOrganizationProducts().size());

        } else {
            JOptionPane.showMessageDialog(null, "No Prescription Requests!");
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        dropdownPrescription = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        labelCustomerName = new javax.swing.JLabel();
        labelNetwork = new javax.swing.JLabel();
        labelDoctorSign = new javax.swing.JLabel();
        labelOrderId = new javax.swing.JLabel();
        labelOrderStatus = new javax.swing.JLabel();
        createOrderbttn = new javax.swing.JButton();
        btnGo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setBackground(new java.awt.Color(253, 252, 249));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PHARMACIST'S PRESCRIPTION WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 26, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "PRODUCT PRICE", "STOCK ", "QTY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 347, -1, 304));

        add(dropdownPrescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 106, 180, -1));

        jLabel2.setText("CUSTOMER NAME");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 175, -1, -1));

        jLabel3.setText("NETWORK");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 207, -1, -1));

        jLabel4.setText("DOCTOR SIGNATURE");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 239, -1, -1));

        jLabel5.setText("ORDER ID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 271, -1, -1));

        jLabel6.setText("ORDER STATUS");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 304, -1, -1));

        labelCustomerName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 169, 229, 20));

        labelNetwork.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 201, 229, 20));

        labelDoctorSign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelDoctorSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(734, 233, 229, 20));

        labelOrderId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelOrderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 264, 229, 20));

        labelOrderStatus.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(labelOrderStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 229, 20));

        createOrderbttn.setBackground(new java.awt.Color(0, 102, 102));
        createOrderbttn.setForeground(new java.awt.Color(255, 255, 255));
        createOrderbttn.setText("CREATE ORDER");
        createOrderbttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderbttnActionPerformed(evt);
            }
        });
        add(createOrderbttn, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 645, -1, -1));

        btnGo.setBackground(new java.awt.Color(0, 102, 102));
        btnGo.setForeground(new java.awt.Color(255, 255, 255));
        btnGo.setText("GO");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });
        add(btnGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(784, 105, -1, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 79, 368, 507));
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        // TODO add your handling code here:

        for (PrescriptionUploadWorkRequest wq : this.workrequest) {
            if (wq.getRequestId() == (int) dropdownPrescription.getSelectedItem()) {
                labelCustomerName.setText(wq.getCustomer().getName());
                labelDoctorSign.setText(wq.getSignature());
                labelNetwork.setText(wq.getCustomer().getLocation());
                this.currentWorkingRequest = wq;

                if (wq.getPresecription() != null) {
                    ImageIcon ii = new ImageIcon(wq.getPresecription().getAbsolutePath());
                    jLabel7.setIcon(ii);
                }
                break;
            }
        }

    }//GEN-LAST:event_btnGoActionPerformed

    private void createOrderbttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderbttnActionPerformed
        // TODO add your handling code here:

//        Create an order
        ArrayList<Order> customerorder = this.currentWorkingRequest.getCustomer().getOrderlist();

        Order o = new Order();

        try {
            int count = this.tableModel.getRowCount();

            ArrayList<OrderItem> oi = o.getItemsOrdered();

            for (int i = 0; i < count; i++) {

                if ((int) tableModel.getValueAt(i, 4) > 0) {

                    OrderItem item = new OrderItem();
                    item.setProductId((int) tableModel.getValueAt(i, 0));
                    item.setProductName((String) tableModel.getValueAt(i, 1));
                    item.setProductPrice((double) tableModel.getValueAt(i, 2));
                    item.setQty((int) tableModel.getValueAt(i, 4));

                    Product p = this.organization.fetchProduct(item.getProductId());
                    if (item.getQty() > p.getStockunits()) {
                        JOptionPane.showMessageDialog(null, "Quantity is greater than stock units. Can't perform this operation.");
                        break;
                    }

                    ArrayList<Product> prods = this.organization.getOrganizationProducts();
                    int idx = prods.indexOf(p);
                    System.out.println("FOUNT PPRODUCT AT  ------- " + idx);
                    int stock = p.getStockunits() - item.getQty();
                    p.setStockunits(stock);
                    prods.set(idx, p);
                    this.organization.setProductList(prods);

                    oi.add(item);
                    System.out.println("ADDING ITEMS");
                    o.setItemsOrdered(oi);
                }
            }

            o.setPrescription(this.currentWorkingRequest.getPresecription());
            labelOrderId.setText(String.valueOf(o.getOrderId()));
            o.setStatus("ACCEPTED");
            o.calcOrderTotal();
            labelOrderStatus.setText(o.getStatus());
            o.setOrganizationname(this.organization.getName());

            customerorder.add(o);
            this.currentWorkingRequest.setOrderId(o.getOrderId());
            this.currentWorkingRequest.getCustomer().setOrderlist(customerorder);
            this.currentWorkingRequest.setPrescribedOrderItems(oi);

            JOptionPane.showMessageDialog(null, "ORDER HAS BEEN CREATED.");
            populateProducts();
        } catch (Exception e) {
            System.out.println(e + " In Prescription Pharmacy");
        }

    }//GEN-LAST:event_createOrderbttnActionPerformed

    public void populatePres() {

        for (PrescriptionUploadWorkRequest pu : this.workrequest) {
            if (pu.getReceiver().getUsername().equals(user.getUsername())) {
                dropdownPrescription.addItem(pu.getRequestId());
            }

        }

    }

    public void populateProducts() {
        try {
            this.tableModel.setRowCount(0);

            for (Product p : this.organization.getOrganizationProducts()) {
                System.out.println("INSIDE POPuLATE ORDER  --- ");
                if (p.getStockunits() != 0) {
                    this.tableModel.insertRow(this.tableModel.getRowCount(), new Object[]{
                        p.getProductId(),
                        p.getName(),
                        p.getPrice(),
                        p.getStockunits(),
                        1
                    });
                }
            }

        } catch (Exception e) {
            System.out.println("-------------- ORG PRODUCTS IN PHARMACY PRESC " + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGo;
    private javax.swing.JButton createOrderbttn;
    private javax.swing.JComboBox dropdownPrescription;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelCustomerName;
    private javax.swing.JLabel labelDoctorSign;
    private javax.swing.JLabel labelNetwork;
    private javax.swing.JLabel labelOrderId;
    private javax.swing.JLabel labelOrderStatus;
    // End of variables declaration//GEN-END:variables
}
