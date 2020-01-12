package main.java.array;

public class Temathree {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : a) {
            if (i % 2 == 0) {
                System.out.println("Number is Even " + i);
            } else {
                System.out.println("Number is Odd " +i);
            }
        }
    }
}