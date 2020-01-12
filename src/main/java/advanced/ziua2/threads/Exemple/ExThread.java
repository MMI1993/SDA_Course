package main.java.advanced.ziua2.threads.Exemple;

public class ExThread extends Thread {
    @Override
    public void run() {
        String name= Thread.currentThread().getName();
        System.out.println("First Thread is running " + name);
        try {
            Thread.sleep(5000);
            System.out.println("First sleep");
            Thread.sleep(25000);
            System.out.println("second sleep");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.err.println("Problem with out thread");
        }
        System.out.println("First Thread finished " + name);
    }
}

