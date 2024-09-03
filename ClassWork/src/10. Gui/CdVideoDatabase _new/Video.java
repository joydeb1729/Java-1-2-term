public class Video extends Item  {
    private String director;

   public Video(String theTitle, String theDirector, int time)  {
        super(theTitle, time);
        director = theDirector;
    }

   public String getDirector() {
        return director;
    }

   public String toString()  {
     String result = "Video : " + super.toString ();
        result += "    director: " + director + "\n";
        return result;
    }
}

