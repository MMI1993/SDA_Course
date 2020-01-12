package main.java.excerciseCodSursa.Point.point;

public class Main {
    public static void main(String[] args) {
        Point point0= new Point();
        System.out.println(point0);
        Line linie1= new Line(1,1,10,10);
        Line linie2= new Line(100,100,200,200);
        Line linie3= new Line(new Point(0,0), new Point(10,10));

        System.out.println(linie1);
        linie1.setBeginX(100);
        System.out.println(linie1);
        System.out.println(linie2);
        linie1.setBeginY(20);
        System.out.println(linie2);
        System.out.println(linie3);
    }
}
