package main.java.advanced.optionals.food;

import java.util.Optional;

public class FoodDatabase {

    public Optional<Integer> find(String name) {
        switch (name) {
            case "sarmale":
                return Optional.of(120);
            case "shaorma":
                return Optional.of(1000);
            default:
                return Optional.empty();
        }
    }
}