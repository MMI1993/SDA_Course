package main.java.designpatterns.src.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Patternul composite compune obiecte pentru a forma structuri sub forma de arbore.
 *
 * Pentru a implementa acest pattern trebuie sa avem o clasa care contine un grup cu obiecte de acelasi tip ca si clasa.
 * Aceasta clasa ne ofera modalitati de a modifica acest grup de obiecte.
 */
public class Employee {

    private String name;
    private String dep;
    private List<Employee> subordinates;

    /**
     *  Am implementat doi constructori pentru ca vrea sa pot crea mai usor un Employee care nu are nici un subordonat.
     *  Pentru un Employee care nu are nici un subordonat fac o lista goala atunci cand acesta se instantiaza.
     *
     *  Ulterior la un Employee care nu are nici un subordonat ii pot adauga un subordonat prin metoda addSubordinate.
     */
    public Employee(String name, String dep) {
        this.name = name;
        this.dep = dep;
        subordinates = new ArrayList<>();
    }

    public Employee(String name, String dep, List<Employee> subordinates) {
        this.name = name;
        this.dep = dep;
        this.subordinates = subordinates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(List<Employee> subordinates) {
        this.subordinates = subordinates;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }
}
