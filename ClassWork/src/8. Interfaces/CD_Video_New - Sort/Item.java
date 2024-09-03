public class Item implements Comparable<Item>{
    private String title;
    private int playingTime;

   public Item(String theTitle, int time) {
        title = theTitle;
        playingTime = time;
    }
   public int compareTo(Item i){
     if(this.playingTime>i.playingTime)
       return 1;
     else if(this.playingTime<i.playingTime)
       return -1;
     else
       return this.title.compareTo(i.title);
   }
   public String  toString()
    {
        return title + " (" + playingTime + " mins)\n";
    }
}
