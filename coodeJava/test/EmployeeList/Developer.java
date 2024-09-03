/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeList;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Developer extends Employee {
    
    public Developer(String name, double salary, String field){
        super(name,salary,field);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
    public String toString(){
        return name + " is a great " + field + " developer!\n";
    }
}
