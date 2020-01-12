package main.java.patterns.solidconcept;

public class Circle implements Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    @Override
    public double getArea() {
       return  (getR()*getR()*Math.PI);
    }
}
