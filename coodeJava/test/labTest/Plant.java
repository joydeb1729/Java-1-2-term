/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labTest;

/**
 *
 * @author Durjay
 */
public class Plant {
    
    protected String name;
    private static int plantCount=0;
    
    
    Plant(String name){
        this.name=name;
        plantCount++;
    }
    
    public static int getNumPlants(){
        return plantCount;
    }
    
    
    @Override
    public String toString(){
        return this.name+" is a plant";
    }
    
}
