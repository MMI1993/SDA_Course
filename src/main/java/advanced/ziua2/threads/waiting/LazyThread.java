package main.java.advanced.ziua2.threads.waiting;


public class LazyThread extends Thread {
    @Override
    public void run() {
        String name= Thread.currentThread().getName();
        System.out.println("Running Thread" + name);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Problem with out thread");
        }
        System.out.println("Finish thread " + name);
    }
}
