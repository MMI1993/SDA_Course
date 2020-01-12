package main.java.inheritance_mostenire;

public class Main {
    public static void main(String[]args){
        Animal animal= new Animal("Animal", 1,1,5,5);
        Dog dog= new Dog("Viszla", 7,20,2,4,1,25,"short silky");
        dog.eat();
        dog.walk();
        dog.run();
        Fish fish= new  Fish("Nemo", 2,3,2,2,6);
        fish.swim(3);
        fish.move(5);
        fish.eat();
    }
}
