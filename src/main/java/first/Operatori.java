package main.java.first;

public class Operatori {
    public static void main (String[] args){
        int a = 10;
        int b = 20;
        System.out.println("Sum : " + (a+b));
        System.out.println("Diff:" +(b-a));
        System.out.println("Multiply:" + (a*b));
        System.out.println("Div:" + (a/b));
        System.out.println("Mod Div:" + (a%b));
        System.out.println(a > b);
        System.out.println(b > a);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        boolean x= true;
        boolean y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        a=100;
        int resPost=a++;
        System.out.println(a);
        int resPre=++a;
        System.out.println(resPost);
        System.out.println(resPre);
        b=100;
        int resBPost=b--;
        System.out.println(b);
        int resBPre = --b;
        System.out.println(resBPost);
        System.out.println(resBPre);
        System.out.println("abc" instanceof String);
    }
}
