/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labTest;

/**
 *
 * @author Durjay
 */
public class Lotus extends Plant implements Smell{
    
    private static int lotusCount=0;
    private int leave=0;
    private boolean spreadingSmell=false;
    
    Lotus(String name){
        super(name);
        this.leave=1024;
        lotusCount++;
    }
    
    Lotus(String name, int num){
        super(name);
        this.leave=num;
        lotusCount++;
    }

    @Override
    public void smellOn() {
        this.spreadingSmell=true;
    }
    
    public static int getNumLotuses(){
        return lotusCount;
    }
    
    public String getName(){
        return "Lotus:"+this.name+" has 1024 leaves";
    }
    
    public String toString(){
        String result=this.getName();
        
        if(spreadingSmell){
            result+=" and it is spreading smell";
        }
        else{
            result+=" and it is not spreading smell";
        }
        return result;
    }
    
}
