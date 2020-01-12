package main.java.advanced;

import java.util.ArrayList;
import java.util.List;

//Create a shopping list. Add items in the shopping list if they don't exist (List has a indexOf method to check if the item is in the List).
//Create a program that will list the items in the shopping list
public class ShoppingList {
    private final List<String> items = new ArrayList<>();

    public void add(String item) {
        if (items.indexOf(item) == -1) {
            items.add(item);
        }
    }

    public void display() {
        System.out.println(items);
    }
}
