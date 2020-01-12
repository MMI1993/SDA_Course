package main.java.designpatterns.src.designPatterns.creational.factoryMethod;


import java.util.Date;

/**
 * Factory method pattern este un pattern creational.
 * Acest pattern ne permite o modalitate foarte buna de a crea noi obiecte.
 * Prin intermediul acestui pattern ascundem logica de creare de cel care vrea sa creeze obiectul si oferim o interfata
 * comuna pentru a crea tipurile de obiecte dorite.
 *
 * Metoda getShape(nrLaturi) ne returneaza tot timpul o forma geometrica cu numarul de laturi respectiv, dar fiecare latura are o dimensiune aleatorie si se ataseaza formei respective data in care a fost creata.
 * In acest caz interfata comuna este metoda getShape careia ii dam parametru numarul de laturi al formei pe care vrem sa o instantiem.
 * Noi ascundem logica de creare. Logica de creare in cazul asta generarea laturilor si crearea datei curente dupa care le pasam constructorului.
 *
 * Observam ca daca cel care vrea o forma care sa aibe laturile cu valori aleatoare si in care data sa fie data in care
 * a fost creata forma trebuie sa foloseasca metoda getShape (si pentru triunghi si pentru patrat, nu trebuie sa stie de numarul de parametrii pe care sa ii trimita constructorului)
 */
public class FactoryMethod {

    public Shape getShape(int nrLaturi) {
        if (nrLaturi == 3) {
            double latura1 = Math.random();
            double latura2 = Math.random();
            double latura3 = Math.random();
            Date creationDate = new Date();

            new Triangle(latura1, latura2, latura3, creationDate);
        } else if (nrLaturi == 4) {
            double latura1 = Math.random();
            double latura2 = Math.random();
            Date creationDate = new Date();

            new Rectangle(latura1, latura2, creationDate);
        }

        return null;
    }
}
