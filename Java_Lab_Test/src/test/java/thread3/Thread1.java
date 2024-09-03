/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread3;

/**
 *
 * @author Durjay
 */
public class Thread1 extends Thread {
    
    public void run(){
        for(int i=1; i<=100; i+=2)
        {
            System.out.println(i);
        }
    }
}
