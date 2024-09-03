/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test_3_2024;

/**
 *
 * @author 230234
 */
public class Square extends Rectangle {
    
    public Square(double side){
        super(side,side);
    }
    public double getArea(){
        return length*width;
    }
    public String toString(){
        return "Square{ Side: "+length+"}";
    }
}
