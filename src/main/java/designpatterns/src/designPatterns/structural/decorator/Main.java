package main.java.designpatterns.src.designPatterns.structural.decorator;

/**
 * Patternul decorator ne ofera posibilitatea de a adauga o functionalitate nou unui obiect deja existent fara a altera
 * structura acestuia.
 *
 * Acest pattern creaza o clasa decorator care wrapuie (inveleste) clasa originala (clasa pe care vrem sa o decoram) si astfel
 * adaugam un nou comportament unei clase fara a modifica cod din clasa respectiva.
 */
public class Main {
    public static void main(String[] args) {
        BauturaFactory fact = new BauturaFactory();

        // Cafea creata cu ajutorul patternului Factory Method Pattern
        Bautura cafeaDubluLapte2 = fact.createBautura("dublu");

        // Cafea creata fara factory
        Bautura cafea = new Cafea();
        Bautura cafeaCuLapte = new Lapte(new Cafea());
        Bautura cafeaDubluLapte = new Lapte(new Lapte(new Cafea()));
        Bautura cafeaDubluLapteFrisca = new Frisca(new Lapte(new Lapte(new Cafea())));

        System.out.println(cafea.decorate());
        System.out.println(cafeaCuLapte.decorate());
        System.out.println(cafeaDubluLapteFrisca.decorate());
    }
}
