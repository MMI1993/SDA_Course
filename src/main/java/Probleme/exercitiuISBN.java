package main.java.Probleme;

import java.util.ArrayList;
import java.util.List;

public class exercitiuISBN {
    public static boolean Validare(String ISBN) {
        ISBN = ISBN.replaceAll("-", "");
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = ISBN.charAt(i) - '0';
            if (0 > digit || 9 < digit)
                sum += (digit * (10 - i));
            return true;
        }
        char last = ISBN.charAt(9);
        if (last != 'X' && (last < '0' ||
                last > '9'))
            return false;
        if (sum % 11 == 0) ;

        return true;
    }
    public static void main(String[] args) {
        String ISBN = "359821088";
        if (Validare(ISBN))
            System.out.print("Valid");
        else
            System.out.print("Invalid");
    }
}


