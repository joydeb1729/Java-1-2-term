/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no1;

/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args){
        
        Die d1 = new Die(6);
        Die d2= new Die(6);
        int count=0;
        
        for(int i=0; i<10; i++){
            d1.roll();
            d2.roll();
            if(d1.getNumFace()==d2.getFaceValue()){
                count++;
            }
        }
        System.out.println("No. of SnakeEyes: " + count );
    }
}
