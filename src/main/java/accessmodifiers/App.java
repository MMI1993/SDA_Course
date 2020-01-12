package main.java.accessmodifiers;

import main.java.accessmodifiers.world.Plant;

public class App {
    public static void main(String[]args){
        Plant plant= new Plant();
        System.out.println(plant.name);
        System.out.println(plant.ID);
        /*System.out.println(plant.type);
        System.out.println(plant.size);
        System.out.println(plant.height);*/
    }
}
