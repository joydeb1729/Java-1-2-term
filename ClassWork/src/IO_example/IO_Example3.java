package IO_example;

import java.io.*;
import java.util.*;
import java.util.Scanner;
public class IO_Example3 {
  
  public static void main(String[] args)
  {
    String fileName = null; // outside try block, can be used in catch
    try
    { Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter file name:");
      fileName = keyboard.next();
      BufferedReader inputStream =
        new BufferedReader(new FileReader(fileName));
      String line = null;
      line = inputStream.readLine();
      while(line!=null){
        System.out.println(line);
        line = inputStream.readLine();
      }
      inputStream.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File " + fileName + " not found.");
    }
    catch(IOException e)
    {
      System.out.println("Error reading from file " + fileName);
    }  
    
  }
}
