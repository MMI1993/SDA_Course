package main.java.designpatterns.src.designPatterns.structural.decorator;

public abstract class BauturaDecorator implements Bautura {

    private Bautura bautura;

    public BauturaDecorator(Bautura bautura) {
        this.bautura = bautura;
    }

    @Override
    public double decorate() {
        return bautura.decorate() + getPrice();
    }

    public abstract double getPrice();
}
