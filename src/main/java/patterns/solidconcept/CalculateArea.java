package main.java.patterns.solidconcept;

import java.util.ArrayList;
import java.util.List;

public class CalculateArea {
    /*public static int CalculateArea(List<Dreptunghi> list) {
        int sum = 0;
        for (Dreptunghi dreptunghi : list) {
            sum += dreptunghi.getH() * dreptunghi.getL();
        }
        return sum;
    }*/
    public static double CalculateArea(List<Shape> list) {
        double sum = 0;
        for (Shape forma : list) {
            sum += forma.getArea();
        }
        return sum;
    }

   /* public static int CalculateArea(List<Object> list) {
        int sum = 0;
        for (Object forma : list) {
            if(forma instanceof Dreptunghi){
                Dreptunghi dreptunghi= (Dreptunghi) forma;
                sum += dreptunghi.getH() * dreptunghi.getL();
            }
            else{
                Circle circle= (Circle) forma;
                sum+= circle.getR()*circle.getR()*Math.PI;
            }
        }
        return sum;
    */
    public static void main(String[] args) {
        List<Shape>list= new ArrayList<>();
        list.add(new Dreptunghi(4, 8));
        list.add(new Dreptunghi(6, 10));
        list.add(new Dreptunghi(4, 8));
        list.add(new Circle(50));
        list.add(new Circle(45));
        list.add(new Circle(30));
        System.out.println(CalculateArea(list));

    }
}