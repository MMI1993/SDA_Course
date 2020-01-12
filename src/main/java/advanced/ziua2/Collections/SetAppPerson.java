package main.java.advanced.ziua2.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetAppPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Nume", 30);
        Person p2 = new Person("Nume", 30);
        Set<Person> persons = new HashSet<>();
        persons.add(p1);
        persons.add(p2);
        System.out.println(persons.size());

    }
}
