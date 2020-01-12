package main.java.problems;

public class DifferenceOfSquares {
    public static void main(String[] args) {
        int s = 0;
        int s1 = 0;
        for (int i = 0; i <= 10; i++) {
            s += i;
            s1 += i;
        }
        System.out.println("suma " + s);
        System.out.println(("squares" + s * s));
        System.out.println("suma " + s1);
        System.out.println(("squares" + s1 * s1));
    }
}