/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test_3_2024;

/**
 *
 * @author 230234
 */
public class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return 3.14*radius;
    }
    public String toString(){
        return "Circle{Radius: "+radius+"}";
    }
}
