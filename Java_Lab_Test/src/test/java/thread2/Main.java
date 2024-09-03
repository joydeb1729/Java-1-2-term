/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread2;

/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args){
        
        Thread t= new Thread(new MyRunnable());
        t.start();
    }
}
