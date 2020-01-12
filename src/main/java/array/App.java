package main.java.array;

import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[]args) {
        String[] namesVar1 = {"Adam", "Kevin", "Joe", "Daniel", "Steven"};
        String[] namesVar2 = new String[3];
        namesVar2[0] = "Kevin";
        namesVar2[1] = "Joe";
        namesVar2[2] = "Adam";
        int[] numbers = {1, 5, 3, -2, 10, 8};
        for (int i = 0; i <= namesVar1.length - 1; i++) {
            System.out.println(namesVar1[i]);
        }
        Collections.sort(Arrays.asList(namesVar1));
        Arrays.sort(numbers);
        for (int i = 0; i <= namesVar1.length - 1; i++) {
            System.out.println(namesVar1[i]);
        }
        Collections.sort(Arrays.asList(namesVar2));
        Arrays.sort(numbers);
        for (Integer i: numbers) {
            System.out.println(i);
        }
        for (String name: namesVar1){
            System.out.println(name);
        }
        }
    }
