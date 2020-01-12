package main.java.advanced.lambda.person;

import java.util.ArrayList;
import java.util.List;

public class PersonDatabase {
    private final List<Person> persons = new ArrayList<>();
    PersonDatabase() {
        persons.add(new Person("Andrei", 10));
        persons.add(new Person("Nicu", 12));
        persons.add(new Person("Remus", 40));
        persons.add(new Person("Corina", 20));
        persons.add(new Person("Elena", 35));
    }
    public List<Person> search(PersonTester personTester) {
        List<Person> filtered = new ArrayList<>();
        for (Person person : persons) {
            if (personTester.test(person)) {
                filtered.add(person);
            }
        }
        return filtered;
    }
}