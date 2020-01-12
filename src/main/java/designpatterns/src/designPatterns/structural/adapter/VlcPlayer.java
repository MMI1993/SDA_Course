package main.java.designpatterns.src.designPatterns.structural.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
        // do nothing
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc " + filename);
    }
}
