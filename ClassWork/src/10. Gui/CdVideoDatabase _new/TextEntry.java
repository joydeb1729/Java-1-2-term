import javax.swing.*;
import java.awt.*;

class TextEntry extends JPanel{
 private JTextField field = new JTextField();
 
 public TextEntry(String prompt) {
  setLayout(new GridLayout(1,2));
  add(new JLabel(prompt));
  add(field);
 }
 
 public String getValue() {
  return field.getText ();
 }
}
