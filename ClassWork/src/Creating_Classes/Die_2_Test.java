package Creating_Classes;

/**
 * Auto Generated Java Class.
 */
import java.util.*;

public class Die_2_Test {
  
  static Random rand = new Random();
  
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Input the number of sides of the two dices and Maximum nember of throws: ");
    int side1 = scan.nextInt();
    int side2 = scan.nextInt();
    int numThrow = scan.nextInt();
    System.out.println("Number of snake eyes :"+numSnakeEyes(side1, side2, numThrow));
  }
  
  static int numSnakeEyes(int sides1, int sides2, int numThrows) {
    Die die1 = new Die(sides1);
    Die die2 = new Die(sides2);
    
    int count = 0;
    for(int i = 0; i < numThrows; i++) {
      die1.roll();
      die2.roll();
      if (die1.getFaceValue() == 1 && die2.getFaceValue() == 1 )
        count++;
    }
    
    return count;
  }
  
}
