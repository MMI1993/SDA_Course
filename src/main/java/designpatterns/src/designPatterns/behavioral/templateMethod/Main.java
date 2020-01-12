package main.java.designpatterns.src.designPatterns.behavioral.templateMethod;

/**
 * Template method pattern este un pattern behavioral.
 * In acest pattern o clasa abstracta expune o modalitate in care sa se execute celalalte metode ale ei.
 * In cazul nostru clasa abstracta este "Game" in care avem 3 metode abstracte si metoda "play()" in care sunt apelate
 * intr-o anumita ordine celalalte 3 metode ale clasei. In acest caz metoda "play()" este metoda template.
 *
 * In cazul acesta pentru a juca un joc, jocul mai intai trebuie initializat (metoda initialize),
 * dupa care incepe (metoda startPlay) si dupa care se termina (metoda endPlay).
 * Daca metodele respective s-ar apela intr-o ordine diferita, nu ar mai face sens. De aceea am definit o metoda template care sa apeleze cele 3 metode in ordinea care face sens.
 *
 * Deci pentru a putea da startPlay mai intai trebuie sa se initializeze jocu, iar pentru a putea da endPlay trebuie mai intai sa se dea startPlay.
 * Deci cele trei metode sunt dependente una de executia celeilalte.
 */
public class Main {

    public static void main(String[] args) {
        Game basketGame = new BasketGame();
        Game footballGame = new FootballGame();

        basketGame.play();
        footballGame.play();
    }
}
