import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

abstract class ItemPanel extends JPanel{
 TextEntry title = new TextEntry("Enter the title");
 IntEntry  playingTime = new IntEntry("Enter the playing time");
 ItemListing listing;

 public ItemPanel(String ptitle, ItemListing listing) {
  this.listing = listing;
  setLayout(new GridLayout(0,1));
  setBorder(BorderFactory.createTitledBorder (ptitle));
  add(title);
  add(playingTime);
 }
 
}
