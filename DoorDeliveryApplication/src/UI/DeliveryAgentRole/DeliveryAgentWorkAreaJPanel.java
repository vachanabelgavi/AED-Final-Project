/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DeliveryAgentRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Orders.OrderItem;
import Business.Organization.Organization;
import Business.Payment.Payment;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import UI.MainJFrame;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pannaga
 */
public class DeliveryAgentWorkAreaJPanel extends javax.swing.JPanel {
     JPanel userProcessContainer;
     Ecosystem ecosystem;
     UserAccount account;
     UserAccountDirectory useraccountdirectory;
     Enterprise enterprise;
     Customer customer;
     Organization organization;
     Network network;
     UserAccount delmn;
      ArrayList<Integer> z;
      DefaultTableModel dtm;
      ArrayList<DeliveryAgent> del;
    /**
     * Creates new form DeliveryAgentWorkAreaJPanel
     */
    public DeliveryAgentWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Network network,Organization organization, Enterprise enterprise,Ecosystem ecosystem) {
        initComponents();
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account = account;
        this.enterprise = enterprise;
        this.organization = organization;
        this.network = network;
        this.z = new ArrayList<>();
         if(this.ecosystem.getUserAccountDirectory() == null) {
            this.useraccountdirectory = new UserAccountDirectory();
            ecosystem.setUserAccountDirectory(useraccountdirectory);
        } else {
            this.useraccountdirectory = ecosystem.getUserAccountDirectory();

        }
        
        
        String orderpicked;
        String orderDelivered;
        
//        ArrayList<UserAccount> usrl = useraccountdirectory.getUserAccountList();
//        ArrayList<DeliveryAgent> delList = enterprise.getDeliveryAgentsInEnterpiselist();
//        
        this.delmn = account;
       // jLabel_DelMan.setText(delmn.getEmployee().getName());
        
        System.out.println("CAME INTO DELIVERY AGENT PANEL");
        this.dtm = (DefaultTableModel) DeliveryOrderTable.getModel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        DeliveryOrderTable = new javax.swing.JTable();
        orderPicked_btn = new javax.swing.JButton();
        orderDelivered_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_DelMan1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DeliveryOrderTable.setBackground(new java.awt.Color(204, 255, 204));
        DeliveryOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Order ID", "Product", "Name", "Zipcode", "Payment", "Delivery Status"
            }
        ));
        jScrollPane1.setViewportView(DeliveryOrderTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 550, 309));

        orderPicked_btn.setText("Order Picked");
        orderPicked_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderPicked_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderPicked_btnMouseEntered(evt);
            }
        });
        orderPicked_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderPicked_btnActionPerformed(evt);
            }
        });
        jPanel1.add(orderPicked_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 142, 44));

        orderDelivered_btn.setText("Order Delivered");
        orderDelivered_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDelivered_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                orderDelivered_btnMouseEntered(evt);
            }
        });
        orderDelivered_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDelivered_btnActionPerformed(evt);
            }
        });
        jPanel1.add(orderDelivered_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 520, -1, 44));

        jPanel3.setBackground(new java.awt.Color(63, 130, 117));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Welcome:");

        jLabel_DelMan1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel_DelMan1.setText("<name>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(589, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel_DelMan1)
                .addGap(631, 631, 631))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_DelMan1))
                .addGap(31, 31, 31))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 1470, 120));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon("/Users/pannaga/Desktop/AED/home-delivery-service-3897224-3243194.png")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1470, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 6277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 3296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void orderPicked_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderPicked_btnActionPerformed
        // TODO add your handling code here:
        
        
        
                Date d = new Date();
                SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
               // txtupdatedcat.setText(sdt.format(d));     
        String status = "Order Picked";
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
          del = this.enterprise.getDeliveryAgentsInEnterpiselist();
        // ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

             System.out.println("Inside table");
            
            
                for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> p = new ArrayList<>();
                for (int i = 0; i < oi.size(); i++) {
                    
                    p.add(oi.get(i).getProductName());
                }
                if("ACCEPTED".equals(o.getStatus())){
                
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                     o.getOrderId(),
                     Arrays.toString(p.toArray()),
                    cust.getName(),
                    cust.getZipcode(),
                    o.getOrderPayment().getStatus(),
                    status  
                });
                
