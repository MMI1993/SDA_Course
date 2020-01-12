package main.java.designpatterns.src.problemaRelatieDeAsociere;

public class Persoana {

    private String nume;

    public Persoana(String nume) {
        this.nume = nume;
    }

    /**
     *  Prin aceasta metoda o persoana hraneste un caine. Aici se intampla relatia de asociere dintre cele doua clase (Persoana si Caine).
     *  Prin intermediul aceste metode apelam metoda "feed" din clasa Caine a carei instante o primim ca parametru in "hranesteCaine".
     */
    public void hranesteCaine(Caine caine) {
        caine.feed();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
