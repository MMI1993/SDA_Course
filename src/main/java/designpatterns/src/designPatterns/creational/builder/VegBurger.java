package main.java.designpatterns.src.designPatterns.creational.builder;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Vegetarian Burger";
    }

    @Override
    public double price() {
        return 20;
    }
}
