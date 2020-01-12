package main.java.patterns.designedPatterns.creational;

public class Dreptunghi implements Poligon {
    private double height;
    private double width;

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Dreptunghi(double height, double width) {
        this.height = height;
        this.width = width;
    }
}
