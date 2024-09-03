/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author Durjay
 */
import java.util.*;

public class Exceptions {
    
    public static void main(String[]args){
       
        Scanner sc=new Scanner(System.in);
        
        try{
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
        
        MyException e1=new MyException(name);
        MyException e2=new MyException(id);
        }
        catch(Exception e){
            System.out.println("Exception caught: "+e.getMessage());
        }
        
        
    }
    
}
