package main.java.patterns.designedPatterns.creational;

public class Triangle implements Poligon {
    private double l1;
    private double l2;
    private double l3;

    public double getL1() {
        return l1;
    }

    public double getL2() {
        return l2;
    }

    public double getL3() {
        return l3;
    }

    public Triangle(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
}
