package main.java.advanced.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAppThree {
    public static void main(String[] args) {
        List<Person> names = new ArrayList<>();
        names.add(new Person("Andrei"));
        names.add(new Person("Nicu"));
        names.add(new Person("Nicu"));
        names.add(new Person("Mircea"));
        names.add(new Person("Marius"));
        boolean isNicuHere = names
                .stream()
                .anyMatch(p -> p.getName().equals("Nicu"));
        System.out.println(isNicuHere);
        List<Person> allOfNicu = names.stream()
                .filter(p -> p.getName().equals("Nicu"))
                .collect(Collectors.toList());
        System.out.println(allOfNicu);
    }
}
