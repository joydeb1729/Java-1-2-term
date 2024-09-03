package Creating_Classes;

/**
 * Auto Generated Java Class.
 */
public class TestAccount {
  
  
  public static void main(String[] args) { 
    Account a1 = new Account("Ra Shi",1,999.99);
    Account a2 = new Account("Mohi Ma",2,18888999.99);
    Account a3 = new Account("Ri Ti",3, 77777);
    
    a1.deposit(1000);
    a2.withdraw(1000);
    
    System.out.println(a1);
    System.out.println(a2);
    System.out.println(a3);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
