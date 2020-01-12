package main.java.advanced.ziua2.threads.Runners;

public class MusicPlayer  extends  Player implements Runnable{
    @Override
    public void run() {
        String name= Thread.currentThread().getName();
        System.out.println("Play the song " + name);
    }
}
