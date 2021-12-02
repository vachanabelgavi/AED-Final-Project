/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Products.Product;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Nidhi Raghavendra
 */
public abstract class Organization {

    private String name;
    private String location;
    private int zipcode;
    private int organizationID;

//    directories
//    organization has products
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private ArrayList<Product> productList;

    public enum Type {
        Admin("Organization Administrator"),
        Doctor("Doctor"),
        PharmaOrgAdmin("Pharma Vaccine Administrator"),
        Prescriber("Prescriber"),
        Pharmacist("Pharmacist"),
        EquipmentManager("Equipment Manager"),
        MarketManager("Supermarket Manager"),
        LabAssistant("Lab Assistant"),
        LabTester("Lab Tester"),
        DeliveryAgent("Delivery Agent");
        
        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String type, String name, String location, int zipcode) {
        this.name = name;
        this.location = location;
        this.zipcode = zipcode;
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.organizationID = randomIdGenerator();
        this.productList = new ArrayList<Product>();
    }

    public int randomIdGenerator() {
        Random rand = new Random(System.currentTimeMillis());
        return (((10 + rand.nextInt(2)) * 100 + rand.nextInt(1000)));
    }

    public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public ArrayList<Product> getOrganizationProducts() {
        return this.productList;
    }
    
    public void addProduct(String name) {
        Product prod = new Product();
        prod.setName(name);
        this.productList.add(prod);
    }
}
