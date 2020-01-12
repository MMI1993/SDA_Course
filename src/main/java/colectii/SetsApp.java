package main.java.colectii;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsApp {
    public static void main(String[] args) {

        //Set<String> set1 = new HashSet<>();

        //Set<String> set1= new LinkedHashSet<>();

        Set<String> set1= new TreeSet<>();
        if (set1.isEmpty()) {
            System.out.println("Set is empty at start");
        }
        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");
        if (set1.isEmpty()) {
            System.out.println("Set is empty after adding (no!)");
        }
        set1.add("mouse");
        System.out.println(set1);
        // iteration
        for (String element : set1) {
            System.out.println(element);
        }
        if (set1.contains("aardvark")) {
            System.out.println("contains aardvark");
        }
        if (set1.contains("cat")) {
            System.out.println("Contains cat");
        }
        Set<String> set2 = new TreeSet<>();
        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");
        Set<String> intersectation = new HashSet<>(set1);
        intersectation.retainAll(set2);
        System.out.println(intersectation);
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);
    }
}

