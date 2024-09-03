/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestSchool;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class SchoolClass {
    
    private String className;
    Teacher classTeacher;
    ArrayList<Student>classStudents = new ArrayList<>();
    
    public SchoolClass(String className, Teacher teacher){
        this.className=className;
        this.classTeacher=teacher;
    }
    public void setClassName(String className){
        this.className=className;
    }
    public String getClassName(){
        return className;
    }
    public void addStudent(Student student){
        classStudents.add(student);
    }
    public void removeStudent(Student student){
        classStudents.remove(student);
    }
    public Teacher getTeacher(){
        return classTeacher;
    }
    public ArrayList<Student> getStudents(){
        return classStudents;
    }
    
}
