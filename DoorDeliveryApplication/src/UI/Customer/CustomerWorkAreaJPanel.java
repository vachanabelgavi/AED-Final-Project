/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Customer;

import Business.Customer.Customer;
import Business.Ecosystem;
import Business.Network.Network;
import UI.OrganizationPanels.CustomerPrescriptionJPanel;
import UI.OrganizationPanels.OrdersJPanel;
import UI.OrganizationPanels.PrescriptionHistoryJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import UI.OrganizationPanels.PharmacyJPanel;
import UI.OrganizationPanels.VaccineJPanel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerWorkAreaJPanel
     */
    
    Ecosystem system;
    Network network;
    Customer customer;
    JPanel userProcessContainer;

    public CustomerWorkAreaJPanel(JPanel userProcessContainer, Ecosystem system, Network network, Customer c) {
        initComponents();
        this.setSize(1000, 800);
        this.system = system;
        this.customer = c;
        this.network = network;//To change body of generated methods, choose Tools | Templates.
        this.userProcessContainer = userProcessContainer;
    }
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pane = new javax.swing.JSplitPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        leftPane = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        prescriptionBtn = new javax.swing.JButton();
        browseBtn1 = new javax.swing.JButton();
        cartBtn1 = new javax.swing.JButton();
        orderBtn1 = new javax.swing.JButton();
        paymentBTn1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1500, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("PHARMACY", jPanel1);
        jTabbedPane1.addTab("SUPERMARKETS", jPanel3);
        jTabbedPane1.addTab("MEDICAL EQUIPMENTS", jPanel2);

        jPanel4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel4FocusGained(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jTabbedPane1.addTab("VACCINE & IMMUNIZATION", jPanel4);
        jTabbedPane1.addTab("LAB CENTER & DIAGNOSTICS", jPanel5);
        jTabbedPane1.addTab("FIND A DOCTOR", jPanel6);

        pane.setRightComponent(jTabbedPane1);

        leftPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("<< BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        leftPane.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 5, -1, -1));

        prescriptionBtn.setText("MY PRESCRIPTIONS");
        prescriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prescriptionBtnActionPerformed(evt);
            }
        });
        leftPane.add(prescriptionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, 40));

        browseBtn1.setText("BROWSE");
        browseBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseBtn1ActionPerformed(evt);
            }
        });
        leftPane.add(browseBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 40));

        cartBtn1.setText("MY CART");
        cartBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartBtn1ActionPerformed(evt);
            }
        });
        leftPane.add(cartBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 150, 40));

        orderBtn1.setText("MY ORDERS");
        orderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtn1ActionPerformed(evt);
            }
        });
        leftPane.add(orderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 150, 40));

        paymentBTn1.setText("MY PAYMENTS");
        leftPane.add(paymentBTn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 150, 40));

        jButton2.setText("PRESCRIPTION HISTORY");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        leftPane.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 150, 40));

        pane.setLeftComponent(leftPane);

        add(pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 5, 1210, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setComponentAt(0, new PharmacyJPanel(this.system, this.network, this.customer));
        jTabbedPane1.setComponentAt(3, new VaccineJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel4FocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jPanel4FocusGained

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        jPanel1.add(new VaccineJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        // TODO add your handling code here:
        jPanel1.add(new PharmacyJPanel(this.system, this.network, this.customer));
    }//GEN-LAST:event_jPanel1MouseClicked

    private void browseBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseBtn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setLeftComponent(null);
        pane.removeAll();
        pane.setRightComponent(new CustomerWorkAreaJPanel(this.userProcessContainer, this.system, this.network, this.customer));
    }//GEN-LAST:event_browseBtn1ActionPerformed

    private void cartBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartBtn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent( new CustomerCartJPanel(this.system, this.network, this.customer) );
    }//GEN-LAST:event_cartBtn1ActionPerformed

    private void orderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtn1ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new OrdersJPanel(this.system, this.customer));
    }//GEN-LAST:event_orderBtn1ActionPerformed

    private void prescriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prescriptionBtnActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new CustomerPrescriptionJPanel(this.system, this.customer));
    }//GEN-LAST:event_prescriptionBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        if(componentArray.length == 1) {
//            Component component = componentArray[componentArray.length - 1];
//        } else {
//            Component component = componentArray[componentArray.length];
//        }
        
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        pane.setRightComponent(null);
        pane.setRightComponent(new PrescriptionHistoryJPanel(this.system, this.customer));
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseBtn1;
    private javax.swing.JButton cartBtn1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel leftPane;
    private javax.swing.JButton orderBtn1;
    private javax.swing.JSplitPane pane;
    private javax.swing.JButton paymentBTn1;
    private javax.swing.JButton prescriptionBtn;
    // End of variables declaration//GEN-END:variables
}
