/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeanOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeanRole.StudentCaseStudyRequestsJPanel;

/**
 *
 * @author Kavya
 */
public class DeanRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new StudentCaseStudyRequestsJPanel(userProcessContainer, userAccount, (DeanOrganization)organization, enterprise);
    }
    
}
