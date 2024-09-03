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
//Main.java
public class Main {
    public static void main(String[] args) {
        Manager durjay = new Manager("Durjay", 80000.0, 6);
        Developer kazi = new Developer("kazi", 72000.0, "Linux");
        Developer tariq = new Developer("Tariq", 72000.0, "Web");
        Developer sadiq = new Developer("Sadiq", 72000.0, "Windows");
        Programmer turjo = new Programmer("Turjo", 76000.0, "C++");
        Programmer seam = new Programmer("Seam", 76000.0, "Python");
        Programmer munna = new Programmer("Munna", 76000.0, "c#");
        
        durjay.addDeveloper(kazi);
        durjay.addDeveloper(tariq);
        durjay.addDeveloper(sadiq);
        durjay.addProgrammer(turjo);
        durjay.addProgrammer(seam);
        durjay.addProgrammer(munna);
        
        ArrayList<Programmer>programmers=durjay.getProgrammerList();
        ArrayList<Developer>developers=durjay.getDeveloperList();
        
        System.out.println(durjay);
        System.out.print("Here are the developers: ");
        for(Developer dev:developers){
            System.out.print(dev.getName()+" ");
        }
        System.out.println();
        System.out.print("Here are the programmers: ");
        for(Programmer pro:programmers){
            System.out.print(pro.getName()+" ");
        }
        System.out.println();
        System.out.println();
        
        
        System.out.println("After kicking Sadiq & Seam and adding Rahul & Mashrafi in the company");
        durjay.removeProgrammer(seam);
        durjay.addProgrammer(new Programmer("Mashrafi", 76000.0, "Python"));
        durjay.removeDevepeloper(sadiq);
        durjay.addDeveloper(new Developer("Rahul", 72000.0, "Android"));
        programmers=durjay.getProgrammerList();
        developers=durjay.getDeveloperList();
        
        
        System.out.print("New developer list: ");
        for(Developer dev:developers){
            System.out.print(dev.getName()+" ");
        }
        System.out.println();
        System.out.print("New programmer list: ");
        for(Programmer pro:programmers){
            System.out.print(pro.getName()+" ");
        }
        System.out.println();
    }
}

