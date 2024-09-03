/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resizable;

/**
 *
 * @author Durjay
 */
public class Rectangle implements Resizable{
    private double length;
    private double width;
    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public void resize(double factor){
        this.length=length*factor;
        this.width=width*factor;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
}
