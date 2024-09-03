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
public class CheckBoxFrame extends JFrame implements ActionListener{
        
    JCheckBox checkBox;
    JButton button;
    ImageIcon icon1;
    ImageIcon icon2;
    
    CheckBoxFrame(){
        this.setSize(800,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Durjay");
        this.getContentPane().setBackground(new Color(154,147,236));   
        this.setLayout(new FlowLayout());
        
        icon1 = new ImageIcon("D:\\javaLab\\leftPoint.png");
        icon2 = new ImageIcon("D:\\javaLab\\rightPoint.png");
        
        checkBox = new JCheckBox();
        checkBox.setText("I am not a robot ");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Arial",Font.BOLD,20));
        checkBox.setIcon(icon1);
        checkBox.setSelectedIcon(icon2);
        
        
        button = new JButton("Submit");
        button.addActionListener(this);
        
        
        this.add(button);
        this.add(checkBox);
        //this.pack();
        this.setVisible(true);
        
        
    }
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           
           //boolean c=checkBox.isSelected();
           System.out.println(checkBox.isSelected());
         
         //textField.setEditable(false);
         //button.setEnabled(false);
         
       }
           
    }
    
    
    
}
