/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryAgent.DeliveryAgent;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.Role.EnterpriseAdminRole;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import Business.Enterprise.Role.VaccinationEnterpriseRole;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.DeliveryAgentRole;
import Business.Role.DoctorRole;
import Business.Role.PharmacistRole;
import Business.Role.SystemAdminRole;
import Business.Role.VaccinatorRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class ConfigureASystem {

    public static Ecosystem configure() {

        Ecosystem system = Ecosystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        Network n = system.createNetwork();
        n.setNetworkName("California");

//        CREATE MUTLIPLE CUSTOMERS AND PEOPLE 
        for (int i = 1; i < 10; i++) {
            String name = "Customer" + String.valueOf(i);
            String username = "customer" + String.valueOf(i);
            String password = "customer" + String.valueOf(i);

            CustomerDirectory cdri = n.getCustomerDirectory();
            Customer myCustomer = cdri.createCustomer(name, "n@gmail.com", username, password, 2120 + i, "", "addd", 1234567890);
        }

        Employee enterpriseEmployeeAdmin = system.getEmployeeDirectory().createEmployee("enterpriseadmin");
        UserAccount ua2 = system.getUserAccountDirectory().createEnterpriseUser("enterpriseadmin", "enterpriseadmin", enterpriseEmployeeAdmin, new EnterpriseAdminRole());

//        ONE ENTERPRISE
        EnterpriseDirectory edir = new EnterpriseDirectory();
        Enterprise e = edir.createEnterprise(Enterprise.EnterpriseType.Pharmaceutical, "Pharmaceutical", "California");

//        CREATE ENTERPRISE USER ADMINS FOR 2 ENTERPRISES
        Employee pharmaEntemp = new Employee();
        pharmaEntemp.setName("PHARMA ENTERPRISE ADMIN");
        e.getEnterpriseUserAccountDirectory().createEnterpriseUser("pharmaEnterprise", "pharmaEnterprise", pharmaEntemp, new PharmaceuticalEnterpriseAdminRole());
        
//        create delivery agents in enterprise
        ArrayList<DeliveryAgent> delList = new ArrayList<>();
        ArrayList<Integer> z1 = new ArrayList<>();
        ArrayList<Integer> z2 = new ArrayList<>();
        for (int j = 1; j < 10; j++) {
            DeliveryAgent d = new DeliveryAgent();
            z1.add(2120 + j);

            if (j < 5) {
                Employee em = new Employee();
                em.setName("Delivery Man " + String.valueOf(j));
                UserAccount u = d.getUseraccount();
                u.setUsername("delivery" + String.valueOf(j));
                u.setPassword("delivery" + String.valueOf(j));
                u.setRole(new DeliveryAgentRole());
                u.setEmployee(em);
                d.setUseraccount(u);
                d.setZipcodes(z1);
                d.setEnterprisename(e);

            } else {
                z2.add(2120 + j);
                Employee em = new Employee();
                em.setName("Delivery Man " + String.valueOf(j));
                UserAccount u = d.getUseraccount();
                u.setUsername("delivery" + String.valueOf(j));
                u.setPassword("delivery" + String.valueOf(j));
                u.setRole(new DeliveryAgentRole());
                u.setEmployee(em);
                d.setZipcodes(z2);
                d.setEnterprisename(e);
            }
        }

//        create users on enterprise level
        OrganizationDirectory o = e.getOrganizationDirectory();

        Organization org = o.createOrganization(Organization.Type.Doctor, "Doctor Associate", "California state", 2120);
//        orgList.add(o.createOrganization(Type.Pharmacist, "Pharmacy Org in Pharmaceuitical", "California city", 0));
        Organization org2 = o.createOrganization(Organization.Type.Pharmacist, "Pharmacy", "California city", 0);

        System.out.println(org.getSupportedRole());
        ArrayList<Organization> orgList = o.getOrganizationList();
//        System.out.println("ORG LIST SIZE " + orgList.size());

//        ArrayList<Enterprise> eList = edir.getEnterpriseList();
//        edir.setEnterpriseList(eList);
        System.out.println("ORGANIZATIONS UNDER PHARMA E ---- " + orgList.size());
        Employee emp = org.getEmployeeDirectory().createEmployee("Nidhi Raghavendra");

        org.getUserAccountDirectory().createUserAccount("nidhi", "nidhi", emp, new DoctorRole());
//        THE DOCTOR ORG DOES NOT HAVE PRODUCTS

        Employee emp1 = org.getEmployeeDirectory().createEmployee("Pannaga Veeramohan");
        org2.getUserAccountDirectory().createUserAccount("pannaga ", "pannaga", emp1, new PharmacistRole());
        
        String[] drugs = { "Brufen", "Paracetamol", "Pan D", "Crocin" };
        for(String s1: drugs) {
            org2.addProduct(s1, 7.5, 500);
        }

        n.setEnterpriseDirectory(edir);

//      TWO ENTERPRISE 
        Enterprise e2 = edir.createEnterprise(Enterprise.EnterpriseType.Vaccination, "Immunization & Vaccination", "California");
        
        Employee vaccineEntAdmin = new Employee();
        vaccineEntAdmin.setName("VACCINE AND IMMUNIZATION ENTERPRISE ADMIN");
        e2.getEnterpriseUserAccountDirectory().createEnterpriseUser("enterprisevaccine", "enterprisevaccine", vaccineEntAdmin, new VaccinationEnterpriseRole());
        OrganizationDirectory o2 = e2.getOrganizationDirectory();

//        create orgs under Vaccine enterprise
        Organization org1 = o2.createOrganization(Organization.Type.PharmaOrgAdmin, "Immunization", "California", 02220);
        Employee emp2 = org.getEmployeeDirectory().createEmployee("Vachana B");

        org1.getUserAccountDirectory().createUserAccount("vachana", "vachana", emp2, new VaccinatorRole());

        System.out.println(org1.getUserAccountDirectory().getUserAccountList().size() + " THIS SHOULD BE ");

        String[] vaccineProducts = {"Moderna", "J&J", "Hepatitis B", "Pfizer", "Meningococcal"};
        for (String s : vaccineProducts) {
            org1.addProduct(s, 10.0, 200);
            
        }

        n.setEnterpriseDirectory(edir);
        
        
        for (Network net : system.getNetworks()) {
           // System.out.println(system.getNetworks());
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(ent.getEnterpriseType());
                System.out.println(ent.getOrganizationDirectory().getOrganizationList().size());

//                if (ent.getEnterpriseType().toString().equals("Vaccine and Immunization")) {
//                    traverse only through this

                for (Organization or : ent.getOrganizationDirectory().getOrganizationList()) {
                    System.out.println(or.getName() + " *** ");

                }

//                }

            }
        }

        
//        PRINT CUSTOMER ORDERS for that enterprise


        return system;
    }
}
