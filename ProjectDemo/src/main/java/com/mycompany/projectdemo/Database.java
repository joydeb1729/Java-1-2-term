/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectdemo;
import java.util.*;

/**
 *
 * @author Durjay
 */
public class Database {
    
    
    public ArrayList <Student> studentList;
    public ArrayList <Person> personList;
    
    Database(){
        studentList = new ArrayList <Student>();
        personList = new ArrayList <Person>();
    }
    
    public void addStudent(Student s){
        studentList.add(s);
    }
    public void deleteStudent(Student s){
        studentList.remove(s);
    }
    public void addPerson(Person p){
        personList.add(p);
    }
    public void deletePerson(Person p){
        personList.remove(p);
    }
    
    
    public String getCountMessage(){
        
    }
    
    
}
