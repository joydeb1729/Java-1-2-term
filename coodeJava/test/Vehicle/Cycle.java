/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author Durjay
 */
public class Cycle extends Vehicle {
    public Cycle(String name, int model){
        super(name,model);
    }
    public String getName(){
        return name;
    }
    public int getModel(){
        return model;
    }
}
