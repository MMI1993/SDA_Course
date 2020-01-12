package main.java.advanced.streams;

import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsAppTwo {
    public static void main(String[] args) {
        List<Person> names= new ArrayList<>();
        names.add(new Person(" Andrei"));
        names.add(new Person(" Nicu"));
        names.add(new Person(" Marius"));
        names.add(new Person(" Mihai"));
        Optional<Person> found= names.stream()
                .filter(p-> p.getName().equals("Nicu"))
                .findFirst(); // sau .findAny(); Collect si findAny termina un stream
        // putem sa ii adaunam pe toti daca punem .count();
        if(found.isPresent()){
            System.out.println(found.get());
        }
    }
}
