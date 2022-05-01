/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author vrushankhiremath
 */
public class Course {
    
    private String Course_name;
    private String Course_num;
    private String department;
    private String description;
   


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCourse_num() {
        return Course_num;
    }

    public void setCourse_name(String Course_name) {
        this.Course_name = Course_name;
    }

    
    public String getCourse_name() {
        return Course_name;
    }
     public void setCourse_num(String Course_num) {
        this.Course_num = Course_num;
    }

    @Override
    public String toString() {
        return Course_name;
    }
    
}
