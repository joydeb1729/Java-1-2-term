/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Swing;

import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author Durjay
 */
public class NewWindow {
    
    MyFrame frame;
    JLabel label;
    
    
    NewWindow(){
        frame = new MyFrame();
        label=new JLabel("Hii!");
        
        label.setBounds(50, 50, 200, 200);
        label.setFont(new Font(null, Font.PLAIN,30));
        frame.add(label);
    }
}
