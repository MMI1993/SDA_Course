package main.java.staticExample;

public class Person {
    private String Name;
    private static int count=0;

    public Person(String name) {
        count++;
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
}
