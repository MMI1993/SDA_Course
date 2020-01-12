package main.java.designpatterns.src.designPatterns.structural.adapter;

public class AudioPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;
    private String mediaType;

    /**
     * In functie de ce mediaType se primeste ca atribut la constructor instantiem un VlcPlayer sau un Mp4Player.
     */
    public AudioPlayerAdapter(String mediaType) {
        if(mediaType.equalsIgnoreCase("vlc") ){
            advancedMediaPlayer = new VlcPlayer();
        }else if (mediaType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return mediaType;
    }

    @Override
    public void play(String mediaType, String filename) {
        if (mediaType.equals("mp4"))
            advancedMediaPlayer.playMp4(filename);
        if (mediaType.equals("vlc"))
            advancedMediaPlayer.playVlc(filename);
    }
}
