public class Video{
  private String title;
  private int playingTime;
  private String director;

   public Video(String theTitle, String theDirector, int time)  {
        title = theTitle;
        playingTime = time;
        director = theDirector;
    }
   
   public String toString()  {
     String result = "Video : " + title + " (" + playingTime + " mins)\n"
                     +"director: " + director + "\n";
        return result;
    }
}

