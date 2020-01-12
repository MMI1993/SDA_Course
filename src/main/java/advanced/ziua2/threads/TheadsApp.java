package main.java.advanced.ziua2.threads;

public class TheadsApp {
    public static void main(String[] args) throws InterruptedException {
       MyThread myThread= new MyThread();
       myThread.start();
        MyThread myThread1= new MyThread();
        myThread1.start();
        MyThread myThread2= new MyThread();
        myThread2.start();
        System.out.println(Thread.currentThread().getName());
    }
    public static void counter2() throws InterruptedException{
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
    public static void counter()throws InterruptedException {
        int counter = 10;
        while (counter != 0) {
            System.out.println(counter);
            Thread.sleep(1000);
            counter--;
        }
    }
}
/*
  String name = Thread.currentThread().getName();
        Thread.sleep(1000);
        counter--;
        System.out.println("Gata");
    }
 */
