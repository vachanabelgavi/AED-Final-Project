/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PharmacyEnterpriseRole;
import Business.Customer.Customer;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Employee.Employee;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import javax.swing.JPanel;
import Business.Network.Network;
import Business.Role.DeliveryAgentRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pannaga
 */
public class ManageDeliveryAgentJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Ecosystem business;
    UserAccountDirectory userdir;
    UserAccount ua;
    DeliveryAgent dlvrymn;
    Enterprise enterprise;
    DefaultTableModel dtm;
    ArrayList<DeliveryAgent> del;
    ArrayList<Integer> z;
    /**
     * Creates new form ManageDeliveryAgentJPanel
     */
    public ManageDeliveryAgentJPanel(JPanel userProcessContainer, Ecosystem ecosystem, UserAccount ua,UserAccountDirectory userdir, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = ecosystem;
        this.ua = ua;
        this.userdir = userdir;
        this.enterprise = enterprise;
        this.z = new ArrayList<>();
        System.out.println("CAME INTO DELIVERY AGENT PANEL");
        dtm = (DefaultTableModel) deliveryjTable.getModel();
        
//        if(this.business == null) {
//            JOptionPane.showMessageDialog(null, "Something went wrong");
//        } else {
//            System.out.println("this.ecosystem for pharma is not null");
//        }
       
        System.out.println("Going inside populate table"); 
        populateTable();
        displaycombo();
        
        
        if(this.business.getUserAccountDirectory() == null) {
            this.userdir = new UserAccountDirectory();
            business.setUserAccountDirectory(userdir);
        } else {
            this.userdir = business.getUserAccountDirectory();
            
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        deliveryjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jcheckyes = new javax.swing.JCheckBox();
        jcheckno = new javax.swing.JCheckBox();
        cmbzipcode = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Delivery agent");

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
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1006, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 155, -1, -1));

        jLabel7.setText("Zipcode");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        jLabel8.setText("Username");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));

        jLabel9.setText("Password");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 150, 194, -1));
        add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 194, -1));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 194, -1));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 100, -1));

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        deliveryjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Zipcode", "Active", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(deliveryjTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 138, 477, 323));

        jLabel3.setText("Active");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jcheckyes.setText("yes");
        jcheckyes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcheckyesActionPerformed(evt);
            }
        });
        add(jcheckyes, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));

        jcheckno.setText("no");
        jcheckno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jchecknoActionPerformed(evt);
            }
        });
        add(jcheckno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        cmbzipcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        add(cmbzipcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//        PharmaceuticalEnterpriseJPanel sysAdminwjp = (PharmaceuticalEnterpriseJPanel) component;
//      populateTable();
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        
      Employee em = new Employee();
        DeliveryAgent d = new DeliveryAgent();
        UserAccount u = d.getUseraccount();

        String name = txtName.getText();
        int zip = Integer.parseInt((String) cmbzipcode.getSelectedItem());
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        boolean available;
        if(jcheckyes.isSelected() == true){
            available = true;
        }
        else if(jcheckno.isSelected() == true)
        {
            available = true;
        }else{
            available = false;
        }

        if(name.isEmpty() ||
            txtPassword.getText().isEmpty() || username.isEmpty() || password.isEmpty() || cmbzipcode.getSelectedItem().toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please fill the empty fields", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
//        if(txtZipcode.getText().length() < 5 || txtZipcode.getText().length() > 6){
//            JOptionPane.showMessageDialog(null, "Zip code must be 5 or 6 digits", "Warining", JOptionPane.WARNING_MESSAGE);
//            return;
//        }
        System.out.println("Inside loop");
        boolean flag = business.getUserAccountDirectory().checkIfUsernameIsUnique(username);
        if(flag == false){
            JOptionPane.showMessageDialog(null, "User name already exists");
        }

        else{
            //ecosystem.getCustomerdirectory().newCustomer(name, phone, age, streetaddress, emailaddress, username, password, country, city, zipcode);
            System.out.println("Inside else statement");
            Employee employee = business.getEmployeeDirectory().createEmployee(name);
            business.getUserAccountDirectory().createUserAccount(username, password, employee , new DeliveryAgentRole());

            ArrayList<Integer> zipcodes = new ArrayList<Integer>();
            zipcodes.add(zip);
            ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
            em.setName(name);
            u.setUsername(username);
            u.setPassword(password);
            u.setRole(new DeliveryAgentRole());
            u.setEmployee(em);
            d.setUseraccount(u);
            d.setZipcodes(zipcodes);
            d.setEnterprisename(enterprise);

            if(available == true){
                d.setActive(true);
            }else{
                d.setActive(false);
            }
            delList.add(d);
            enterprise.setDeliveryAgentsInEnterpiselist(delList);

            JOptionPane.showMessageDialog(null,"Delivery agent Added.");
            populateTable();
        }

        txtName.setText("");
        cmbzipcode.setSelectedItem("");
        txtUsername.setText("");
        txtPassword.setText("");
        jcheckyes.setSelected(false);
        jcheckno.setSelected(false);
        
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void jcheckyesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcheckyesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcheckyesActionPerformed

    private void jchecknoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jchecknoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jchecknoActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        int selectrow = deliveryjTable.getSelectedRow();
        String name = deliveryjTable.getValueAt(selectrow, 0).toString();

        if(selectrow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
      
        
        ArrayList<UserAccount> usrl = userdir.getUserAccountList();
        ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
        String deliveryman = dtm.getValueAt(selectrow,0).toString();
//        ArrayList<Integer> z1 = new ArrayList<>();
//        z1.add((Integer) dtm.getValueAt(selectrow,1));
       // String zipcodes = dtm.getValueAt(selectrow,1).toString();
      //  String available = dtm.getValueAt(selectrow, 2).toString();
        String uname = dtm.getValueAt(selectrow,3).toString();
        String passwd = dtm.getValueAt(selectrow,4).toString();
        int dialogueb = JOptionPane.YES_NO_OPTION;
        int dialoguer = JOptionPane.showConfirmDialog(this, "Delete this data","Delete", dialogueb);
        if(dialoguer == 0){
            
            try{
            for(DeliveryAgent dm: delList){
                if(dm.getUseraccount().getEmployee().getName().equals(deliveryman) && dm.getUseraccount().getUsername().equals(uname)){
                    delList.remove(dm);
                   System.out.println("Removed delivery man");
                }
            }
            }
            catch(Exception ex){
                System.out.println("Exception caught");
            }

            for(UserAccount ua:usrl ){
                if(ua.getUsername().equals(uname) || ua.getPassword().equals(passwd)){
                   // usrl.remove(uname);
                    usrl.remove(dtm.getValueAt(selectrow,3));
                    usrl.remove(dtm.getValueAt(selectrow,4));
                  //  usrl.remove(ua.getPassword().equals(passwd));
                  
                    System.out.println("Removed username and password");
                }
            }
            
             this.dtm.removeRow(selectrow);
      }
	
       
        
        populateTable();
    }//GEN-LAST:event_btndeleteActionPerformed

    public void populateTable(){
        
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
        ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
        for(DeliveryAgent dm: delList){
           System.out.println(" \n"+dm.getUseraccount().getEmployee().getName());
            System.out.println(" \n"+dm.getUseraccount().getUsername());
            System.out.println(" \n"+dm.getUseraccount().getPassword());
            System.out.println(" \n"+dm.getZipcodes());
            System.out.println(" \n"+dm.getActive());
            Object[] inrow = {dm.getUseraccount().getEmployee().getName(),dm.getZipcodes(),dm.getActive(),dm.getUseraccount().getUsername(), dm.getUseraccount().getPassword()};
            dtm.insertRow(dtm.getRowCount(),inrow); 
            System.out.println("done");
  }
   
 }
    
    
    private void displaycombo() {
       
         del = enterprise.getDeliveryAgentsInEnterpiselist();
         
        
        for(DeliveryAgent dd : del ){
         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
           // z.add(dd.getZipcodes().get(j));
              z = dd.getZipcodes();
              for(int i =0; i< dd.getZipcodes().size(); i++){
              cmbzipcode.addItem(z.get(i).toString());
              }
             }  
//    }
    }
 
   
       
        
//        for(Network n : business.getNetworks()){
//            
//            for(int i=0; i < n.; i++){
//                
//                Object [] row = new Object[3];
//                row[0] = n.getCustomerDirectory().getCustomerList().get(i).getName();
//                row[1] = n.getCustomerDirectory().getCustomerList().get(i).getEmail();
//                row[2] = n.getCustomerDirectory().getCustomerList().get(i).getLocation();
//                row[3] = n.getCustomerDirectory().getCustomerList().get(i).getAddress();
//                row[4] = n.getCustomerDirectory().getCustomerList().get(i).getPhoneNumber();
//                row[5] = n.getCustomerDirectory().getCustomerList().get(i).getZipcode();
//                row[6] = n.getCustomerDirectory().getCustomerList().get(i).getUsername();
//                row[7] = n.getCustomerDirectory().getCustomerList().get(i).getPassword();
//                
//                dtm.addRow(row);
//            }
//        }

//    for(Employee ent: business.getEmployeeDirectory().getEmployeeList()){
//        
//    }
      
//    for(Network network:business.getNetworks()){
//                //Step 2.a: check against each enterprise
//                for(int i=0; i < network.getEnterpriseDirectory().getEnterpriseList().size(); i++){
//                    for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
//                      
//                    }
//                    }
//    }



    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btndelete;
    private javax.swing.JComboBox<String> cmbzipcode;
    private javax.swing.JTable deliveryjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcheckno;
    private javax.swing.JCheckBox jcheckyes;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
