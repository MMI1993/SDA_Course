package main.java.advanced.lambda;

public class LambdaThreadCounter {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    System.out.println(i);
                } catch (InterruptedException e) {
                    System.err.println("Wrong");
                }
            }
        });
        thread.start();
        Thread.sleep(10000);
    }
}
