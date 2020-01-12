package main.java.advanced.ziua2.threads.Runners.ExcerciseRunner;

public class Ex1 implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 10; i >= 0; i--) {
            System.out.println("Counter for thread " + name + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Problem with our thread");
                ;
            }
            System.out.println("Play the counter " + name);
        }
    }
}


