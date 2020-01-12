package main.java.designpatterns.src.designPatterns.creational.factoryMethod;

import java.util.Date;

public class Triangle implements Shape {
    private double latura1;
    private double latura2;
    private double latura3;
    private Date date;

    public Triangle(double latura1, double latura2, double latura3, Date date) {
        this.latura1 = latura1;
        this.latura2 = latura2;
        this.latura3 = latura3;
        this.date = date;
    }

    public double getLatura1() {
        return latura1;
    }

    public double getLatura2() {
        return latura2;
    }

    public double getLatura3() {
        return latura3;
    }
}
