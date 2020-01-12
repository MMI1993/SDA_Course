package main.java.patterns.decoratorSecond;

public class Milk extends DrinkDecorator {
    private  final double price = 0.5;
    private Drink drink;

    public Milk(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double decorate() {
        return drink.decorate()+price;
    }

    public double getPrice() {
        return price;
    }
}
