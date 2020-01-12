package main.java.array;

public class Tema {
    public static void main (String[]args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int s = 0;
        for (int i : a)
            s += i;
        for (int i:a);
        System.out.println("suma sirului este" + s);
        System.out.println(("media este" + s / a.length));
    }
     }