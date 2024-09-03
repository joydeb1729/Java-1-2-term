/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaLabDay2;

/**
 *
 * @author Durjay
 */

public class TestPoint {
    
    public static void main(String[] args){
        Point p1= new Point(1,2);
        Point p2= new Point(4,-7);
        
        System.out.println("For P1: " + p1);
        System.out.println("For P2: " + p2);
        
        double d=p1.distance(p2);
        System.out.println("Distance between p1 and p2: " + d);
    }
    
}
