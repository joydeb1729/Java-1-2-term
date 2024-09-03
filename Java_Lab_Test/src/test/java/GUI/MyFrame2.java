/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Durjay
 */
public class MyFrame2 extends JFrame implements ActionListener{
    
    JButton button1;
    JButton button2;
    
    
    MyFrame2(){
        
        this.setTitle("My Frame");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button1=new JButton("Thanks");
        button2= new JButton("Okay");
        this.add(button1);
        this.add(button2);
        
        button1.addActionListener(this);
        button2.addActionListener(this);
        
        this.setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==button1){
            JOptionPane.showMessageDialog(null, "Thanks");
        }
        if(e.getSource()==button2){
            JOptionPane.showMessageDialog(null, "Okay");
        }
    }

    
}
