/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Bank_Account;

/**
 *
 * @author Durjay
 */
public class CheckingAccount {
    private double balance;
    public CheckingAccount(){
        this.balance=0.0;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getBalance(){
        return this.balance;
    }
}
