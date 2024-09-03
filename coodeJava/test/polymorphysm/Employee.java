/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphysm;

/**
 *
 * @author Durjay
 */
    public class Employee extends StaffMember {
    protected String SSN;
    protected double rate;
    public Employee(String name, String address, String phoneNumber, String SSN, double rate){
        super(name, address,phoneNumber);
        this.SSN=SSN;
        this.rate=rate;
    }
    @Override
    public double pay(){
        return rate;
    }
    public String toString(){
        String result=super.toString();
        result+="\nSSN: "+SSN;
        
        return result;
    }
    
}
