package main.java.designpatterns.src.designPatterns.structural.decorator;

public class Frisca extends BauturaDecorator {

    private final double price = 2;

    public Frisca(Bautura bautura) {
        super(bautura);
    }

    @Override
    public double getPrice() {
        return price;
    }
}
