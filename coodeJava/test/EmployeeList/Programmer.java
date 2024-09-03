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
public class Programmer extends Employee {
    
    public Programmer(String name, double salary, String field){
        super(name,salary,field);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    } 
    public String toString(){
        return name + " is a fantastic " + field + " programmer!\n";
    }
}
