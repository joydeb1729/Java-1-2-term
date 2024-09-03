/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Durjay
 */
public class LaunchPage implements ActionListener{
    
    MyFrame frame = new MyFrame();
    JButton button = new JButton("New Page");
    
    LaunchPage(){
        
        button.setBounds(100, 180, 400, 100);
        button.setFocusable(false);
        button.addActionListener(this);
        
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            frame.dispose();
            NewWindow newWindow = new NewWindow();
        }
    }
    
}
