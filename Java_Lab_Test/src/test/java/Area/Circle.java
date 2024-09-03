/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

/**
 *
 * @author Durjay
 */
public class Circle extends Shape {
    
    
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }

    @Override
    public void Print_Area() {
       System.out.println("Area: " + Math.PI*radius*radius);
    }
    
}
