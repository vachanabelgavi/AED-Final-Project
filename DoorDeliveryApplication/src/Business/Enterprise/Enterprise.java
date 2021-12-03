package Business.Enterprise;

import Business.Enterprise.Role.EnterpriseAdminRole;
import Business.Enterprise.Role.EnterpriseRole;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.Organization.Organization;
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
    private UserAccountDirectory enterpriseUserAccountDirectory;

//    An enterprise has its own Enterprise Admins
//    An enterprise has its own Delivery Agents : create the Delivery agents in user account directory
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Pharmaceutical("Pharmaceutical"), MedicalEquipements("Medical Equipements"), LabDiagnostics("Labs and Diagnostics"), Vaccination("Vaccine and Immunization"), BloodBank("Blood bank");
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

//    To get a general Enterprise Admin 
    public ArrayList<EnterpriseRole> getSupportedRole() {
        ArrayList<EnterpriseRole> roleList = new ArrayList<EnterpriseRole>();
        roleList.add(new EnterpriseAdminRole());
        return roleList;
    }

    public ArrayList<EnterpriseRole.EnterpriseRoleType> getEnterpriseRoleTypes() {
        return EnterpriseRole.EnterpriseRoleType.allEnterpriseRoles();
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

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public UserAccountDirectory getEnterpriseUserAccountDirectory() {
        return enterpriseUserAccountDirectory;
    }

    public void setEnterpriseUserAccountDirectory(UserAccountDirectory enterpriseUserAccountDirectory) {
        this.enterpriseUserAccountDirectory = enterpriseUserAccountDirectory;
    }

    public Enterprise(EnterpriseType type, String name, String location) {

        this.enterpriseType = type;
        this.name = name;
        this.location = location;
        this.organizationDirectory = new OrganizationDirectory();
        this.enterpriseUserAccountDirectory = new UserAccountDirectory();

    }
}
