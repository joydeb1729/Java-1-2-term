/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shape;

/**
 *
 * @author Durjay
 */
 public class Circle extends Shape{
    
    public Circle(double radius){
        super(radius);
    }
    
    public double getArea(){
        return (Math.PI*radius*radius);
    }
    public double getPerimeter(){
        return (2*Math.PI*radius);
    }
}
