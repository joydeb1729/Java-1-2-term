/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface_Bank_Account;

/**
 *
 * @author Durjay
 */
public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        CheckingAccount checkingAccount = new CheckingAccount();

        // Deposit and withdraw from savings account
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(500);

        // Deposit and withdraw from checking account
        checkingAccount.deposit(2000);
        checkingAccount.withdraw(100);

        // Display balances
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Checking Account Balance: $" + checkingAccount.getBalance());
    }
}
