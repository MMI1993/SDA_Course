package main.java.advanced.ziua2.Collections;

import java.util.HashSet;
import java.util.Set;

public class SetApp { // Set extinde Collection, pastreaza unicitate si nu pastreaza ordinea.

    public static void main(String[] args) {
        Set<String> items= new HashSet<>();
        // in Set nu avem item-uri duplicate,
        //Set<String> items= new LinkedHashSet<>();// daca folosim LinkedHashSet se pastreaza si ordinea
        //Set<String> items= new TreeSet<>();
        // nu pastreaza ordinea
        items.add("Items 1");
        items.add("Items 1");
        items.add("Items 2");
        items.add("Items 3");
        items.add("Items 4");
        items.add("Items 5");
        items.add("Items 6");
        for(String item : items) {
           // if (item.startsWith("A")) {
            System.out.println(item);
            }
        }
    }
