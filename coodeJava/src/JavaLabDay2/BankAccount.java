/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaLabDay2;

/**
 *
 * @author Durjay
 */
import java.text.NumberFormat;

class BAccount{
    private int accNumber;
    private String name;
    private double balance;
    
    public BAccount(int id){
        
        this.accNumber=id;
    }
    public void setName(String Name)
    {
        this.name=Name;
    }
    public String getName()
    {
        return name;
    }
    public void setBalance(double Balance)
    {
        this.balance=Balance;
    }
    public double getBalance()
    {
        return balance;
    }
    
    public String toString(){
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        return "Name: " + name + "\n" + "Account Number: " + accNumber + "\n" + "Balance: " + fmt.format(balance);
    }
}



public class BankAccount {
    public static void main(String[] args)
    {
        BAccount T = new BAccount(1);
        T.setName("Durjay");
        T.setBalance(214580.00);
        
        System.out.println(T);
    }
    
}
