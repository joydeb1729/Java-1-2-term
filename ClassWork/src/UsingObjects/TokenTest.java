package UsingObjects;

/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class TokenTest {
  
 public static void main (String[] args)   {
      int miles;
      double gallons, mpg;

      Scanner scan = new Scanner (System.in);

      System.out.print ("Enter the number of miles: ");
      miles = scan.nextInt();

      System.out.print ("Enter the gallons of fuel used: ");
      gallons = scan.nextDouble();

      mpg = miles / gallons;

      System.out.println ("Miles Per Gallon: " + mpg);
   }

  
}
