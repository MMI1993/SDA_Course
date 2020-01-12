package main.java.patterns.decoratorSecond;

public class Frisca extends DrinkDecorator {
private final double price=2;
private Drink drink;

    public Frisca(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double decorate() {
        return drink.decorate()+price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
