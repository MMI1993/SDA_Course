package main.java.advanced.ziua2.threads.Runners;

public class RunnersApp {
    public static void main(String[] args) {
        Thread thread= new Thread(new MusicPlayer());
        thread.start();

    }
}
