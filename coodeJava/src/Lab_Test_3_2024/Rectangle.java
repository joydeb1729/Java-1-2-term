/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test_3_2024;

/**
 *
 * @author 230234
 */
public class Rectangle extends Shape {
    
    protected double length;
    protected double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    @Override
    public double getArea(){
        return length*width;
    } 
    public String toString(){
        return "Rectangle{Length: "+length+" Width: "+width+"}";
    }
}
