package main.java.advanced.lambda;

public class LambdaThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            String name = Thread.currentThread().getName();
            System.out.println(name);
        });
        thread.start();
    }
}
