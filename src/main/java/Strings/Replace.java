package main.java.Strings;

public class Replace { //gaseste ceea ce dorim si inlocuieste cu ceea ce vrem
    public static void main(String[] args) {
        String str="Hello World Hello Java";
        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replaceFirst ("He", "Wa"));
        System.out.println(str.replaceAll("He", "weEE"));
        System.out.println(str.replaceAll("He", ""));
    }
}
