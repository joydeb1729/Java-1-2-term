/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphysm;

/**
 *
 * @author Durjay
 */
    public class Hourly extends Employee {
    private int workHour;
    public Hourly(String name, String address, String phoneNumber, String SSN, double rate){
        super(name, address, phoneNumber, SSN, rate);
        workHour=0;
    }
    public void addHours(int hours){
        workHour+=hours;
    }
    public double pay(){
        return (double)workHour*rate;
    }
}
