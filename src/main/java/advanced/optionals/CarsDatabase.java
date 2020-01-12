package main.java.advanced.optionals;

import java.util.Optional;

public class CarsDatabase {
    Optional<String> findById(int n){
        if(n==10){
            return  Optional.of("VW Golf");
        }
        return Optional.empty();
    }
}
