package Practice;

/**
 * Account class represents a bank account.
 * 
 * @author Durjay
 */
class Account {
    private String name;
    private String accNumber;
    private double balance;
    
    public Account(String name, String accNumber, double balance){
        this.name=name;
        this.accNumber=accNumber;
        this.balance=balance;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAccNumber(String accNumber){
        this.accNumber=accNumber;
    }

    public String getAccNumber(){
        return accNumber;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance+=amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public String getAccountInfo(){
        return "Name: "+name+"\nAccount Number: "+accNumber+"\nBalance: "+balance+"\n";
    }
}
