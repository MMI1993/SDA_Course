package main.java.problems;

import static java.lang.Math.pow;

public class Armstong {
    public static void main(String[] args) {
        System.out.println(isAmstrongNumberVar1(153));
    }
    static boolean isAmstrongNumberVar1 (int numberToCheck){
        String numberToCheckString = numberToCheck + "";
        int howManyDigits= numberToCheckString.length();
        int sum=0;
        for (int i=0; i<howManyDigits; i++) {
            sum += (int) pow ((double) Character.getNumericValue(numberToCheckString.charAt(i)),
                    (double) howManyDigits); // pow- ridicare la putere.
        }
        return (sum== numberToCheck);
    }
}
