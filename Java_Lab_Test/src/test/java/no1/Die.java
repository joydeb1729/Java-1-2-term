/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no1;

/**
 *
 * @author Durjay
 */
public class Die {
    
    private int numFace;
    private int faceValue;
    
    public Die(int numFace){
        this.numFace=numFace;
        roll();
    }
    
    public void roll(){
        faceValue = (int) (Math.random()*numFace) + 1;
    }
    
    public void setFaceValue(int faceValue){
        if(this.numFace<=faceValue){
            this.faceValue=faceValue;
        }
    }
    public int getFaceValue(){
        return this.faceValue;
    }
    public int getNumFace(){
        return this.numFace;
    }
    
    public String toString(){
        return "Numface: "+this.numFace+"\nFace Value: " + this.faceValue+ "\n" ;
    }
    
}
