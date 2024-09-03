/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeList;

import java.util.ArrayList;

/**
 *
 * @author Durjay
 */
public class Manager extends Employee{
    
    private static ArrayList<Developer> dev = new ArrayList<>();
    private static ArrayList<Programmer> pro = new ArrayList<>();
    
    public Manager(String name, double salary, int totalMember){
        super(name,salary,totalMember);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    
    public void addDeveloper(Developer newDeveloper){
        dev.add(newDeveloper);
    }
    public void removeDevepeloper(Developer oldDeveloper){
        dev.remove(oldDeveloper);
    }
    public ArrayList<Developer> getDeveloperList(){
        return dev;
    }
    public void addProgrammer(Programmer newProgrammer){
        pro.add(newProgrammer);
    }
    public void removeProgrammer(Programmer oldProgrammer){
        pro.remove(oldProgrammer);
    }
    public ArrayList<Programmer> getProgrammerList(){
        return pro;
    }
    public String toString(){
        return name + " has "+ totalMember +" employee in his company.\n";
    }
    
}
