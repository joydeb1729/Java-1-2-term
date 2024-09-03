import java.util.*;
import java.util.Scanner;
public class ProductCodes {
  
  
  public static void main(String[] args) { 
    Scanner scan = new Scanner (System.in);
    
    String code;
    code = scan.nextLine();
    
    try {
      int zone = code.charAt(9);
      int district = Integer.parseInt(code.substring(3, 7));
    }
    catch (StringIndexOutOfBoundsException exception)
    {
      System.out.println ("Improper code length: " + code);
    }
    catch (NumberFormatException exception)
    {
      System.out.println ("District is not numeric: " + code);
    }
    
    
  }
  
  
  
}
