package main.java.advanced.ziua2.threads.waiting;

public class WaitingApp {
    public static void main(String[] args) throws InterruptedException {
        CounterTrack counterTrack= new CounterTrack();
        counterTrack.start();
        LazyThread lazyThread= new LazyThread();
        lazyThread.start();
        Thread.sleep(15000);
    }
}
