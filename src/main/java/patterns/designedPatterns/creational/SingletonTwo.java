package main.java.patterns.designedPatterns.creational;

public class SingletonTwo { //incarcare la o numita perioada de timp
    private static SingletonTwo instance;
    private SingletonTwo() {}
    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}