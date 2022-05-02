/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceFinanceOrganization;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InsuranceFinanceRole.InsuranceFinanceWorkAreaJPanel;

/**
 *
 * @author Kavya
 */
public class InsuranceFinanceManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceFinanceWorkAreaJPanel(userProcessContainer, account, (InsuranceFinanceOrganization)organization, enterprise);
    }
    
}