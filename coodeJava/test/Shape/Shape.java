/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Durjay
 */
public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    
    protected double radius;
    protected double side1;
    protected double side2;
    protected double side3;
    
    public Shape(double radius){
        this.radius=radius;
    }
    public Shape(double side1, double side2){
        this.side1=side1;
        this.side2=side2;
    }
    public Shape(double side1, double side2, double side3){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    
}
