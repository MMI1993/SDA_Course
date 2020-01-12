package main.java.colectii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AppArrayListLinkedList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    private static void doTimings(String type, List<Integer> list) {
        long startAtEnd = System.currentTimeMillis();
        //add items at end of list
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long endAtEnd = System.currentTimeMillis();
        System.out.println("Time taken fo add at end of list" + (endAtEnd - startAtEnd) + "ms for" + type);

        long startAtRandom = System.currentTimeMillis();
        //add items elsewhere in list
        for (int i = 0; i < 1E5; i++) {
list.add(100, i);
        }
        long endAtRandom= System.currentTimeMillis();
        System.out.println("Time taken for add at index : "+ (endAtRandom - startAtRandom) + " ms for " + type);
    }
}
