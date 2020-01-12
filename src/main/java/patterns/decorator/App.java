package main.java.patterns.decorator;

public class App {
    public static void main(String[] args) {
        Drink coffee=new Coffee();
        Drink coffeeWithMilk=new Milk(new Coffee());
        System.out.println(coffee.decorate());
        System.out.println(coffeeWithMilk.decorate());
        Drink drink3=new Frisca(new Milk(new Coffee()));
        System.out.println(drink3.decorate());
    }
}
