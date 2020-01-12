package main.java.advanced;

import java.util.ArrayList;
import java.util.List;

public class CollectionsApp {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(5);
        integers.add(3);
        integers.add(7);
        integers.add(8);
        for (Integer integer : integers) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }
}
