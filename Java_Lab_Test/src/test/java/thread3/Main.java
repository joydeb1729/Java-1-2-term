/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread3;

/**
 *
 * @author Durjay
 */
public class Main {
    
    public static void main(String[] args){
        Thread t1= new Thread1();
        Thread t2=new Thread2();
        
        t1.start();
        t2.start();
    }
}
