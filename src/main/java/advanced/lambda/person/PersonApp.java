package main.java.advanced.lambda.person;

import java.util.List;

public class PersonApp {
    public static void main(String[] args) {
        PersonDatabase database = new PersonDatabase();
        List<Person> filteredByAge = database.search(person -> person.getAge() > 20);
        System.out.println(filteredByAge);
        List<Person> personsWithA = database.search(person -> person.getName().startsWith("A"));
        System.out.println(personsWithA);
    }
}