package main.java.advanced.ziua2.Collections.Countries;

public class CapitalsApp {
    public static void main(String[] args) {
        CapitalsDatabase database = new CapitalsDatabase();
        String capital = database.getCapital("England");
        System.out.println(capital);
    }
}