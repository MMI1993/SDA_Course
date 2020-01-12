package main.java.Probleme;

import java.util.ArrayList;
import java.util.List;

/*
Given a string of digits, output all the contiguous substrings of
length n in that string in the order that they appear.
For example, the string "49142" has the following 3-digit series:
"491"
"914"
"142"
And the following 4-digit series:
"4914"
"9142"
And if you ask for a 6-digit series from a 5-digit string,
you deserve whatever you get.
 */
public class ProblemaIntN {
    public static List<String> smr(String str, int n) throws ExceptieP4 {
        List<String>list=new ArrayList<>();
        int i = 0;
        if (str.length() < n) {
            throw new ExceptieP4("n prea mare");
        }
        if (n < 0) {
            throw new ExceptieP4("n prea mic");
        }
        while (i < str.length() - (n - 1)) {
            list.add(str.substring(i, n + i));
            i = i + 1;
        }
        return list;
    }
    public static void main(String[] args) throws ExceptieP4 {
        System.out.println(smr("48142", 2));
    }
}
