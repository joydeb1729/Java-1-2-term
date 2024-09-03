import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class commandPanel extends JPanel implements ActionListener {
  ItemListing listing;
  
 public commandPanel(ItemListing n_listing) {
  this.listing = n_listing;
  
  JButton CDbutton = new JButton("CD");
  CDbutton.setActionCommand("CD");
  CDbutton.addActionListener(this);
  add(CDbutton);
  
  JButton Videobutton = new JButton("Video");
  Videobutton.setActionCommand("Video");
  Videobutton.addActionListener(this);
  add(Videobutton);
  
  JButton allbutton = new JButton("All");
  allbutton.setActionCommand("All");
  allbutton.addActionListener(new myListener(listing));
  add(allbutton);
 }
 public void actionPerformed(ActionEvent e) {
   if ("CD".equals(e.getActionCommand()))
     listing.showCDItem ();
   else if ("Video".equals(e.getActionCommand())) 
     listing.showVideoItem ();
  // else if ("All".equals(e.getActionCommand()))
   //  listing.showAllItem ();
 }
}
