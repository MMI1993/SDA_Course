package main.java.part1_encapsulation;

public class Main {
    public static void main(String[]args){
        Car porsche= new Car();
        Car skoda = new Car();
        skoda.setModel("CARRERA");
        System.out.println("Model is " + skoda.getModel());
        skoda.setModel("octavia");
        System.out.println("Model is " + skoda.getModel());
        porsche.setModel("carrera");
        System.out.println("Model is "
                + porsche.getModel());
    }
}
