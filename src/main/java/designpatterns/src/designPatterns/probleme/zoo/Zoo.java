package main.java.designpatterns.src.designPatterns.probleme.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    private int price;
    List<Om> Om = new ArrayList<>();
    List<Animal> Animal = new ArrayList<>();

    public Zoo(String nume, int price) {
        this.nume = nume;
        this.price= price;
    }

    public void addOm(Om om) {
       if(om.getBani()>= price) {
           Om.add(om);
           System.out.println("om nou adaugat");
       }
        System.out.println("nu ai suficienti bani");
    }

    public void removeOm(Om om) {
        Om.remove(om);
    }

    public void addAnimal(Animal animal) {
        Animal.add(animal);
    }

    public void removeAnimal(Animal animal) {
        Animal.remove(animal);
    }
}
