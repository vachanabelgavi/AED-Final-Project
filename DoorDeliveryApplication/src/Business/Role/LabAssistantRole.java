/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UI.LabSamples.LabAssistantJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Nidhi Raghavendra
 */
public class LabAssistantRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Network network, Organization organization, Enterprise enterprise, Ecosystem business) {
        System.out.println("Calling lab assistant");
        return new LabAssistantJPanel(userProcessContainer, account, business, network, organization, enterprise); 
    } 
}
