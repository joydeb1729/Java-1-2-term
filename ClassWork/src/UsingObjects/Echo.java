/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UsingObjects;
import java.util.Scanner;



/**
 *
 * @author csepc
 */
public class Echo {
    //  Reads a character string from the user and prints it.
	public static void main (String[] args) {
      String message;
      Scanner scan = new Scanner (System.in);

      System.out.println ("Enter a line of text:");
      message = scan.nextLine();

      System.out.println ("You entered: \"" + message + "\"");
   }

}
