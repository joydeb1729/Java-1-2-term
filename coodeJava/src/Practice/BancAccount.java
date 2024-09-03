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
public class BancAccount {
    public static void main(String[] args){

        Account acc1 = new Account("Durjay", "123456", 10000.60);
        Account acc2 = new Account("Joydeb", "345567", 40000.07);
        Account acc3 = new Account("Nobody", "987654", 2770.89);
        

        Bank bank = new Bank();
        ArrayList<Account> accountList = bank.getAccountList();
        //Adding 3 accounts
        bank.addAccount(acc1);
        bank.addAccount(acc2);
        bank.addAccount(acc3);

        System.out.println("After adding all accounts in the Bank: ");
        for(Account acc : accountList){
            System.out.println(acc.getAccountInfo());
        }
        
        //Witdrawing and Depositing using both Account and Bank Class
        acc1.withdraw(1078.98);
        acc2.deposit(598);
        bank.withdraw(acc3, 400.67);
        System.out.println("After doing some operation on the accounts: ");
        for(Account acc : accountList){
            System.out.println(acc.getAccountInfo());
        }
        
        //removing 2nd and 3rd elements
        bank.removeAccount(acc2);
        bank.removeAccount(acc3);
        
        System.out.println("After removing 2nd and 3rd accounts from the Bank: ");
        for(Account acc : accountList){
            System.out.println(acc.getAccountInfo());
        }
    }
}
