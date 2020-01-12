package main.java.patterns.designedPatterns.creational;

public class Singleton {
    private static Singleton instance = new Singleton(); //implementation at first starting
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
}
