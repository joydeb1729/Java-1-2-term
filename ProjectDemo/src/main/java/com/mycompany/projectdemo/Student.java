/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectdemo;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Student extends Person implements Comparable<Person>, ActionListener {

    private String id;
    
    
    MyFrame studentFrame;
    
    
    JTextField idTextField;
    JTextField nameTextField;
    JTextField addressTextField;
    
    
    JLabel idTextLabel;
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

    Student(String id, String name, String address) {
        super(name, address);
        this.id = id;

        // Dispose personFrame (if needed)
        personFrame.dispose();
        
        titleLabel = new JLabel("Student Database");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.black);
        titleLabel.setBounds(250, 20, 200, 30);
        
        startIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\startButton.png");
        nextIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\forwardButton.png");
        prevIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\prevButton.png");
        lastIcon=new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\lastButton.png");
        returnIcon = new ImageIcon("C:\\Users\\Durjay\\Documents\\NetBeansProjects\\Java_Project\\src\\java_project\\returnButton.png");
        

        // Initialize components
        idTextLabel = new JLabel("Student ID:");
        idTextLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        idTextLabel.setForeground(Color.black);

        idTextField = new JTextField();
        idTextField.setPreferredSize(new Dimension(300, 30));
        idTextField.setFont(new Font("Arial", Font.PLAIN, 15));
        idTextField.setCaretColor(Color.black);

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
        idTextLabel.setBounds(130, 70, 100, 30);
        idTextField.setBounds(240, 70, 300, 30);
        nameTextLabel.setBounds(130, 110, 100, 30);
        nameTextField.setBounds(240, 110, 300, 30);
        addressTextLabel.setBounds(130, 150, 100, 30);
        addressTextField.setBounds(240, 150, 300, 30);

        // Add components to the panel
        panel.add(idTextLabel);
        panel.add(idTextField);
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
        
        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        
        

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
        studentFrame = new MyFrame();
        studentFrame.add(panel);
        //studentFrame.setSize(450, 170); // Set size of the frame
        //studentFrame.setLocationRelativeTo(null); // Center the frame on the screen
        studentFrame.setVisible(true);
    }
    
    
    
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Person p) {
        Student s = (Student)p;
        int thisId = Integer.parseInt(id);
        int thatId = Integer.parseInt(s.id);
        return Integer.compare(thisId, thatId);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addButton){
            nameTextField.setText("");
            idTextField.setText("");
            addressTextField.setText("");
        }
        else if (e.getSource() == updateButton) {

    int answer = JOptionPane.showConfirmDialog(null,"Are you sure you want to update?","Update",JOptionPane.YES_NO_CANCEL_OPTION);

        if(answer == JOptionPane.YES_OPTION){
            this.name = nameTextField.getText();
            this.id = idTextField.getText();
            this.address = addressTextField.getText();
           JOptionPane.showMessageDialog(null, "Data added Succesfully!", "Update", JOptionPane.INFORMATION_MESSAGE);
           nameTextField.setText("");
           idTextField.setText("");
           addressTextField.setText("");
        }
    
     }
        
//        else if(e.getSource()==deleteButton){
//            deleteStudent();
//        }
    }
}


    
    
    
    
    
    
