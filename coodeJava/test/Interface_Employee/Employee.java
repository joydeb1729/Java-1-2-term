/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Employee;

/**
 *
 * @author Durjay
 */
public abstract class Employee {
    protected String name;
    protected double salary;
    protected double bonus;
    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    public abstract double calculateBonus();
    public abstract String getName();
    public abstract double getSalary();
    
    public String toString(){
        return this.name+ ", " + "Salary: $" + this.salary;
    }
}
