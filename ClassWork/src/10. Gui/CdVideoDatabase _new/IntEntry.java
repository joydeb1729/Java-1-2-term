import javax.swing.*;
import java.awt.*;

class IntEntry extends TextEntry {
 public IntEntry(String prompt) {
  super(prompt);
 }
 
 public int getIntValue() {
  return Integer.parseInt(getValue());
 }
}
