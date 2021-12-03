package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nidhi Raghavendra
 */
public class Enterprise {
    private String name;
    private String location;
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
 
    
//    An enterprise has Orders
//    An enterprise has its products
//    A customer gives a prescription to the Pharma and Vaccine Enterprises
//    An enterprise has its own payments
//    An enterprise has its own Enterprise Admins
//    An enterprise has its own Delivery Agents
    
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType {
        Pharmaceutical("Pharmaceutical"), MedicalEquipements("Medical Equipements"), LabDiagnostics("Labs and Diagnostics"), Vaccination("Vaccine and Immunization"), BloodBank("Blood bank");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
        return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public Enterprise(EnterpriseType type, String name, String location){
        
        this.enterpriseType = type;
        this.name = name;
        this.location = location;
        this.organizationDirectory=new OrganizationDirectory();
        
    }
}
