/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphysm;

/**
 *
 * @author Durjay
 */
    public class Executive extends Employee {
    
    private double bonus;
    public Executive(String name, String address, String phoneNumber, String SSN, double rate){
        super(name, address, phoneNumber, SSN, rate);
        bonus=0.0;
    }
    public void awardBonus(double award){
        bonus+=award;
    }
    public double pay(){
        return bonus;
    }
}
