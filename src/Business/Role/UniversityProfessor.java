/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.ProfessorOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.UniversityProfessorRole.ProfessorWorkAreaJPanel;

/**
 *
 * @author rakesh
 */
public class UniversityProfessor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ProfessorWorkAreaJPanel(userProcessContainer, userAccount, (ProfessorOrganization)organization, enterprise);
    }
    
}
