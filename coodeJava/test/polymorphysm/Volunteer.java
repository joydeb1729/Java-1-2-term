/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphysm;

/**
 *
 * @author Durjay
 */
    public class Volunteer extends StaffMember {
    private double rate=0.0;
    public Volunteer(String name, String address, String phoneNumber){
        super(name,address,phoneNumber);
    }
    @Override
    public double pay(){
        return rate;
    }
    public String toString(){
        return super.toString();
    }
}
