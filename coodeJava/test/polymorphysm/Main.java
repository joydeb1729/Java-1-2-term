package polymorphysm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Durjay
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        
        ArrayList<StaffMember> staffList=new ArrayList<>();
        
        staffList.add(new Executive ("Seam", "123 Main Line",
         "555-0469", "123-45-6789", 2423.07));
        staffList.add(new Employee ("Munna", "456 Off Line",
         "555-0101", "987-65-4321", 1246.15));
        staffList.add(new Employee ("Turjoo", "789 Off Rocker",
         "555-0000", "010-20-3040", 1169.23));
        staffList.add(new Hourly ("Saadiq", "678 Fifth Ave.",
         "555-0690", "958-47-3625", 10.55));
        staffList.add(new Volunteer ("Tariq", "987 Suds Blvd.",
         "555-8374"));
        staffList.add(new Volunteer ("Rimon", "321 Duds Lane",
         "555-7282"));
        
        ((Executive)staffList.get(0)).awardBonus (500.00);

        ((Hourly)staffList.get(3)).addHours (40);
        
        for(StaffMember staff: staffList){
            System.out.println(staff);
            double rate=staff.pay();
            if(rate==0){
                System.out.println("THANKS!");
            }
            else{
                System.out.println("Amount: "+rate);
            }
            System.out.println("\n---------------------------\n");
                
        }
    }
}
