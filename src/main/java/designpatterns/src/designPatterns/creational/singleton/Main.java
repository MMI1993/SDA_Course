package main.java.designpatterns.src.designPatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Earth e = Earth.getInstance();
        Earth e2 = Earth.getInstance();
        Earth e3 = Earth.getInstance();
        Earth e4 = Earth.getInstance();
    }
}
