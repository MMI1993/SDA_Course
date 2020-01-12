package main.java.advanced.ziua2.threads.waiting;

public class CounterTrack extends Thread{
    @Override
    public void run() {
       String name= Thread.currentThread().getName();
        System.out.println("Running thread " + name);
        for (int i = 10; i >= 0; i--) {
            System.out.println("Counter from thread " + name + "has value " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Problem with our thread");;
            }
        }
    }
}