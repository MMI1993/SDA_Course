package main.java.designpatterns.src.designPatterns.behavioral.observer;

public class Fan implements Observer {

    private String name;

    public Fan(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    /**
     *
     */
    @Override
    public void update(String celebrityName, String facebookPost) {
        System.out.println(name + ": " + celebrityName + " has posted on FB " + facebookPost);
    }
}
