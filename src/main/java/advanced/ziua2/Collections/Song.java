package main.java.advanced.ziua2.Collections;
// de adaugat 3 nume de cantece si de afisat 3 elemente dintr-un set

import java.util.Objects;

public class Song implements Comparable<Song> {
    private final String title;
    private final int size;
    public Song(String title, int size) {
        this.title = title;
        this.size = size;
    }
    public String getTitle() {
        return title;
    }
    public int getSize() {
        return size;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return title.equals(song.title);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", size=" + size +
                '}';
    }
    @Override
    public int compareTo(Song song) {
        if (song.getSize() == size) {
            return 0;
        } else if (song.getSize() > size) {
            return 1;
        } else {
            return -1;
        }
    }
}