/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeList;

/**
 *
 * @author Durjay
 */
public class Employee {
    
    protected String name;
    protected double salary;
    protected int totalMember;
    protected String field;
    
    public Employee(String name, double salary, int totalMember){
        this.name=name;
        this.salary=salary;
        this.totalMember=totalMember;
    }
    public Employee(String name, double salary, String field){
        this.name=name;
        this.salary=salary;
        this.field=field;
    }
    
    public String toString(){
        return name + " is an Employee of Durjay's Company";
    }
    
}
