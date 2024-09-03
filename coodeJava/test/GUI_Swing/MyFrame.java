/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Swing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Durjay
 */
public class MyFrame extends JFrame{
    
    public MyFrame(){
        this.setSize(800,700);
        this.setVisible(true);
        //this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Durjay");
        
//        ImageIcon image = new ImageIcon("D:\\javaLab\\logo.png");
//        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(154,147,236));
//        this.getContentPane().setBackground(new Color(0,0,0));
        
        this.setLayout(null);
        
    }

}
