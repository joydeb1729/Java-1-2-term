/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_Test_4_2024;

/**
 *
 * @author Durjay
 */
public class Flower {
    protected int petal;
    public Flower(int petal){
        this.petal=petal;
    }
    public void Compare(Flower f){
       if(f.petal>this.petal)
            System.out.println( this.getClass().getSimpleName()+"{"+this.petal+"} has less petals than "+f.getClass().getSimpleName() +"{"+f.petal+ "}");
        else if(f.petal<this.petal)
            System.out.println(this.getClass().getSimpleName()+"{"+this.petal+"} has more petals than "+f.getClass().getSimpleName() +"{"+f.petal+ "}");
        else
            System.out.println(this.getClass().getSimpleName()+"{"+this.petal+"} has equal petals as "+f.getClass().getSimpleName() +"{"+f.petal+ "}");
       
    }
    
}
