package main.java.patterns.templateMethod;

public class FootballGame extends Game{
    @Override
    void initialize() {
        System.out.println("footballGame was initialize");
    }

    @Override
    void startPlay() {
        System.out.println("Football start ");
    }

    @Override
    void endPlay() {
        System.out.println("Football has been finished");
    }
}
