package main.java.designpatterns.src.designPatterns.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<>();

    /**
     * Prin aceasta metoda adaugam un nou pentru un anume meal.
     */
    public void addItem(Item item) {
        items.add(item);
    }

    /**
     * Metoda prin care returnam costul total. Parcurgem lista "items" si luam pretul fiecareia in parte.
     */
    public double getTotalCost() {
        double totalCost = 0;

        for (Item item : items)
            totalCost += item.price();

        return totalCost;
    }
}
