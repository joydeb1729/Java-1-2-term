/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author Durjay
 */
public class BankAccount {
    protected int accNumber;
    protected String accHolderName;
    protected double balance;
    
    BankAccount(int num, String name, double balance){
        this.accHolderName=name;
        this.accNumber=num;
        this.balance=balance;
    }
    
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public double getBalance(){
        return this.balance;
    }
    
}
