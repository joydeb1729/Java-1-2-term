/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

/**
 *
 * @author Durjay
 */
public class Rectangle extends Shape {
    
    private double length;
    private double width;
    
    Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    
    @Override
    public void Print_Area(){
       System.out.println("Area: " + length* width);
    }
}
