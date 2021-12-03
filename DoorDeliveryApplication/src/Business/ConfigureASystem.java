/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.Role.PharmaceuticalEnterpriseAdminRole;
import Business.Enterprise.Role.VaccinationEnterpriseRole;
import Business.Network.Network;
import Business.Orders.Order;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
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

        CustomerDirectory cdri = n.getCustomerDirectory();
        Customer myCustomer = cdri.createCustomer("customer 1", "jks", "cus1", "hjj", 0, "calif addr", "addd", 23);

//        ONE ENTERPRISE
        EnterpriseDirectory edir = new EnterpriseDirectory();
        Enterprise e = edir.createEnterprise(Enterprise.EnterpriseType.Pharmaceutical, "Local Pharma Enterprise", "California");

//        create users on enterprise level
        e.getEnterpriseUserAccountDirectory().createEnterpriseUser("ENTERPRISE ADMIN: local pharma NAME", "ENTERPRISE ADMIN: Local pharma PASSWD", employee, new PharmaceuticalEnterpriseAdminRole() );
        
        OrganizationDirectory o = e.getOrganizationDirectory();

        Organization org = o.createOrganization(Organization.Type.Doctor, "Doctor Associate", "California state", 2120);
//        orgList.add(o.createOrganization(Type.Pharmacist, "Pharmacy Org in Pharmaceuitical", "California city", 0));
        Organization org2 = o.createOrganization(Organization.Type.Pharmacist, "Pharmacy Org in Pharmaceuitical", "California city", 0);

        System.out.println(org.getSupportedRole());
        ArrayList<Organization> orgList = o.getOrganizationList();
//        System.out.println("ORG LIST SIZE " + orgList.size());

        ArrayList<Enterprise> eList = edir.getEnterpriseList();
        edir.setEnterpriseList(eList);

        Employee emp = org.getEmployeeDirectory().createEmployee("Doctor Nidhi");

        org.getUserAccountDirectory().createUserAccount("Nidhi", "nidhi", emp, org.getSupportedRole().get(0));
        org.addProduct("Prescription 1");

        org2.getUserAccountDirectory().createUserAccount("Pharmacist Pannaga ", "pannaga", emp, org2.getSupportedRole().get(0));
        org2.addProduct("Drug 1");

        n.setEnterpriseDirectory(edir);

//      TWO ENTERPRISE 
        Enterprise e2 = edir.createEnterprise(Enterprise.EnterpriseType.Vaccination, "Vaccine Enterprise", "California");
        e2.getEnterpriseUserAccountDirectory().createEnterpriseUser("VACCINE AND IMMUN ENT ADMIN", "passwd", employee, new VaccinationEnterpriseRole());
        OrganizationDirectory o2 = e2.getOrganizationDirectory();

//        create orgs under Vaccine enterprise
        Organization org1 = o2.createOrganization(Organization.Type.PharmaOrgAdmin, "Immunization Org", "California", 02220);
        Employee emp1 = org.getEmployeeDirectory().createEmployee("Vaccinator Vach");
        
        org1.getUserAccountDirectory().createUserAccount("Vachana", "vach", emp1, org.getSupportedRole().get(0));
        
        
        
        System.out.println(org1.getUserAccountDirectory().getUserAccountList().size() + " THIS SHOULD BE ");
        
        org1.addProduct("Covid 19vaccine");

        n.setEnterpriseDirectory(edir);

        for (Network net : system.getNetworks()) {
            for (Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList()) {
                System.out.println(ent.getEnterpriseType());
                System.out.println(ent.getOrganizationDirectory().getOrganizationList().size());
                System.out.println(ent.getEnterpriseUserAccountDirectory().getUserAccountList().get(0).getUsername());
//                if (ent.getEnterpriseType().toString().equals("Vaccine and Immunization")) {
//                    traverse only through this
                    for (Organization or : ent.getOrganizationDirectory().getOrganizationList()) {
                        System.out.println(or.getName() + " *** ");
                        System.out.println(or.getOrganizationProducts().get(0).getName());
                        System.out.println(or.getUserAccountDirectory().getUserAccountList().get(0).getUsername() + "  ****** USER ********");
                        
                        Order order = new Order();
                        order.setName(or.getOrganizationProducts().get(0).getName());
                        
                        myCustomer.addOrder(order);
                    }
//                }

            }
        }
        
//        PRINT CUSTOMER ORDERS for that enterprise

        for(Order od: myCustomer.getOrderlist()) {
            System.out.println(od.getName() + " HIS ORDER ");
        }


        return system;
    }
}