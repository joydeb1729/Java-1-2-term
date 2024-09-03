/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PlayMusic;

/**
 *
 * @author Durjay
 */
import java.util.*;

public class MusicLibrary {

    ArrayList<Song> Library = new ArrayList<>();

    public MusicLibrary() {

    }

    public void addSong(Song song) {
        Library.add(song);
    }

    public void removeSong(Song song) {
        Library.remove(song);
    }

    public void playRandomSong() {
        if (Library.size() == 0) {
            System.out.println("No song found!");
            return;
        }
        Random rand = new Random();
        int index = rand.nextInt(Library.size());
        System.out.println("Playing " + Library.get(index).getTitle() + " by " + Library.get(index).getArtist() + "\n");;
    }

    public ArrayList<Song> getSongs() {
        return Library;
    }

}
