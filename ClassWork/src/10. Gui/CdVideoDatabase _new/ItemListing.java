import javax.swing.*;

class ItemListing {
 JTextArea text;
 Database database;
 
 public ItemListing(JTextArea text, Database database) {
  this.text = text;
  this.database = database;
 }
 
 public void addCDItem(CD item) {
  database.addCDItem (item);
 }
 public void addVideoItem(Video item) {
  database.addVideoItem (item);
 }
 public void showCDItem() {
  text.setText (database.getCDs());
 }
 public void showVideoItem() {
  text.setText (database.getVideos());
 }
 public void showAllItem() {
  text.setText (database.getCDs()+database.getVideos());
 }
}
