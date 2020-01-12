package main.java.Strings;

public class LastIndex {
    public static void main(String[] args) {
        String str0riginal = "Hello world, Hello Reader";
        int lastIndex = str0riginal.lastIndexOf("Hello");//returneaza ultima pozitie in case se afla cuvantul hello in string-ul nostru
        if (lastIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("Last occurrence of Hello" + " is at index " + lastIndex);
        }
        String string2 = "abssss Hello world, Hello Reader";
        int intIndex = string2.indexOf("Hello");// indexOf - returneaza prima pozitie in case se afla cuvantul hello in string-ul nostru
        if (intIndex == -1) {
            System.out.println("Hello not found");
        } else {
            System.out.println("First occurrence of Hello" + " is at index " + intIndex);
        }
    }
}
