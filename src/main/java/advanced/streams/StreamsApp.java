package main.java.advanced.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApp {
        public static void main(String[] args) {
            List<String> names = new ArrayList<>();
            names.add("Andrei");
            names.add("Nicu");
            names.add("Mircea");
            names.add("Marius");
            List<String> filters = new ArrayList<>();
            for (String name : names) {
                if (name.startsWith("M")) {
                    filters.add(name);
                }
            }
            List<Person> persons = new ArrayList<>();
            for (String filter : filters) {
                persons.add(new Person(filter));
            }
            List<Person> f = names.stream()
                    .filter(item -> item.startsWith("M"))
                    .map(item -> new Person(item))
                    .collect(Collectors.toList());
            System.out.println(f);
        }
    }


