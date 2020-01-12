package main.java.Strings;

public class Strfun {
    public static void main(String[] args) {
        String s = "Hello ";
        String s1 = "This world is crazy";
        String [] temp = s1.split("\\s");
        s = s.concat("marinela");
        System.out.println(s);
        System.out.print("  ");
        for (int i = 0; i < temp.length ; i++) {
            System.out.println(temp[i]);
            System.out.println("  ");
        }
    }
    }
