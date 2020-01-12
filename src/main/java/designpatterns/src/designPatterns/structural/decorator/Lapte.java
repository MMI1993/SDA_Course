package main.java.designpatterns.src.designPatterns.structural.decorator;

public class Lapte extends BauturaDecorator {

    private final double price = 0.5;

    public Lapte(Bautura bautura) {
        super(bautura);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
