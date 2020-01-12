package main.java.designpatterns.src.designPatterns.behavioral.observer;

/**
 * Avem interfata observator care are o metoda de update care se apeleaza atunci cand subiectul face o anumita actiune sau isi schimba starea.
 */
public interface Observer {
    void update(String celebrityName, String facebookPost);
    String getName();
}
