/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Course.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vrushankhiremath
 */
public class CourseDirectory {
//     private List<Course> courseDirectory = new ArrayList<>();
     private List<Course> courses = new ArrayList<>();

    public List<Course> getCourseDirectory() {
        return courses;
    }
    
     public List<Course> getCourses() {
        return courses;
    }

      public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
      
    public void setCourseDirectory(List<Course> courses) {
        this.courses = courses;
    }
   

    public Course addNewCourse(Course course) {
        courses.add(course);
        return course;
    }

    public void deleteCourse(Course course) {
        courses.remove(course);
    }

    /*public ArrayList<Course> searchPatient(String key)
    {
        ArrayList<Person> searchPatientDirectory = new ArrayList();
        for(Person person: personDirectory)
        {
            if(person.toString().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }*/
    
    
}
