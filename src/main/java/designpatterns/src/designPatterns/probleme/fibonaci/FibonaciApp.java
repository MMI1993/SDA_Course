package main.java.designpatterns.src.designPatterns.probleme.fibonaci;

public class FibonaciApp {
        public static void main(String[] args) {
            System.out.println(getNrFib(6));
            System.out.println(fibonacci(6));
        }
        public static int getNrFib(int x) {
            int[] Fib = new int[x + 1];
            Fib[0] = 0;
            Fib[1] = 1;
            for (int j = 2; j < x; j++) {
                Fib[j] = Fib[j - 2] + Fib[j - 1];
            }
            return Fib[x - 1];
        }
        public static int fibonacci(int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 0;
            else if (n == 2)
                return 1;
            else
                return fibonacci(n - 2) + fibonacci(n - 1);
        }


    }