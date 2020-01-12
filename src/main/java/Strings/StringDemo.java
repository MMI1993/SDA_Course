package main.java.Strings;

public class StringDemo {
    public static void main(String[] args) {
        //length()
        String s="welcome";
        int len=s.length();// lungimea este mereu un int
        System.out.println(len);
        //concat() - join the string
        String s1="welcome";
        String s2="to selenium";
        System.out.println(s1+s2);
        System.out.println(s1 + " " +s2);
        System.out.println("welcome" + "to selenium");
        System.out.println(s1.concat(s2));
        System.out.println("welcome".concat("to selenium"));

        //trim()
        s= "   java programing   ";
        System.out.println(s);
        System.out.println(s.trim());

        //charAt()- index will start from 0
         s="welcome";
        System.out.println(s.charAt(5)); //m
        System.out.println(s.charAt(2));//l
        //contains() --> true/fals
        System.out.println(s.contains("come")); //true
        System.out.println(s.contains("abc")); //false
        //equals () & equalsIgnorCase
        s="welcome";
        System.out.println(s.equals("Welcome")); //true
        System.out.println(s.equals("welcome")); // false
        System.out.println(s.equalsIgnoreCase("Welcome"));
        System.out.println(s.equalsIgnoreCase("welcome"));
        //replace()
        s="welcome to java welcome to selenium";
        System.out.println(s.replace ('e','a'));
        System.out.println(s.replace("welcome","xyz"));

        //substring ()
        s="welcome";
        System.out.println(s.substring(2,4)); //lc
        System.out.println(s.substring(0,4));//welc

        //toLowerCase () & toUpperCase
        s="welcome";
        System.out.println(s.toLowerCase()); //welcome
        s="welcome";
        System.out.println(s.toUpperCase()); //WELCOME
        s="welCOME";
        System.out.println(s.toLowerCase());//welcome

    }
}
