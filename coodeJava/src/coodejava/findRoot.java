/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coodejava;

/**
 *
 * @author Durjay
 */

class Root {
    
    public double a;
    public double b;
    public double c;
    
    public double getNum(double x)
    {
        return x;
    }
    public void setA(double x)
    {
        this.a=x;
    }
    public void setB(double x)
    {
        this.b=x;
    }
    public void setC(double x)
    {
        this.c=x;
    }
    
    public void showRoot()
    {
        double det = (b*b)-(4*a*c);

        if(det<0)
        {
            System.out.print("No real root exist!");
        }
        else if(det==0)
        {
            System.out.print("The root is: " + (-b /2.0*a));
        }
        else
        {
            double r1=(-b+Math.sqrt(det))/(2.0*a);
            double r2=(-b-Math.sqrt(det))/(2.0*a);
            System.out.println("The Roots are : " + r1 +" "+r2);
        }
    }
}
public class findRoot {
    public static void main (String[] args)
    {
        Root x= new Root();
        x.setA(1);
        x.setB(2);
        x.setC(-5);
        x.showRoot();
    }
    
}
