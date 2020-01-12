package main.java.patterns.decoratorSecond;

public abstract class DrinkDecorator implements Drink {
    private Drink drink;

    @Override
    public double decorate() {
        return drink.decorate()+getPrice();
    }
    public abstract double getPrice();
}
