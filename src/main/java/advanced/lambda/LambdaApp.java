package main.java.advanced.lambda;

public class LambdaApp {
    public static void main(String[] args) {
        Player player = new Player();
        player.run(() -> System.out.println("Playing song 1"));
        player.run(() -> System.out.println("Playing song 2"));
    }
}
