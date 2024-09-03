/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args){
        
        ArrayList<StaffMember> staffList=new ArrayList<>();
        
        staffList.add(new Executive ("Sam", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07));
        staffList.add(new Employee ("Carla", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15));
        staffList.add(new Employee ("Woody", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23));
        staffList.add(new Hourly ("Diane", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55));
        staffList.add(new Volunteer ("Norm", "987 Suds Blvd.",
         "555-8374"));
        staffList.add(new Volunteer ("Cliff", "321 Duds Lane",
         "555-7282"));
        
        ((Executive)staffList[0]).awardBonus (500.00);

        ((Hourly)staffList[3]).addHours (40);
        
        Staff personnel = new Staff();

        personnel.payday();
    }
}
