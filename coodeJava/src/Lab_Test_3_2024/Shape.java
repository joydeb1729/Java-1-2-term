/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test_3_2024;

/**
 *
 * @author 230234
 */
public abstract class Shape {
    
    public abstract double getArea();
    
    public boolean equals(Shape s){
        
        if(this.getArea()==s.getArea())
            return true;
        else
            return false;
    }
}