//             for(DeliveryAgent dd : del ){
//         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
//           // z.add(dd.getZipcodes().get(j));
//              z = dd.getZipcodes();
//              for(int j =0; j< dd.getZipcodes().size(); j++){
//              if(cust.getZipcode() == z.get(j) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
//                 deliverycmb.addItem(dd.getUseraccount().getEmployee().getName());
//                }
//                }
//                }//closing delivery agent assignment
               }
               }//closing if statement
            }
                
               System.out.println("Done with order pick up table");
   
              JOptionPane.showMessageDialog(null, "Delivery agent picked up the order " + sdt.format(d));
        
        
    }//GEN-LAST:event_orderPicked_btnActionPerformed

    private void orderDelivered_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDelivered_btnActionPerformed
        // TODO add your handling code here:
         Date d = new Date();
         SimpleDateFormat sdt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         String status = "Order Delivered";
        System.out.println("Inside populate Table");
        dtm.setRowCount(0);
      
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
          del = this.enterprise.getDeliveryAgentsInEnterpiselist();
        // ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

             System.out.println("Inside table");
            
            
                for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> pi = new ArrayList<>();
                for (int i = 0; i < oi.size(); i++) {
                    
                    pi.add(oi.get(i).getProductName());
                }
               
        
        int dialogueb = JOptionPane.INFORMATION_MESSAGE;
        System.out.println(""+dialogueb);
        int dialoguer = JOptionPane.showConfirmDialog(this, "Confirm Delivery?\n"
                + "If yes please wait","CUSTOMER NOTIFICATION IN PROCESS", dialogueb);
        if(dialoguer == 0){
             if("ACCEPTED".equals(o.getStatus()) && o.getDeliveryAgent().getUseraccount().getUsername() == delmn.getUsername() ){
                if( o.getOrderPayment().getStatus() == "NOT PAID"){
                    Payment odpayment = new Payment();
                    o.setOrderPayment(odpayment);
                    odpayment.setStatus("AMOUNT COLLECTED");
                }
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                     o.getOrderId(),
                     Arrays.toString(pi.toArray()),
                    cust.getName(),
                    cust.getZipcode(),
                    o.getOrderPayment().getStatus(),
                    status  
                });
         String recipients = cust.getEmail();
         System.out.println("Entering assign for email ==========");
         String subjects = "Order Delivered";
         String messaget = "Delivered agent delivered order successfully";
        
        
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
            JOptionPane.showMessageDialog(null, "Delivery agent delivered the order" + sdt.format(d));

        } catch (MessagingException e) {
            System.out.println("e="+e);
            e.printStackTrace();
            throw new RuntimeException(e);

        }
        
    JOptionPane.showMessageDialog(null, "Email sent to customer successful at "+ sdt.format(d)); 
               }else{
            JOptionPane.showMessageDialog(null, "Email sent to customer cancelled "); 
        }
               }
          }
       }
    }//GEN-LAST:event_orderDelivered_btnActionPerformed

    private void orderPicked_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPicked_btnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_orderPicked_btnMouseClicked

    private void orderPicked_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderPicked_btnMouseEntered
        // TODO add your handling code here:
        orderPicked_btn.setBackground(new Color(253,252,249));
    }//GEN-LAST:event_orderPicked_btnMouseEntered

    private void orderDelivered_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDelivered_btnMouseEntered
        // TODO add your handling code here:
        orderDelivered_btn.setBackground(new Color(253,252,249));
    }//GEN-LAST:event_orderDelivered_btnMouseEntered

    private void orderDelivered_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDelivered_btnMouseClicked
        // TODO add your handling code here:
      //  orderDelivered_btn.setBackground(new Color(205,60,180));
    }//GEN-LAST:event_orderDelivered_btnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DeliveryOrderTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_DelMan;
    private javax.swing.JLabel jLabel_DelMan1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton orderDelivered_btn;
    private javax.swing.JButton orderPicked_btn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        String status = "";
        System.out.println("Inside populate Table Delivery");
        dtm.setRowCount(0);
         ArrayList<Customer> customerdir = this.network.getCustomerDirectory().getCustomerList();
          del = this.enterprise.getDeliveryAgentsInEnterpiselist();
        // ArrayList<OrderItem> cartOrder = this.customer.getCustomerCart().getCartItems();

            // System.out.println("Inside table");
            
            
                for(Customer cust: customerdir){
                    for (Order o : cust.getOrderlist()) {
                    ArrayList<OrderItem> oi = o.getItemsOrdered();
                    ArrayList<String> p = new ArrayList<>();
                for (int i = 0; i < oi.size(); i++) {
                    
                    p.add(oi.get(i).getProductName());
                }
               if("ACCEPTED".equals(o.getStatus()) && o.getDeliveryAgent().getUseraccount().getUsername() == delmn.getUsername()){
                    System.out.println(" "+ delmn.getUsername());
                //&& o.getDeliveryAgent().getUseraccount().getUsername() == account.getUsername()
                dtm.insertRow(dtm.getRowCount(), new Object[]{
                     o.getOrderId(),
                    Arrays.toString(p.toArray()),
                    cust.getName(),
                    cust.getZipcode(),
                    o.getOrderPayment().getStatus(),
                    status  
                });
                
//             for(DeliveryAgent dd : del ){
//         //   for(int j =0; j < dd.getZipcodes().get(j); j++ )
//           // z.add(dd.getZipcodes().get(j));
//              z = dd.getZipcodes();
//              for(int j =0; j< dd.getZipcodes().size(); j++){
//              if(cust.getZipcode() == z.get(j) && orderscmb.getSelectedItem().toString().equals(String.valueOf(o.getOrderId()))){
//                 deliverycmb.addItem(dd.getUseraccount().getEmployee().getName());
//                }
//                }
//                }//closing delivery agent assignment
                     
            }
             }
               }//closing if statement
                
      System.out.println("Done with populate table");
            }
                
             
}
    

