package main.java.advanced.ziua2.Collections;

import java.util.Set;
import java.util.TreeSet;

public class SongApp {
    public static void main(String[] args) {
        Set<Song> songs = new TreeSet<>();
        songs.add(new Song("Baby2", 5));
        songs.add(new Song("Baby", 1));
        songs.add(new Song("Despacito", 3));
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
