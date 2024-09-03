//import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;

class myListener implements ActionListener {
  ItemListing listing;
  
 public myListener(ItemListing n_listing) {
  this.listing = n_listing;
 }
 
 public void actionPerformed(ActionEvent e) {
   listing.showAllItem ();
 }
}
