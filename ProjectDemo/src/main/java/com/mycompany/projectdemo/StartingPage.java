/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectdemo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Durjay
 */
public class StartingPage implements ActionListener  {
    
        MyFrame startingPage;
     
        JButton personButton;
        JButton studentButton;
        
        StartingPage(){
            
            startingPage = new MyFrame();
            
            personButton = new JButton("Person");
            studentButton = new JButton("Student");
            
            
            personButton.setBounds(250,50,200,80);
            personButton.setFocusable(false);
            personButton.setFont(new Font("Arial",Font.BOLD,20));
            personButton.setHorizontalTextPosition(JButton.LEFT);
            personButton.setVerticalTextPosition(JButton.CENTER);
            personButton.addActionListener(this);
            
            
            studentButton.setBounds(250,180,200,80);
            studentButton.setFocusable(false);
            studentButton.setFont(new Font("Arial",Font.BOLD,20));
            studentButton.setHorizontalTextPosition(JButton.LEFT);
            studentButton.setVerticalTextPosition(JButton.CENTER);
            studentButton.addActionListener(this);
            
            
            
            
            startingPage.add(personButton);
            startingPage.add(studentButton);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==personButton){
            startingPage.dispose();
            Person newPerson = new Person("rahul", "Khulna");
        }
            
        else if(e.getSource()==studentButton){
            startingPage.dispose();
            Student newStudent = new Student( "111" , "rahul", "Khulna");
        }
            
        
            
            
        }
        
    }
        
        
        
        

