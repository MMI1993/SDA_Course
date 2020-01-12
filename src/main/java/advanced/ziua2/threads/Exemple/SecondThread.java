package main.java.advanced.ziua2.threads.Exemple;

public class SecondThread extends Thread {
    @Override
    public void run() {
        String name= Thread.currentThread().getName();
        System.out.println("Second thread is running " + name);
        try {
            currentThread().sleep(5000);
            System.out.println("First sleep for thread 2");
            currentThread().sleep(25000);
            System.out.println("second sleep for thread 2");
            currentThread().sleep(3000);
        } catch (InterruptedException e) {
            System.err.println("current thread is not curring");
        }
        System.out.println("Second Thread finished " + name);
    }
}
