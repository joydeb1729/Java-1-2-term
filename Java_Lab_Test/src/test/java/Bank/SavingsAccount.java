/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Durjay
 */
public class SavingsAccount extends BankAccount{
    
    private double interestRate;
    SavingsAccount(int num, String name, double balance, double rate){
        super(num,name,balance);
        this.interestRate=rate;
    }
    
    public double getInterest(){
        return (this.balance * this.interestRate)/100;
    }
}
