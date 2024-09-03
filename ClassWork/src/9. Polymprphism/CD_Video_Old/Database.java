import java.util.*;
public class Database {
   private ArrayList cds;
    private ArrayList videos;

   // * Construct an empty Database.
   public Database()  {
        cds = new ArrayList();
        videos = new ArrayList();
    }

    /**
     * Add a CD to the database.
     */
    public void addCD(CD theCD)  {
        cds.add(theCD);
    }

    /**
     * Add a video to the database.
     */
    public void addVideo(Video theVideo) {
        videos.add(theVideo);
    }
     
    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public void list()
    {
        // print list of CDs
        for(Iterator iter = cds.iterator(); iter.hasNext(); ) {
            CD cd = (CD)iter.next();
            System.out.println(cd);   // empty line between items
        }

        // print list of videos
        for(Iterator iter = videos.iterator(); iter.hasNext(); ) {
            Video video = (Video)iter.next();
            System.out.println(video);   // empty line between items
        }
    }

}
