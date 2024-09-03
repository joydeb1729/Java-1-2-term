/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphysm;

/**
 *
 * @author Durjay
 */
    public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phoneNumber;
    
    
    
    public StaffMember(String name, String address, String phoneNo){
        this.name=name;
        this.address=address;
        this.phoneNumber=phoneNo;
    }
    
    public abstract double pay();
    
    
    public String toString(){
        return "Name: "+name+"\nAddress: "+address+"\nPhone Number: "+phoneNumber;
    }
}
