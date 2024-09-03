/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

import java.util.*;

/**
 *
 * @author Durjay
 */
public class exp {
    public static void main(String[] args){
        
        Scanner sc= new Scanner (System.in);
        
        try{
            
            String val=sc.next();
            int district=Integer.parseInt(val);
        }
        catch(NumberFormatException ex){
           System.out.println("Get out");
        }
        catch(Exception ex){
            System.out.println("Whatever!");
        }
    }
}
