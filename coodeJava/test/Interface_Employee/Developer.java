/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Employee;

/**
 *
 * @author Durjay
 */
public class Developer extends Employee {

    public Developer(String name, double salary){
        super(name,salary);
        this.bonus=(salary *10)/100;
    }
    public double calculateBonus(){
        return (salary *10)/100;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }
    public String toString(){
        String result="Developer: ";
        result+=super.toString();
        result+="\nDeveloper Bonus: $"+ this.bonus+"\n";
        return result;
    } 
}
