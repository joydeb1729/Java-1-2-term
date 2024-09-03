/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayMusic;
import java.util.*;
/**
 *
 * @author Durjay
 */
public class Main {
  public static void main(String[] args) {
    MusicLibrary library = new MusicLibrary();
    library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
    library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
    library.addSong(new Song("Imagine", "John Lennon"));
    library.addSong(new Song("All by Myself", "Eric Carmen"));
    library.addSong(new Song("What'd I Say", "Ray Charles"));
    library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
    library.addSong(new Song("In the Air Tonight", "Phil Collins"));

    System.out.println("All songs:");
    for (Song song: library.getSongs()) {
      System.out.println(song.getTitle() + " by " + song.getArtist());
    }
    System.out.println("\n**Playing Random Song**");
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
    System.out.println();
    library.playRandomSong();
  }
}
