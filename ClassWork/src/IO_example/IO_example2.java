package IO_example;



import java.io.*;
import java.util.Scanner;

public class IO_example2 {
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    PrintWriter outputStream = null;
    try
    {
      System.out.println("A for append or N for new file:");
      char ans = scan.nextLine().charAt(0);
      boolean append = (ans == 'A' || ans == 'a');
      outputStream = new PrintWriter(new FileOutputStream("out.txt", append));
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Error opening the file out.txt. " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Enter three lines of text:");
    String line = null;
    int count;
    for (count = 1; count <= 3; count++)
    {
      line = scan.nextLine();
      outputStream.println(count + " " + line);
    }
    outputStream.close();
    System.out.println("... written to out.txt.");
  }
  
}

