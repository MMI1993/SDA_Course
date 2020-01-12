package main.java.designpatterns.src.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Celebritate implements Subject {

    private String name;
    private List<Observer> fans;

    public Celebritate(String name) {
        this.fans = new ArrayList<>();
        this.name = name;
    }

    public void postOnFacebook(String postMessage) {
        System.out.println("Celebritate posteaza pe FB: " + postMessage);
        notifyAllFans(postMessage);
    }

    @Override
    public void register(Observer fan) {
        fans.add(fan);
        System.out.println(name + ": Welcome " + fan.getName());
    }

    @Override
    public void unRegister(Observer fan) {
        fans.remove(fan);
        System.out.println("Bye! :(");
    }

    @Override
    public void notifyAllFans(String postText) {
        for (Observer fan: fans) {
            fan.update(name, postText);
        }
    }
}
