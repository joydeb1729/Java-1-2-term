/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CT04;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Durjay
 */
public class MyBufferReader {
    
    public static void main(String[] args){
        
        try {
            String line=null;
            
            BufferedReader file = new BufferedReader(new FileReader("input.txt"));
            
            line= file.readLine();
            
            while(line!=null);
            {
                line=file.readLine();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
