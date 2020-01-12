package main.java.designpatterns.src.designPatterns.creational.builder;

public class MeatBurger extends Burger {
    @Override
    public String name() {
        return "Meat Burger";
    }

    @Override
    public double price() {
        return 22;
    }
}
