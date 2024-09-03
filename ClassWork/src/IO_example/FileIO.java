package IO_example;

/* demonstrating reading and writing text files
 */


import java.io.*;
import java.util.*;
import java.text.*;

public class FileIO
{
  public static void main(String[] arg)
  {
    try
    {
      BufferedReader inFileStream = 
        new BufferedReader(new FileReader("in.txt"));
      
      String name = null;
      int age = 0;
      float gpa = 0;
      
      String line = inFileStream.readLine();
      while (line != null)
      {
        StringTokenizer parser = 
          new StringTokenizer(line);
        
        // reading name, age, gpa from the line
        name = parser.nextToken();
        age = Integer.parseInt(parser.nextToken());
        gpa = Float.parseFloat(parser.nextToken());
        
        System.out.println(name + ' ' + age);
        line = inFileStream.readLine();
      }
      
      
      inFileStream.close();
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
      System.out.println("in.txt not found");
      System.exit(-1);
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
      System.out.println("Error reading in.txt");
      System.exit(-1);
    }
    
    
    
    try
    {
      PrintWriter outFileStream = 
        new PrintWriter(new FileOutputStream("out.txt"));
      
      outFileStream.println("Hello World");
      outFileStream.println("Good Morning");
      outFileStream.close();
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
      System.out.println("Can't open out.txt");
      System.exit(-1);
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
      System.out.println("Error writing out.txt");
      System.exit(-1);
    }
    
    
    //File outFile = new File("../FileIO/out.txt");
    File outFile = new File("out.txt");
    System.out.println(outFile.exists());
    System.out.println(outFile.length());
    System.out.println(outFile.getName());
    System.out.println(outFile.getPath());
  }
}

