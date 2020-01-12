package main.java.designpatterns.src.designPatterns.behavioral.templateMethod;

public class BasketGame extends Game {
    @Override
    void initialize() {
        System.out.println("Basket game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Basket game has started");
    }

    @Override
    void endPlay() {
        System.out.println("Basket game has finished");
    }
}
