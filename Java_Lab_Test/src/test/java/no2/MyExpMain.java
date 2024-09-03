/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no2;

/**
 *
 * @author Durjay
 */
public class MyExpMain {
    public static void main(String[] arg){
        
        m1();        
    }
    
    static void m1(){
        try{
            m2();
        }
        catch (MyExp ex){
            ex.printStackTrace();
        }
        
        System.out.println("Done");
    }
    
    static void m2() throws MyExp{
        System.out.println("No Excuse");
    }
}
