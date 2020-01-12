package main.java.Strings;

public class Hello {
    public static void main(String[] args) {
        String input = "marinela";
        char[] try1=input.toCharArray();
        for (int i=try1.length-1; i>=0; i--) //se parcurge invers de la length (se merge de la mare la mic, --); pentru a parcurge de la inceput la final se foloseste <=; i++)
           // (daca nu pui -1 nu parcurge primul caracter (ex M de la marinela)
            System.out.println((try1[i]));
    }
}
