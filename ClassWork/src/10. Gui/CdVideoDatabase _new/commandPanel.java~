import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CDPanel extends ItemPanel  implements ActionListener {
 TextEntry artist = new TextEntry("Enter the artist ");
 IntEntry nTracks = new IntEntry("Enter the number of tracks ");
 
 public CDPanel(ItemListing listing) {
  super("CD Entry", listing);
  add(artist);
  add(nTracks);
  JButton button = new JButton("Create the CD");
  button.addActionListener(this);
  add(button);
 }
 
 public CD getItem() {
  return new CD(title.getValue(), artist.getValue (), 
   nTracks.getIntValue (), playingTime.getIntValue ());
 }
 
 public void actionPerformed(ActionEvent ae) {
  listing.addCDItem (getItem());
 }
}
