package main.java.designpatterns.src.designPatterns.structural.adapter;

public class AudioPlayer implements MediaPlayer {

    AudioPlayerAdapter adapter;

    public AudioPlayer(AudioPlayerAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Audio playerul cand nu poate sa dea drumul el la un anumit format creaza un adaptor cu media typeul nou dupa care da play la fisierul respectiv.
     */
    @Override
    public void play(String mediaType, String filename) {
        if (mediaType.equals("mp3")) {
            System.out.println("Media player is playing " + filename);
        } else if (mediaType.equals(adapter.getMediaType())) {
            AudioPlayerAdapter audioAdapter = new AudioPlayerAdapter(mediaType);
            audioAdapter.play(mediaType, filename);
        } else {
            System.out.println("Invalid media. " + mediaType + " format not supported");
        }
    }
}
