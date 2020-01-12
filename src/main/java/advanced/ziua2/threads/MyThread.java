package main.java.advanced.ziua2.threads;

public class MyThread extends Thread {
    @Override
    public void run() {
        String name= Thread.currentThread().getName();
        System.out.println(name);
    }
}
