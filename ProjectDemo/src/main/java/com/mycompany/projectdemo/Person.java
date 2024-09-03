/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectdemo;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Person extends Address implements Comparable<Person> {

    protected String name;
    
    MyFrame personFrame;
    JTextField nameTextField;
    JTextField addressTextField;
    
    JLabel nameTextLabel;
    JLabel addressTextLabel;
    JLabel titleLabel;
    
    JButton startButton;
    JButton lastButton;
    JButton nextButton;
    JButton prevButton;
    JTextField countBox;
    JButton addButton;
    JButton deleteButton;
    JButton updateButton;
    JButton sortButton;
    JButton returnButton;
    
    ImageIcon startIcon;
    ImageIcon nextIcon;
    ImageIcon prevIcon;
    ImageIcon lastIcon;
    ImageIcon returnIcon;

    Person(String name, String address) {
        super(address);
        this.name = name;
        
        titleLabel = new JLabel("Person Database");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(250, 20, 200, 30);
        
        startIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\startButton.png");
        nextIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\forwardButton.png");
        prevIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\prevButton.png");
        lastIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\lastButton.png");
        returnIcon = new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\returnButton.png");

        // Initialize components
        nameTextLabel = new JLabel("Name:");
        nameTextLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        nameTextLabel.setForeground(Color.black);

        nameTextField = new JTextField();
        nameTextField.setPreferredSize(new Dimension(300, 30));
        nameTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        nameTextField.setCaretColor(Color.black);

        addressTextLabel = new JLabel("Address:");
        addressTextLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        addressTextLabel.setForeground(Color.black);

        addressTextField = new JTextField();
        addressTextField.setPreferredSize(new Dimension(300, 30));
        addressTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        addressTextField.setCaretColor(Color.black);

        // Create a panel with null layout
        JPanel panel = new JPanel();
        panel.setLayout(null); // Set layout to null for absolute positioning
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));

        // Set bounds for each component
        nameTextLabel.setBounds(130, 90, 100, 30);
        nameTextField.setBounds(240, 90, 300, 30);
        addressTextLabel.setBounds(130, 130, 100, 30);
        addressTextField.setBounds(240, 130, 300, 30);

        // Add components to the panel
        panel.add(nameTextLabel);
        panel.add(nameTextField);
        panel.add(addressTextLabel);
        panel.add(addressTextField);
        
        
        startButton = new JButton();
        lastButton = new JButton();
        nextButton = new JButton();
        prevButton = new JButton();
        countBox = new JTextField();
        
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        updateButton = new JButton("Update");
        sortButton = new JButton("Sort");
        returnButton = new JButton();
        
        // Set properties
        startButton.setBounds(130, 220, 60, 30);
        prevButton.setBounds(220, 220, 60, 30);
        countBox.setBounds(310, 220, 80, 30);
        nextButton.setBounds(410, 220, 60, 30);
        lastButton.setBounds(500, 220, 60, 30);
        
        startButton.setIcon(startIcon);
        lastButton.setIcon(lastIcon);
        prevButton.setIcon(prevIcon);
        nextButton.setIcon(nextIcon);
        returnButton.setIcon(returnIcon);
        
        addButton.setBounds(140, 280, 80, 30);
        updateButton.setBounds(250, 280, 80, 30);
        deleteButton.setBounds(360, 280, 80, 30);
        sortButton.setBounds(470, 280, 80, 30);
        returnButton.setBounds(10, 310, 80, 40);
        
        // Add components to the panel
        panel.add(startButton);
        panel.add(nextButton);
        panel.add(countBox);
        panel.add(prevButton);
        panel.add(lastButton);
        panel.add(titleLabel);
        
        panel.add(addButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(sortButton);
        panel.add(returnButton);

        // Create the student frame
        personFrame = new MyFrame();
        personFrame.add(panel);
        personFrame.setVisible(true);
    }
    
    
    
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Person p) {
    return this.getName().compareTo(p.getName());
}

    
}
