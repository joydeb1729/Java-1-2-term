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
public class TextFieldFrame extends JFrame implements ActionListener{
        
    JButton button;
    JTextField textField;
    
    TextFieldFrame(){
        this.setSize(800,700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Durjay");
        this.getContentPane().setBackground(new Color(154,147,236));   
        this.setLayout(new FlowLayout());
        
        textField = new JTextField();
        textField.setPreferredSize(new Dimension(400,100));
        textField.setFont(new Font("Arial",Font.BOLD,50));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.black);
        textField.setCaretColor(Color.white);
        //textField.setText("UserName");
        
        
        
        button = new JButton("Submit");
        button.addActionListener(this);
        
        
        
        //this.pack();
        this.add(button);
        this.setVisible(true);
        this.add(textField);
        
        
    }
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           
         System.out.println("Wellcome "+ textField.getText());  
         
         //textField.setEditable(false);
         //button.setEnabled(false);
         
       }
           
    }
    
    
    
}
