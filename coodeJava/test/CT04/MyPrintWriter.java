/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CT04;

/**
 *
 * @author Durjay
 */


import java.io.*;
import java.util.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPrintWriter {

    public static void main(String[] args) throws FileNotFoundException {
        
        PrintWriter outputStream = new PrintWriter ( new FileOutputStream("input.txt"));
        
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<3; i++)
        {
            String line=sc.nextLine();
            outputStream.println(i+1+" "+ line);
        }
        System.out.println("done!");
        
        outputStream.close(); // Close the PrintWriter
        sc.close();
    }

}

