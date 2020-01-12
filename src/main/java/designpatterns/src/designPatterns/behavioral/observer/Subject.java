package main.java.designpatterns.src.designPatterns.behavioral.observer;

/**
 * Avem intervfata Subject care are 3 metode. O metoda de register pentru a inregistra un observator care sa urmareasca subiectul.
 * O metoda de unRegister pentru a elimina un observator care urmarea subiectul.
 * Si o notifyAllObservers pentru a notifica toti observatorii atasati subiectului respectiv.
 */
public interface Subject {

    void register(Observer fan);
    void unRegister(Observer fan);
    void notifyAllFans(String postText);
}
