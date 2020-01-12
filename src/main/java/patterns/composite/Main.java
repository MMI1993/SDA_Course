package main.java.patterns.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> sefuSubordinates = new ArrayList<>();
        List<Employee> subordonati = new ArrayList<>();
        Employee subordonat = new Employee("Adrian", "Vanzari", Collections.emptyList());
        subordonati.add(subordonat);
        Employee subordonatu1 = new Employee("Vasile", "Vanzari", Collections.emptyList());
        Employee subordonatu2 = new Employee("Alex", "Vanzari", subordonati);
        sefuSubordinates.add(subordonatu1);
        sefuSubordinates.add(subordonatu2);
        Employee sef = new Employee("Marian", "Vanzari", sefuSubordinates);

        System.out.println(sef.getName() + " " + sef.getDep());
        for (Employee emp : sef.getSubordonates()) {
            System.out.println(emp.getName() + " " + emp.getDep());
            for (Employee emp1 : emp.getSubordonates()) {
                System.out.println(emp1.getName() + " " + emp1.getDep());
            }
        }
        }
    }

