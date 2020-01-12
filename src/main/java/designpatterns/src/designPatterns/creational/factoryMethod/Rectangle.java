package main.java.designpatterns.src.designPatterns.creational.factoryMethod;

import java.util.Date;

public class Rectangle implements Shape {
    private double inaltime;
    private double lungime;
    private Date date;

    public Rectangle(double inaltime, double lungime, Date date) {
        this.inaltime = inaltime;
        this.lungime = lungime;
        this.date = date;
    }

    public double getInaltime() {
        return inaltime;
    }

    public double getLungime() {
        return lungime;
    }

    public Date getDate() {
        return date;
    }
}
