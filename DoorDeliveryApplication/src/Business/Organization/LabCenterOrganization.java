/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LabAssistantRole;
import Business.Role.LabTesterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Nidhi Raghavendra
 */
public class LabCenterOrganization extends Organization {
    public LabCenterOrganization(String name, String location, int zipcode) {
        super(Organization.Type.LabAssistant.getValue(), name, location, zipcode);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new LabAssistantRole());
        
        return roles;
    }
}
