/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Student.*;
import Business.Insurance.Insurance;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vrushankhiremath
 */
public class StudentDirectory {
//     private List<Student> courseDirectory = new ArrayList<>();
     private List<Student> students = new ArrayList<>();

    public List<Student> getStudentDirectory() {
        return students;
    }
    
     public List<Student> getStudents() {
        return students;
    }

      public void setStudents(List<Student> students) {
        this.students = students;
    }
      
    public void setStudentDirectory(List<Student> students) {
        this.students = students;
    }
   

    public Student addNewStudent(String studentId) {
        Student NewStudent = new Student(studentId);
        students.add(NewStudent);
        return NewStudent;
    }

    public void deleteStudent(Student student) {
        students.remove(student);
    }

    /*public ArrayList<Student> searchPatient(String key)
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
