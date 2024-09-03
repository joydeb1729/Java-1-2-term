/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread3;

/**
 *
 * @author Durjay
 */
public class Thread2 extends Thread{
    
    public void run(){
        
        for(int i=3; i<=100; i+=3)
        {
            System.out.println(i);
        }
    }
    
}
