/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Durjay
 */
public class MyFrame2 extends JFrame implements ActionListener{
       
    JButton button1;
    JButton button2;
    JLabel label1;
    JLabel label2;
    
    MyFrame2(){
        ImageIcon leftPointer = new ImageIcon("D:\\javaLab\\leftPoint.png");
        ImageIcon rightPointer = new ImageIcon("D:\\javaLab\\rightPoint.png");
        ImageIcon wow = new ImageIcon("D:\\javaLab\\shock.png");
        ImageIcon siiuu = new ImageIcon("D:\\javaLab\\siiuu.png");
        button1=new JButton("NIGGA");
        button2=new JButton("SIIUU");
        label1=new JLabel();
        label2=new JLabel();
        
        label1.setBounds(50, 400, 300, 150);
        label1.setIcon(wow);
        label1.setVisible(false);
        label2.setBounds(500, 400, 300, 300);
        label2.setIcon(siiuu);
        label2.setVisible(false);
        
        
        button1.setFocusable(false);//remove borderfrom button text
        button1.setBounds(200,100,150,100);
        button1.addActionListener(this);
        button1.setIcon(leftPointer);
        button1.setIconTextGap(10);
        button1.setHorizontalTextPosition(JButton.LEFT);
        button1.setVerticalTextPosition(JButton.CENTER);
        button1.setHorizontalAlignment(JButton.RIGHT);
        button1.setVerticalAlignment(JButton.CENTER);
        button1.setFont(new Font("Arial",Font.BOLD,20));
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        button1.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
        
        
        button2.setFocusable(false);
        button2.setBounds(200,200,150,100);
        button2.addActionListener(this);
        button2.setIcon(rightPointer);
        button2.setIconTextGap(10);
        button2.setHorizontalTextPosition(JButton.RIGHT);
        button2.setVerticalTextPosition(JButton.CENTER);
        button2.setHorizontalAlignment(JButton.LEFT);
        button2.setVerticalAlignment(JButton.CENTER);
        button2.setFont(new Font("Arial",Font.BOLD,20));
        button2.setForeground(Color.green);
        button2.setBackground(Color.DARK_GRAY);
        button2.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
        
        this.setSize(1000,900);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setTitle("Durjay");
        this.add(button1);
        this.add(button2);
        this.add(label1);
        this.add(label2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            System.out.println("Racist!");
            label1.setVisible(true);
            button1.setEnabled(false);
            
        }
          
        if(e.getSource()==button2){
            System.out.println("Siiiuuuuu!!");
            label2.setVisible(true);
        }  
    }
    
}
