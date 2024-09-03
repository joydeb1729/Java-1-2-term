import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class VideoPanel extends ItemPanel  implements ActionListener {
 TextEntry director = new TextEntry("Enter the director ");
 
 public VideoPanel(ItemListing listing) {
  super("Video Entry", listing);
  add(director);
  JButton button = new JButton("Create the Video");
  button.addActionListener(this);
  add(button);
 }
 
 public Video getItem() {
  return new Video(title.getValue(), 
   director.getValue(),playingTime.getIntValue ());
 }
 public void actionPerformed(ActionEvent ae) {
  listing.addVideoItem (getItem());
 }
}
