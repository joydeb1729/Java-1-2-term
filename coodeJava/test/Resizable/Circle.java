/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resizable;

/**
 *
 * @author Durjay
 */
public class Circle implements Resizable{
    
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public void resize(double factor){
        this.radius=radius*factor;
    }
    public double getRadius(){
        return radius;
    }
}
