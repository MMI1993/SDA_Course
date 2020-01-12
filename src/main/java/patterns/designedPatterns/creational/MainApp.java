package main.java.patterns.designedPatterns.creational;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    //public
    // double PoligonFactory poligon = new PoligonFactory();

    public static void main(String[] args) {
        List<Poligon> list= new ArrayList<>();
        list.add(new Dreptunghi(Math.random(), Math.random()));
        list.add(new Triangle(Math.random(), Math.random(), Math.random()));
        System.out.println(list);}



}
