/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author Durjay
 */
public class Car extends Vehicle {
    
    
    public Car(String name, int model){
        super(name,model);
    }
    public String getName(){
        return super.toString();
    }
    public int getModel(){
        return model;
    }
}
