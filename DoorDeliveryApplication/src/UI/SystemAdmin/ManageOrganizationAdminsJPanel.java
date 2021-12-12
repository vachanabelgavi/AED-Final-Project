/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdmin;

import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.DoctorRole;
import Business.Role.EquipmentProviderRole;
import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.MarketManagerRole;
import Business.Role.PharmacistRole;
import Business.Role.VaccinatorRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class ManageOrganizationAdminsJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final Ecosystem ecosystem;
    DefaultTableModel tablemodel;

    /**
     * Creates new form ManageOrganizationAdminsJPanel
     */
    public ManageOrganizationAdminsJPanel(JPanel userProcessContainer, Ecosystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = system;
        this.tablemodel = (DefaultTableModel) Table.getModel();
        populateNetworks();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        comboNetwork = new javax.swing.JComboBox();
        comboEnteprise = new javax.swing.JComboBox();
        comboOrg = new javax.swing.JComboBox();
        fieldname = new javax.swing.JTextField();
        fieldusername = new javax.swing.JTextField();
        fieldpassword = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Network name", "Enterprise name", "Organization name", "username", "password", "employee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 66, 756, 260));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        comboNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNetworkActionPerformed(evt);
            }
        });
        add(comboNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 150, -1));

        comboEnteprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEntepriseActionPerformed(evt);
            }
        });
        add(comboEnteprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 150, -1));

        comboOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrgActionPerformed(evt);
            }
        });
        add(comboOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 150, -1));
        add(fieldname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 240, -1));
        add(fieldusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 430, 240, -1));
        add(fieldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 240, -1));

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNetworkActionPerformed
        // TODO add your handling code here:
        populateEnteprise((Network) comboNetwork.getSelectedItem());
    }//GEN-LAST:event_comboNetworkActionPerformed

    private void comboEntepriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEntepriseActionPerformed
        // TODO add your handling code here:
        populateOrgs((Enterprise) comboEnteprise.getSelectedItem());
    }//GEN-LAST:event_comboEntepriseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        // ADD ORG
        try {

            Network n = (Network) comboNetwork.getSelectedItem();

            Enterprise e = (Enterprise) comboEnteprise.getSelectedItem();

            Organization o = (Organization) comboOrg.getSelectedItem();
            Employee emp = new Employee();
            emp.setName(fieldname.getText());

            switch (o.getName()) {
                case "Doctor Associate":
                    UserAccount user = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new DoctorRole());
                    break;
                case "Pharmacy":
                    UserAccount user1 = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new PharmacistRole());
                    break;
                case "Supermarket":
                    UserAccount user2 = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new MarketManagerRole());
                    break;
                case "Equipments":
                    UserAccount user3 = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new EquipmentProviderRole());
                    break;
                case "Immunization":
                    UserAccount user4 = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new VaccinatorRole());
                    break;
                case "Lab Center":
                    UserAccount user5 = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new LabAssistantRole());
                    break;
                case "Sample Collection Center":
                    UserAccount user6 = o.getUserAccountDirectory().createUserAccount(fieldusername.getText(), fieldpassword.getText(), emp, new LabTesterRole());
                    break;
                default:
                    break;
            }

            JOptionPane.showMessageDialog(null, "Created Organization Admins");
            populateTable();
        } catch (Exception e) {

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboOrgActionPerformed

    public void populateTable() {
        this.tablemodel.setRowCount(0);

        try {
            for (Network n : this.ecosystem.getNetworks()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o.getUserAccountDirectory().getUserAccountList().size() > 0) {
                            tablemodel.insertRow(tablemodel.getRowCount(), new Object[]{
                                n.getNetworkName(),
                                e.getName(),
                                o.getName(),
                                o.getUserAccountDirectory().getUserAccountList().get(0).getUsername(),
                                o.getUserAccountDirectory().getUserAccountList().get(0).getPassword(),
                                o.getUserAccountDirectory().getUserAccountList().get(0).getEmployee().getName()
                            });
                        }
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println(ex + " ----------------------- ");
        }
    }

    public void populateNetworks() {
        comboNetwork.removeAllItems();
        try {
            for (Network n : this.ecosystem.getNetworks()) {
                if (n != null) {
                    comboNetwork.addItem(n);
                }
            }

        } catch (Exception e) {

        }
    }

    public void populateEnteprise(Network n) {
        try {
            comboEnteprise.removeAllItems();
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                comboEnteprise.addItem(e);
            }
        } catch (Exception e) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboEnteprise;
    private javax.swing.JComboBox comboNetwork;
    private javax.swing.JComboBox comboOrg;
    private javax.swing.JTextField fieldname;
    private javax.swing.JTextField fieldpassword;
    private javax.swing.JTextField fieldusername;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateOrgs(Enterprise e) {
        try {
            comboOrg.removeAllItems();
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                comboOrg.addItem(o);
            }
        } catch (Exception ex) {

        }

    }
}
