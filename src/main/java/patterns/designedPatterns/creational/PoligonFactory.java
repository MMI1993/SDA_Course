package main.java.patterns.designedPatterns.creational;

public class PoligonFactory {
    public static Poligon createPoligon(int nrlat) {
        if(nrlat==3){
            return new Triangle(Math.random(),Math.random(), Math.random());
        }
        if(nrlat==4){
            return  new Dreptunghi(Math.random(), Math.random());
        }
        return null;
    }

    public static void main(String[] args) {
        Poligon poligon= createPoligon(4);
        double l3=((Triangle) poligon).getL3();
        System.out.println(l3);
    }
}
