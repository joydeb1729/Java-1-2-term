/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cube;

/**
 *
 * @author CSE
 */
public class Cube {
    double length;
    double width;
    double height;

    public Cube() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public Cube(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    

    public double getHeight() {
        return height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cube{" + "length=" + length + ", width=" + width + ", height=" + height + '}';
    }
    public double getVolume(){
        return length*width*height;
    }
    public String getV_in_String(){
        return " Volume of the cube is :"+length*width*height;
    }
}
