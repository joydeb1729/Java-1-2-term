/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Durjay
 */
public class Rectangle extends Shape {
    
    public Rectangle(double side1, double side2){
        super(side1,side2);
    }
    public double getArea(){
        return side1*side2;
    }
    public double getPerimeter(){
        return 2*(side1+side2);
    }
}
