/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test2_2024;

/**
 *
 * @author 
 */
public class Flower {
    protected String name;
    protected String color;
    public Flower(){
        this.name="Unknown Flower ";
        this.color="Unknown";
    }
    public Flower(String name, String color){
        this.name=name;
        this.color=color;
    }
    public String toString(){
        return this.name +"{color = "+this.color + "}";
    }
            
}
