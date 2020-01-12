package main.java.designpatterns.src.designPatterns.structural.adapter;


/**
 * Adapter Pattern este folosit atunci cand vrem sa conectam doua interfete incompatibile care altfel nu ar putea fi conectate.
 * Un adaptor wrapuie o clasa deja existenta cu o noua interfata in asa fel incat sa devina compatibila cu interfata dorita.
 */
public class Main {

    public static void main(String[] args) {
        AudioPlayerAdapter mp4Adapter = new AudioPlayerAdapter("mp4");
        AudioPlayerAdapter vlcAdapter = new AudioPlayerAdapter("vlc");

        MediaPlayer audioPlayerWithMp4Adapter = new AudioPlayer(mp4Adapter);

        audioPlayerWithMp4Adapter.play("mp3", "orice");
        audioPlayerWithMp4Adapter.play("mp4", "orice2");
        audioPlayerWithMp4Adapter.play("vlc", "vlcFILE"); //o sa arate ca e invalid si nu poate sa playuie vlc pentru ca audio playeru nostru are adaptor doar ptr mp4

        MediaPlayer audioPlayerWithVlcAdapter = new AudioPlayer(vlcAdapter);

        audioPlayerWithVlcAdapter.play("vlc", "vlcFILE");
    }
}
