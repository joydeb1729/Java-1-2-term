/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaLabDay2;

/**
 *
 * @author Durjay
 */
import java.lang.Math;

public class Point {
    private int x;
    private int y;
    
    Point(int X, int Y){
        this.x=X;
        this.y=Y;
    }
    public void setX(int X){
        this.x=X;
    }
    public void setY(int Y){
        this.y=Y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
    public double distance(Point p){
        double x1=(double)p.x;
        double y1=(double)p.y;
        double x2=(double)x;
        double y2=(double)y;
        
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
        
    }
    
   public String toString(){
       return "the value of X is " + x +", the value of Y is " + y;
   }
}
