/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cube;

/**
 *
 * @author CSE
 */
public class Main_Cube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cube c1 = new Cube(3.5,4.5,7);
       Cube c2 = new Cube();
       System.out.println(c1+" Volume of the cube is :"+c1.getVolume());
       System.out.println(c2+c2.getV_in_String());
    }
    
}
