/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comparing;

/**
 *
 * @author Durjay
 */
public class Pipe implements Comparable{
 
    private int number;
    private double diameter;
    
    Pipe(int num, double diameter){
        this.number=num;
        this.diameter=diameter;
    }
    
    public int getNumber(){
        return this.number;
    }
    public double getDiameter(){
        return this.diameter;
    }
    
    @Override
    public int compareTo(Object o){
        
        Pipe p = (Pipe)o;
        
        if(this.getNumber()>p.getNumber())
            return 1;
        if(this.getNumber()<p.getNumber())
            return -1;
        else
            return 0;
    }

    public String toString(){
        return "Pipe Number: "+this.number+"\nPipe Diameter: "+this.diameter;
    }
    
    
}
