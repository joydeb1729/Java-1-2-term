package JavaLabDay1;

/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class Die_3_Test {
  
  static Random rand = new Random();
  
  
  public static void main(String[] args) {
    
    Die die1, die2;
    int sum;
    
    die1 = new Die(7);
    die2 = new Die(34);
    
    die1.roll();
    die2.roll();
    System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
    
    die1.roll();
    die2.setFaceValue(4);
    System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
    
    sum = die1.getFaceValue() + die2.getFaceValue();
    System.out.println ("Sum: " + sum);
    
    die1.roll();
    die2.roll();
    sum = die1.getFaceValue() + die2.getFaceValue();
    System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
    System.out.println ("New sum: " + sum);
  }
  
}
