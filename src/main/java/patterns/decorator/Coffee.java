package main.java.patterns.decorator;

public class Coffee implements Drink {
    private final double price=1.0;
    @Override
    public double decorate() {
        return price;

    }
}
