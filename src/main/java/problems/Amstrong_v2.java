package main.java.problems;

import static java.lang.Math.pow;

public class Amstrong_v2 {
    public static void main(String[] args) {
        System.out.println(isArmstrongNumberVa2(155));
    }
    public static boolean isArmstrongNumberVa2(int numberToCheck){
        double sum=0;
        String numStr=Integer.toString(numberToCheck);
        for (Integer i=0; i< numStr.length(); i++) {
            String num = numStr.substring(i, i + 1);
            sum += pow(Integer.parseInt(num), numStr.length());
        }
        return sum== numberToCheck;
    }
}

