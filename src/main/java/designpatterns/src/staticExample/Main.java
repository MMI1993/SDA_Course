package main.java.designpatterns.src.staticExample;

public class Main {

    public static void main(String[] args) {
        System.out.println(Person.getCount());

        Person pers = new Person("Alin");
        System.out.println(Person.getCount());
        System.out.println(pers.getCount());


        System.out.println();
        Person pers2 = new Person("Andreea");
        System.out.println(pers.getCount());
        System.out.println(pers2.getCount());

    }
}
