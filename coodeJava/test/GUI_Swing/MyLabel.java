/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Swing;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Durjay
 */
public class MyLabel extends JLabel{
    MyLabel(){
        
         ImageIcon image = new ImageIcon("D:\\javaLab\\siiuu.png");
         Border border = BorderFactory.createLineBorder(Color.green,5);
        
       this.setText("Muchas gracias afición, esto es para vosotros, Siiiuuuu");
       this.setIcon(image);
       this.setHorizontalTextPosition(this.CENTER);
       this.setVerticalTextPosition(this.BOTTOM);
       this.setForeground(Color.green);
       this.setFont(new Font("Arial", Font.BOLD,10));
       this.setIconTextGap(-25);
       this.setBorder(border);
       this.setVerticalAlignment(JLabel.CENTER);
       this.setHorizontalAlignment(JLabel.CENTER);
//       this.setBackground(Color.white);
//       this.setOpaque(true);
        //this.setBounds(50,50, 300, 300);
    }
}
