package main.java.advanced.optionals;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        CarsDatabase database = new CarsDatabase();
       Optional<String> results = database.findById(10);
        if (results.isPresent()) {
            String car = results.get();
            System.out.println(car);
        }else{
            System.out.println("No car found");
        }
    }
}
// in loc de if else putem sa punem urmatoarele linii de cod:
// String car=result.orElse("No car);
// System.out.println();
//Optional se folosesste in semnatura metodelor care sunt publice.
// daca se expune functionalitate ((met publice) si vrem sa aratam ca valoare poate lipsi, se recomanda folsirea Optional.
// In metode private se pate folosi null ca return type.
