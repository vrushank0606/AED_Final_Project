/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProfessorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author sumana
 */
public class ProfessorOrganization extends Organization {

    public ProfessorOrganization() {
        super(Organization.Type.Professor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ProfessorRole());
        return roles;
    }
    
}
