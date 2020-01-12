package main.java.Strings;

public class RegionMatch {
    public static void main(String[] args) {
        String first_str = "Welcome to Microsoft";
        String second_str= "I work with Microsoft";
        boolean match = first_str.regionMatches(11,second_str,12,9);
        System.out.println("first_str[11-19] == "+
                "second_str[12-24]: " + match); // arata ca se incepe de la toffset:11 ;i pentru second ca incepe de la 19 ;i adauga len 9(9 caractere).
    }  //afiseaza true/false
}
