/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prasannanimbalkar
 */
public class UniversityEnterprise extends Enterprise {

    public UniversityEnterprise(String name) {
        super(name, EnterpriseType.University);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrganizationTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Dean);
        orgTypes.add(Organization.Type.Professor);
        orgTypes.add(Organization.Type.Student);

        return orgTypes;
    }

}
