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
public class Main {

    public static void main(String[] args) {
        // MyFrame frame = new MyFrame();
//        MyLabel label = new MyLabel();        
//        frame.add(label);
//        frame.pack();//add pack after adding all label methods.
        /* Panel
        JPanel redPanel= new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 300, 300);
        JPanel bluePanel= new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(300, 0, 300, 300);
        JPanel greenPanel= new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 300, 600, 300);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
         */
        /*
        new MyFrame2();   //Button
         */
        /*
        //  Border
        frame.setLayout(new BorderLayout(10,10));
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.yellow);
        panel4.setBackground(Color.magenta);
        panel5.setBackground(Color.blue);
        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));
        panel5.setLayout(new BorderLayout());
        //-----------subPanels-----------------
        JPanel panel6 = new JPanel();
        JPanel panel7 = new JPanel();
        JPanel panel8 = new JPanel();
        JPanel panel9 = new JPanel();
        JPanel panel10 = new JPanel();
        panel6.setBackground(Color.DARK_GRAY);
        panel7.setBackground(Color.GRAY);
        panel8.setBackground(Color.LIGHT_GRAY);
        panel9.setBackground(Color.DARK_GRAY);
        panel10.setBackground(Color.WHITE);
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel8.setPreferredSize(new Dimension(50,50));
        panel9.setPreferredSize(new Dimension(50,50));
        panel10.setPreferredSize(new Dimension(50,50));
        panel5.add(panel6,BorderLayout.NORTH);
        panel5.add(panel7,BorderLayout.WEST);
        panel5.add(panel8,BorderLayout.EAST);
        panel5.add(panel9,BorderLayout.SOUTH);
        panel5.add(panel10,BorderLayout.CENTER);
        frame.add(panel1,BorderLayout.NORTH);
        frame.add(panel2,BorderLayout.WEST);
        frame.add(panel3,BorderLayout.EAST);
        frame.add(panel4,BorderLayout.SOUTH);
        frame.add(panel5,BorderLayout.CENTER);
         */
        /*
        //FLOWLAYOUT
        frame.setLayout(new FlowLayout());
        //frame.setLayout(new FlowLayout(FlowLayout.LEADING));
        //frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        //frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,20));
        //        frame.add(new JButton("1"));
        //        frame.add(new JButton("2"));
        //        frame.add(new JButton("3"));
        //        frame.add(new JButton("4"));
        //        frame.add(new JButton("5"));
        //        frame.add(new JButton("6"));
        //        frame.add(new JButton("7"));
        //        frame.add(new JButton("8"));
        //        frame.add(new JButton("9"));
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150,300));
        panel.setBackground(Color.lightGray);
        panel.setLayout(new FlowLayout());
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        frame.add(panel);
         */
        /*
        //GRID LAYOUT
        //frame.setLayout(new GridLayout(3,3));
        frame.setLayout(new GridLayout(3,3,10,15));
        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
         */
        /*
        // JLayeredPane
        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.red);
        label1.setBounds(50,50,200,200);
        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,200,200);
        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.green);
        label3.setBounds(150,150,200,200);
        JLayeredPane layeredPane = new JLayeredPane();
        //        layeredPane.add(label1);
        //        layeredPane.add(label2);
        //        layeredPane.add(label3);
        layeredPane.add(label1,Integer.valueOf(0));
        layeredPane.add(label2,Integer.valueOf(1));
        layeredPane.add(label3,Integer.valueOf(2));
        layeredPane.setBounds(0, 0, 500, 500);
        frame.add(layeredPane);
         */
        /*
        // New Window
        LaunchPage launcgPage = new LaunchPage();
         */
        
        /*
        //JOptionPane
//        JOptionPane.showMessageDialog(null, "This is temporary text", "Durjay", JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is temporary text", "Durjay", JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is temporary text", "Durjay", JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is temporary text", "Durjay", JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null, "This is temporary text", "Durjay", JOptionPane.ERROR_MESSAGE);


        //int answer = JOptionPane.showConfirmDialog(null, "Do you want to continue", "Durjay", JOptionPane.YES_NO_CANCEL_OPTION);
         //System.out.println(JOptionPane.showConfirmDialog(null, "Do you want to continue", "Durjay", JOptionPane.YES_NO_CANCEL_OPTION));
         
//         String name=JOptionPane.showInputDialog("Who are you?");
//         System.out.println("Hi "+ name);


        String[] responses = {"Me too!", "I am white!", "Pick Cotton"};
          ImageIcon image = new ImageIcon("D:\\javaLab\\logo.png");
          JOptionPane.showOptionDialog(null, "You are a Nigga", "Durjay", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, image, responses, 0);
          
          */
        
        /*
        //Text Field
        
        TextFieldFrame frame = new TextFieldFrame();

        */
        
        /*
        //Check Box
        
        CheckBoxFrame frame = new CheckBoxFrame();
        */
        
        /*
        //Radio Button
        
        RadioButtonFrame frame= new RadioButtonFrame();
        */
    }
}
