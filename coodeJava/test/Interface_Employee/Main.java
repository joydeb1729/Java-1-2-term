/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Employee;

/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 60000);
        Developer developer = new Developer("Alice", 70000);
        
        //print with toStrings
        System.out.println(manager);
        System.out.println(developer);
        
        //print with methods
        System.out.println("Manager: " + manager.getName() + ", Salary: $" + manager.getSalary());
        System.out.println("Manager Bonus: $" + manager.calculateBonus());
        
        System.out.println("\nDeveloper: " + developer.getName() + ", Salary: $" + developer.getSalary());
        System.out.println("Developer Bonus: $" + developer.calculateBonus());
    }
}

