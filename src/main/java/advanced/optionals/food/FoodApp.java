package main.java.advanced.optionals.food;

import java.util.Optional;

public class FoodApp {
    public static void main(String[] args) {
        FoodDatabase database = new FoodDatabase();
        Optional<Integer> found = database.find("morcovi");
        if (found.isPresent()) {
            System.out.println(found.get());
        } else {
            System.out.println("Nu am gasit");
        }
    }
}
