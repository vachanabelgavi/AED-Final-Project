package Business.Network;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Enterprise.EnterpriseDirectory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public class Network {
    private String networkName;
//    Customers 
    private CustomerDirectory customerDirectory;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network() {
        this.enterpriseDirectory = new EnterpriseDirectory();
        this.customerDirectory = new CustomerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }
    
    private Customer checkCustomerInNetwork(String name) {
        for(Customer cust: customerDirectory.getCustomerList()) {
            if(cust.getUsername().equals(name)) {
                return cust;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        return networkName;        
    }
    
}
