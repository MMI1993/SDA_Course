package main.java.designpatterns.src.designPatterns.behavioral.templateMethod;

public class FootballGame extends Game {
    @Override
    void initialize() {
        System.out.println("Football game initialized");
    }

    @Override
    void startPlay() {
        System.out.println("Football game has started");
    }

    @Override
    void endPlay() {
        System.out.println("Football game has finished");
    }
}
