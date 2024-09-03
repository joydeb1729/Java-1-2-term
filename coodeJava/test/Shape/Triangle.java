/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;
/**
 *
 * @author Durjay
 */
public class Triangle extends Shape {
    
    public Triangle(double side1, double side2, double side3){
        super(side1,side2,side3);
    }
    private double s=(side1+side2+side3)/2;
    
    public double getArea(){
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    public double getPerimeter(){
        return side1+side2+side3;
    }
}
