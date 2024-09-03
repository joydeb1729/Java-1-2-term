/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author Durjay
 */
import java.util.*;
class Bank {
    private ArrayList<Account> accList;
    
    public Bank(){
        accList=new ArrayList<Account>();
    }
    
    public void addAccount(Account acc){
        accList.add(acc);
    }

    public void removeAccount(Account acc){
        accList.remove(acc);
    }

    public void withdraw(Account acc, double amount){
        acc.withdraw(amount);
    }

    public void deposit(Account acc, double amount){
        acc.deposit(amount);
    }

    public ArrayList<Account> getAccountList(){
        return accList;
    }
}