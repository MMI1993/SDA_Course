package main.java.designpatterns.src.designPatterns.behavioral.observer;

/**
 * Observer Pattern este folosit atunci cand avem o relatie one-to-many intre obiecete. Unul dintre obiecte este subiectul,
 * iar restul sunt observatori.
 * Cand subiectul face ceva sau isi schimba starea vreau ca observatorii lui sa fie notificati automat. In acest fel observatorii pot sa faca si ei ceva
 * in functie de ce a facut subiectul.
 *
 * In cazul de fata avem o clasa Celebritate si o clasa Fan. O celebritate are o lista de fani care o urmaresc pe o anumita retea de socializare.
 * Cand celebritatea posteaza ceva pe reteaua de socializare toti fanii ei sunt notificati ca celebritatea pe care o urmaresc a postat un mesaj.
 */
public class Main {

    public static void main(String[] args) {
        Celebritate cel = new Celebritate("Andreea Esca");
        Celebritate cel2 = new Celebritate("Eminem");

        Fan fanRobert = new Fan("Robert");
        Fan fanAlex = new Fan("Alex");

        cel.register(fanRobert);
        cel.register(fanAlex);
        cel2.register(fanAlex);

        cel.postOnFacebook("Mesaj celebritate");

        System.out.println();

        cel2.postOnFacebook("Mesaj  1");
    }
}
