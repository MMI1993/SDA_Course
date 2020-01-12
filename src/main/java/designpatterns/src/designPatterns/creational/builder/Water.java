package main.java.designpatterns.src.designPatterns.creational.builder;

public class Water extends Drink {
    @Override
    public String name() {
        return "Water";
    }

    @Override
    public double price() {
        return 5;
    }
}
