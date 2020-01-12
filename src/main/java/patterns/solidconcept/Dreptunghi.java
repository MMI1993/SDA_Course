package main.java.patterns.solidconcept;

public class Dreptunghi implements Shape {
    private double h;
    private double l;

    public Dreptunghi(double h, double l) {
        this.h = h;
        this.l = l;
    }
        public double getH() {
            return h;
        }

        public double getL() {
            return l;
        }

    @Override
    public double getArea() {
        return getH() * getL();
    }
}
