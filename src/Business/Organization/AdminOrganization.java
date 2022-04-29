/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
/**
 *
 * @author vrushank
 */
import Business.Role.EnterpriseAdminRole;
import Business.Role.Role;
import java.util.ArrayList;


public class AdminOrganization extends Organization{

    public AdminOrganization() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EnterpriseAdminRole());
        return roles;
    }
     
}
