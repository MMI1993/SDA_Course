package main.java.designpatterns.src.designPatterns.structural.adapter;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        System.out.println("MP4 playing " + filename);
    }

    @Override
    public void playVlc(String filename) {
        // do nothing
    }
}
