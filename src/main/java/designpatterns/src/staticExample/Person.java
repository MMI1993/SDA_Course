package main.java.designpatterns.src.staticExample;

public class Person {

    private String name;

    /**
     * O variabila statica apartine clasei si nu unei instante (O singura copie e impartita intre toate instantele clasei).
     * Variabilele statice sunt initializate o singura data, la inceputul executiei.
     * O variabila statica poate fi accesata direct cu numele clasei. Nu este nevoie de un obiect (instanta a clasei)
     * Pentru ca este o singura copie a variabilei statice este impartita intre toate instantele clasei, atunci
     * aceasta variabila are aceeasi valoare pentru toate instantele.
     */
    private static int count = 0;

    public Person(String name) {
        count++; // la fiecare instantiere variabila statica count se incrementeaza cu 1 pentru ca in acest caz vrem sa avem un numar al tuturor persoanelor create
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * O metoda statica poate accesa doar variabile statice sau poate apela doar alte metode statice.
     * O metoda statica poate fi accesata pe numele clasei si nu are nevoie de un obiect (instanta a clasei)
     * O metoda statica nu poate folosi "this" sau "super"
     *
     * ex: Person.getCount()   - am apelat metoda cu ajutorul clasei "Person" fara a avea o instanta a acestei clase
     */
    public static int getCount() {
        return count;
    }
}
