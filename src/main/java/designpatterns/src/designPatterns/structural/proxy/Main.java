package main.java.designpatterns.src.designPatterns.structural.proxy;

/**
 * Cu patternul proxy facem o clasa intermediara care actioneaza ca o interfata catre o alta clasa.
 *
 * Se poate folosi cand se vrea o versiune mai simplificata a altei clase
 * Se poate folosi cand vrem sa avem o versiune locala (in memorie) a unui obiect care nu se afla pe sistemul nostru sau
 * avem un obiect care consuma multe resurse si timp atunci cand il facem. De exemplu cand incarcam o poza de pe internet sau de pe disc
 * poate dura mult ca timp.
 */
public class Main {

    public static void main(String[] args) {
        Image imagineNunta = new ProxyImage("nunta.jpg");
        Image imaginePetrecere = new ProxyImage("petrecere");

        //Imaginea petrecere se incarca - dureaza 10 secunde
        imaginePetrecere.display();

        //Imaginea nunta se incarca - dureaza 10 secunde
        imagineNunta.display();

        //Imaginea nunta nu se mai incarca. A fost incarcata la primul apel al metodei display. O refolosim pe imaginea deja incarcata - nu mai dureaza 10 secunde
        imagineNunta.display();

        //Imaginea nunta nu se mai incarca. A fost incarcata la primul apel al metodei display. O refolosim pe imaginea deja incarcata - nu mai dureaza 10 secunde
        imagineNunta.display();

        //Imaginea nunta nu se mai incarca. A fost incarcata la primul apel al metodei display. O refolosim pe imaginea deja incarcata - nu mai dureaza 10 secunde
        imagineNunta.display();
    }
}
