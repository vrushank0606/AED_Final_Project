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
    
    private String courseName;
    private String courseNumber;
    private String department;
    private String description;
    
    private String medicalPractice;
    private String learningObjective;
    private double requirement;
   

     public Course(String courseNumber) {
        this.courseNumber = courseNumber;
    }

     public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

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

    public String getMedicalPractice() {
        return medicalPractice;
    }

    public void setMedicalPractice(String medicalPractice) {
        this.medicalPractice = medicalPractice;
    }

    public String getLearningObjective() {
        return learningObjective;
    }

    public void setLearningObjective(String learningObjective) {
        this.learningObjective = learningObjective;
    }

    public double getRequirement() {
        return requirement;
    }

    public void setRequirement(double requirement) {
        this.requirement = requirement;
    }
    

    @Override
    public String toString() {
        return courseName;
    }
    
}
