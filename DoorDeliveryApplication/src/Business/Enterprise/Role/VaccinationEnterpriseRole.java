/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.Role;

import Business.Ecosystem;
import static Business.Ecosystem.ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.VaccinationEnterpriseRole.VaccinationEnterpriseWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class VaccinationEnterpriseRole extends EnterpriseRole {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
       return new VaccinationEnterpriseWorkAreaJPanel(userProcessContainer,  account,  enterprise, ecosystem); 
        
    }
}
