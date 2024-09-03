/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestSchool;
import java.util.*;

import java.util.ArrayList;

/**
 *
 * @author Durjay
 */
 class School {
    
    ArrayList<Student>schoolStudents = new ArrayList<>();
    ArrayList<Teacher>schoolTeachers = new ArrayList<>();
    ArrayList<SchoolClass>classes=new ArrayList<>();
    
    public School(){
        
    }
    public void addStudent(Student student){
        schoolStudents.add(student);
    }
    public void removeStudent(Student student){
        schoolStudents.remove(student);
    }
    public void addTeacher(Teacher teacher){
        schoolTeachers.add(teacher);
    }
    public void removeTeacher(Teacher teacher){
        schoolTeachers.remove(teacher);
    }
    public void addClass(SchoolClass Class){
        classes.add(Class);
    }
    public void removeClass(SchoolClass Class){
        classes.remove(Class);
    }    
    public ArrayList<Student> getStudents(){
        return schoolStudents;
    }
    public ArrayList<Teacher> getTeachers(){
        return schoolTeachers;
    }
    public ArrayList<SchoolClass> getClasses(){
        return classes;
    }
    
    
}
