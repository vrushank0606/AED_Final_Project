/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Course.CourseDirectory;
import Business.Student.StudentDirectory;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sumana
 */
public class UniversityEnterprise extends Enterprise {
    
     private CourseDirectory courseDirectory;

//    private StudentDirectory studentDirectory;

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

      public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

//    public StudentDirectory getStudentDirectory() {
//        return studentDirectory;
//    }
//
//    public void setStudentDirectory(StudentDirectory studentDirectory) {
//        this.studentDirectory = studentDirectory;
//    }

}
