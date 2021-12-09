/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabEnterpriseRole;


import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import javax.swing.JPanel;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Products.Product;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.activation.*;
import javax.mail.Address;

/**
 *
 * @author pannaga
 */
public class ManageLabOrdersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageLabOrdersJPanel
     */

    private JPanel userProcessContainer;
    private Ecosystem business;
    private CustomerDirectory customerDirectory;
    UserAccount ua;
    DeliveryAgent dlvrymn;
    Enterprise enterprise;
    DefaultTableModel dtm;
    //ArrayList<DeliveryAgent> d;
    UserAccountDirectory userdir;
    Customer customer;
    private OrderItem itemsdir;
    private Order order;
    private ArrayList<Order> orderplaced = new ArrayList<Order>();
    Organization organization;
    Network network;
    ArrayList<DeliveryAgent> del;
    ArrayList<Integer> z;
    
    public ManageLabOrdersJPanel(JPanel userProcessContainer, Ecosystem business,Network network,UserAccountDirectory userdir, Enterprise enterprise, Customer customer, Organization organization, UserAccount ua) {
        initComponents();
        //initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.userdir = userdir;
        this.enterprise = enterprise;
        this.customer = customer;
        this.network = network;
        this.organization = organization;
         this.z = new ArrayList<>();
         this.ua = ua;
         this.dlvrymn = new DeliveryAgent();

        System.out.println("CAME INTO LAB ORDER PANEL");
        dtm = (DefaultTableModel) LabOrderTable.getModel();

//        if (order.getItemsOrdered() != null){
//
//            }
//            else{
////                this.itemsdir = new ItemsDirectory();
////                enterprise.setItemsDirectory(itemsdir);
//            }


       // displaycombobox();
        //populateTable();
       
        populateDp();

        for(Network n : business.getNetworks()){
            this.customerDirectory = n.getCustomerDirectory();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        LabOrderTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        deliverycmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        assignbtn = new javax.swing.JButton();
        btnshoworders = new javax.swing.JButton();
        orderscmb = new javax.swing.JComboBox<>();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Product Name", "Name", "Zipcode", "Price", "Delivery agent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(LabOrderTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 803, 186));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 54, -1, -1));

        deliverycmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliverycmbActionPerformed(evt);
            }
        });
        jPanel1.add(deliverycmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 148, -1));

        jLabel1.setText("Assign Delivery agent");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        assignbtn.setText("Assign");
        assignbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignbtnActionPerformed(evt);
            }
        });
        jPanel1.add(assignbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 105, -1));

        btnshoworders.setText("Show Orders");
        btnshoworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowordersActionPerformed(evt);
            }
        });
        jPanel1.add(btnshoworders, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 99, 130, 30));

        orderscmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderscmbActionPerformed(evt);
            }
        });
        jPanel1.add(orderscmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 993, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    public void populateDp() {
      //  dtm.setRowCount(0);
       // int selectrow = pharmaOrderTable.getSelectedRow();
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
         System.out.println("Inside combo box");
            
            for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                //  Order o : this.customer.getOrderlist()//              populate items
                if("ACCEPTED".equals(o.getStatus())){
                orderscmb.addItem(String.valueOf(o.getOrderId()));
            }
        }

    }
    }
    
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void deliverycmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliverycmbActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_deliverycmbActionPerformed

    private void assignbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignbtnActionPerformed
        // TODO add your handling code here:
        String agent = deliverycmb.getSelectedItem().toString();

        System.out.println("Inside assign button");
        dtm.setRowCount(0);
        ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        String recipients = null;

        System.out.println("Inside table after assigning");

        for(Customer cust: customerdir){
            for (Order o : cust.getOrderlist()) {
                ArrayList<OrderItem> oi = o.getItemsOrdered();
                ArrayList<String> pr = new ArrayList<>();
                //  Order o : this.customer.getOrderlist()//              populate items
                for (int i = 0; i < oi.size(); i++) {

                    pr.add(oi.get(i).getProductName());
                }

                if("ACCEPTED".equals(o.getStatus()) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
                    System.out.println(" "+agent);
                    o.setDeliveryAgent(dlvrymn);
                    dlvrymn.setUseraccount(ua);
                    ua.setUsername(agent);
                    ArrayList<DeliveryAgent> del = enterprise.getDeliveryAgentsInEnterpiselist();
                    System.out.println(o.getDeliveryAgent().getUseraccount().getUsername());
                    for(DeliveryAgent d: del){

                        if(o.getDeliveryAgent().getUseraccount().getUsername() == agent && d.getUseraccount().getUsername() == agent){
                            //o.getDeliveryAgent().getUseraccount().getUsername()
                            System.out.println(" "+d.getUseraccount().getUsername());
                            JOptionPane.showMessageDialog(null, "Delivery agent not available for now");
                        }else{
                            //                 o.setDeliveryAgent(dlvrymn);
                            //                dlvrymn.setUseraccount(ua);
                            //                ua.setUsername(agent);
                            dtm.insertRow(dtm.getRowCount(), new Object[]{
                                o.getOrderId(),
                                Arrays.toString(pr.toArray()),
                                cust.getName(),
                                cust.getZipcode(),
                                o.getPrice(),
                                agent
                            });

                        recipients = cust.getEmail();
                        }
                        System.out.println("Entering assign for email ==========");
                        String subjects = "Delivery";
                        String messaget = "Delivered agent assigned successfully";

                        System.out.println("Start");
                        final String username = "pannagaveeramohan@gmail.com";
                        final String password = "9686300037";

                        Properties p = new Properties();
                        p.put("mail.smtp.auth", "true");
                        p.put("mail.smtp.host", "smtp.gmail.com");
                        p.put("mail.smtp.port", "465");
                        p.put("mail.transport.protocol", "smtp");
                        p.put("mail.smtp.starttls.enable", "true");
                        p.put("mail.smtp.starttls.enable", "true");
                        p.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

                        Session session = Session.getInstance(p,
                            new javax.mail.Authenticator() {
                                protected PasswordAuthentication getPasswordAuthentication() {
                                    return new PasswordAuthentication(username, password);
                                }
                            });

                            try {

                                Transport transport=session.getTransport();
                                Message message = new MimeMessage(session);
                                message.setFrom(new InternetAddress("pannagaveeramohan@gmail.com"));//formBean.getString("fromEmail")

                                final Address[] recipientAddresses = InternetAddress.parse(recipients);
                                message.setRecipients(Message.RecipientType.TO,recipientAddresses);
                                message.setSubject(subjects);//formBean.getString(
                                    message.setText(messaget);
                                    transport.connect();
                                    transport.send(message, recipientAddresses);//(message);

                                    System.out.println("Done");

                                } catch (MessagingException e) {
                                    System.out.println("e="+e);
                                    e.printStackTrace();
                                    throw new RuntimeException(e);

                                }
                                JOptionPane.showMessageDialog(null, "Delivery agent assigned successful");
                                JOptionPane.showMessageDialog(null, "Email sent to customer successful");

                            }
                        }
                    }
                }
        
    }//GEN-LAST:event_assignbtnActionPerformed

    private void btnshowordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowordersActionPerformed
        // TODO add your handling code here:

        ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
        System.out.println("Inside table");

        for(Customer cust: customerdir){
            for (Order o : cust.getOrderlist()) {
                if(orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
                    populateTable();
                }
            }
        }

    }//GEN-LAST:event_btnshowordersActionPerformed

     private void populateTable() {
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
          del = this.enterprise.getDeliveryAgentsInEnterpiselist();
         ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

             System.out.println("Inside table");
            
            
                for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> p = new ArrayList<>();
                for (int i = 0; i < oi.size(); i++) {
                    
                    p.add(oi.get(i).getProductName());
                }
                if("ACCEPTED".equals(o.getStatus()) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
                
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                     o.getOrderId(),
                     Arrays.toString(p.toArray()),
                    cust.getName(),
                    cust.getZipcode(),
                    o.getPrice(),
                    o.getDeliveryAgent().getUseraccount().getUsername()
                });
                
             for(DeliveryAgent dd : del ){
         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
           // z.add(dd.getZipcodes().get(j));
              z = dd.getZipcodes();
              for(int j =0; j< dd.getZipcodes().size(); j++){
              if(cust.getZipcode() == z.get(j) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
                deliverycmb.addItem(dd.getUseraccount().getUsername());
                }
                }
                }//closing delivery agent assignment
               }
               }//closing if statement
            }
                
               System.out.println("Done with populate table");
   } 
    
    
    private void orderscmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderscmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderscmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable LabOrderTable;
    private javax.swing.JButton assignbtn;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnshoworders;
    private javax.swing.JComboBox<String> deliverycmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> orderscmb;
    // End of variables declaration//GEN-END:variables

    
}
