/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import java.io.*;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Append {
    public static void main() throws FileNotFoundException, IOException{
        
        Scanner sc = new Scanner(System.in);
        String inputFileName=sc.next();
        String outputFileName=sc.next();
        
        Scanner inputFile= new Scanner(new File(inputFileName));
        PrintWriter outputFile = new PrintWriter(new FileWriter(outputFileName,true));
        
        while(inputFile.hasNext()){
            String line=inputFile.nextLine();
            outputFile.println(line);
        }
        
        inputFile.close();
        outputFile.close();
    }
}
