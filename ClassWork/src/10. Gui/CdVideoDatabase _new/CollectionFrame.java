import javax.swing.*;
import java.awt.*;

public class CollectionFrame extends JFrame{
 VideoPanel videoPanel;
 CDPanel cdPanel;
 commandPanel cmdPanel; 
 Database database = new Database();
 JTextArea listing = new JTextArea(10,30);
 
 public CollectionFrame () {
  ItemListing itemListing = new ItemListing(listing, database);
  videoPanel = new VideoPanel(itemListing);
  cdPanel = new CDPanel(itemListing);
  cmdPanel = new commandPanel(itemListing);

  Container cp = getContentPane();
  cp.setLayout(new BoxLayout(cp, BoxLayout.Y_AXIS));

  JPanel entryPanel = new JPanel();
  entryPanel.add(cdPanel); 
  entryPanel.add(videoPanel);
  
  //JPanel cmddPanel = new JPanel();
  //cmddPanel.add(cmdPanel);
   
  JScrollPane sp = new JScrollPane(listing);
  
  cp.add(entryPanel);
  cp.add(cmdPanel);
  cp.add(sp);
  
  pack();
  setVisible(true);
 }
}
