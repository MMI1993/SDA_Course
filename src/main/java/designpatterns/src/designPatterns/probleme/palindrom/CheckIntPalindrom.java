package main.java.designpatterns.src.designPatterns.probleme.palindrom;

public class CheckIntPalindrom {
    public static boolean isPalindrom(int nr) {
        int reverse = 0;
        int initial= nr;
        while (nr > 0) {
            int ultima = nr % 10;
            reverse = reverse * 10 + ultima;
            nr=nr/10;
        }
        return  initial == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(100));
        System.out.println((isPalindrom(1001)));
        System.out.println(isPalindrom(203));
    }
}
