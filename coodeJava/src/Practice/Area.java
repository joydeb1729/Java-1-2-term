/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Durjay
 */

import java.util.Scanner;

class FindArea {
    private int length;
    private int breadth;
    
    public void setDim(int l, int b) {
        this.length=l;
        this.breadth=b;
    }
    public int getArea(){
        return length*breadth;
    }
}

public class Area {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        
        FindArea a=new FindArea();
        a.setDim(length, breadth);
        int area=a.getArea();
        System.out.println("Area " + area);
    }
}
