/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Durjay
 */
public class MyFrame1 extends JFrame{
    
    MyFrame1(){
        this.setTitle("Frame 1");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setSize(400, 400);
        
        JButton button1= new JButton("1");
        JButton button2= new JButton("2");
        JButton button3 = new JButton("3");
        this.add(button1,BorderLayout.NORTH);
        this.add(button2,BorderLayout.SOUTH);
        this.add(button3,BorderLayout.CENTER);
        this.add(new JButton("4"), BorderLayout.EAST);
        this.add(new JButton("5"), BorderLayout.WEST);
        
        
        this.setVisible(true);
        
    }
}
