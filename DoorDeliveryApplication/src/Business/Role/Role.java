/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Nidhi Raghavendra
 */
public abstract class Role {
    
    public enum RoleType {
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
        private RoleType(String value) {
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system);
}
