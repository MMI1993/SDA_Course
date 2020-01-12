package main.java.advanced.ziua2.threads.Exemple;

public class ExempleApp {
    public static void main(String[] args) throws InterruptedException {
        ExThread exThread = new ExThread();
        exThread.start();
        SecondThread secondThread = new SecondThread();
        secondThread.start();

        Thread.sleep(15000);
    }
}
