/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Area;

/**
 *
 * @author Durjay
 */
public class Triangle extends Shape {
    
    private double height;
    private double base;
    
    Triangle(double height, double base){
        this.height=height;
        this.base=base;
    }
    
    @Override
    public void Print_Area(){
       System.out.println("Area: " + (base* height)/2);
    }
}
