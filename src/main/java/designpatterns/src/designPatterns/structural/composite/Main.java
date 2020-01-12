package main.java.designpatterns.src.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> sefuSubordinates = new ArrayList<>();
        List<Employee> subordonati = new ArrayList<>();

        // pot crea un Employee fara nici un subordonat pasandui constructorului o lista goala
        Employee subordonat = new Employee("Adrian", "Vanzari", Collections.emptyList());

        subordonati.add(subordonat);

        // pot crea un Employee fara nici un subordonat folosind constructorul care nu un parametru de tipul lista pentru a pasa lista de subordonati
        Employee subordonatu1 = new Employee("Vasile", "Vanzari");
        Employee subordonatu2 = new Employee("Alex", "Vanzari", subordonati);

        sefuSubordinates.add(subordonatu1);
        sefuSubordinates.add(subordonatu2);

        Employee sef = new Employee("Marian", "Vanzari", sefuSubordinates);


        System.out.println(sef.getName() + " " + sef.getDep());

        for (Employee emp : sef.getSubordinates()) {
            System.out.println(emp.getName() + " " + emp.getDep());

            for (Employee emp1 : emp.getSubordinates()) {
                System.out.println(emp1.getName() + " " + emp1.getDep());
            }
        }
    }
}
