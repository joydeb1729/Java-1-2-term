/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaLabDay1;

/**
 *
 * @author Durjay
 */

class FindRoot{
    public double a;
    public double b;
    public double c;
    
    public void setA(double num)
    {
        this.a=num;
    }
    public void setB(double num)
    {
        this.b=num;
    }
    public void setC(double num)
    {
        this.c=num;
    }
    
    public void showRoot()
    {
        double det=((b*b)-(4*a*c));
        
        if(det<0)
            System.out.println("No real root Exists");
        else if(det==0)
            System.out.println("The Root is : ");
    }
    
    
    
}

public class LabDay1 {
    
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }
}
