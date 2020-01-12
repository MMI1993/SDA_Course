package main.java.patterns.designedPatterns.creational;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public List<Poligon> createShape(){
        List<Poligon>list=new ArrayList<>();
        list.add(new Triangle(Math.random(),Math.random(),Math.random()));
        list.add(new Triangle(Math.random(),Math.random(),Math.random()));
        list.add(new Dreptunghi(Math.random(),Math.random()));
        return list;
    }
}
