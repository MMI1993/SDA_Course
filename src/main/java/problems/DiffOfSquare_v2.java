package main.java.problems;

public class DiffOfSquare_v2 {
    public static void main(String[] args) {
        System.out.println(sumaNr(10));
        System.out.println(sumSquares(10));
        System.out.println(sumaNr(10) - sumSquares(10));
    }
    public static int sumaNr(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum +=i;
        }
        return sum*sum;
    }
    public static int sumSquares(int n) {
        int sum1 = 0;
        for (int i = 0; i <=n ; i++) {
            sum1+= i*i;
        }
        return sum1;
    }
}
