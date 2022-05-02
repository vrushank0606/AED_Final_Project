/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vrushankhiremath
 */
public class CourseDirectory {
     private List<Course> courseDirectory = new ArrayList<>();

    public List<Course> getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(List<Course> courseDirectory) {
        this.courseDirectory = courseDirectory;
    }
   

    public Course addNewCourse() {
        Course NewCourse = new Course();
        courseDirectory.add(NewCourse);
        return NewCourse;
    }

    public void deletePerson(Course course) {
        courseDirectory.remove(course);
    }

   
    
    
}
