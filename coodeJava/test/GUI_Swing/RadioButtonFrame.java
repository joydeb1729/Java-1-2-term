/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Durjay
 */
public class RadioButtonFrame extends JFrame implements ActionListener{
        
    JRadioButton pessiButton;
    JRadioButton ronaldoButton;
    JRadioButton kroosButton;
    ButtonGroup group;
    
    ImageIcon pessi;
    ImageIcon ronaldo;
    ImageIcon kroos;
    ImageIcon icon;
    
    RadioButtonFrame(){
        this.setSize(800,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Durjay");
        this.getContentPane().setBackground(new Color(154,147,236));   
        this.setLayout(new FlowLayout());
        
        pessi = new ImageIcon("D:\\javaLab\\pessi.png");
        ronaldo = new ImageIcon("D:\\javaLab\\goat.png");
        kroos = new ImageIcon("D:\\javaLab\\kroos.png");
        icon = new ImageIcon("D:\\javaLab\\logo.png");
        
         pessiButton = new JRadioButton("Messi");
         ronaldoButton = new JRadioButton("Ronaldo");
         kroosButton = new JRadioButton("Toni Kroos");
         
         
         group = new ButtonGroup();
         
        group.add(pessiButton);
        group.add(ronaldoButton);
        group.add(kroosButton);
        
        pessiButton.setIcon(pessi);
        ronaldoButton.setIcon(ronaldo);
        kroosButton.setIcon(kroos);
        kroosButton.setSelectedIcon(icon);
         
        pessiButton.addActionListener(this);
        ronaldoButton.addActionListener(this);
        kroosButton.addActionListener(this);
        
        
        this.add(pessiButton);
        this.add(ronaldoButton);
        this.add(kroosButton);
        //this.pack();
        this.setVisible(true);
        
        
    }
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==pessiButton){
       
           System.out.println("You selected the biggest fraud of all time");
       }
       if(e.getSource()==ronaldoButton){
       
           System.out.println("You selected the GOAT!");
       }
       if(e.getSource()==kroosButton){
       
           System.out.println("Hail Nazi");
       }
       
           
    }
    
    
    
}
