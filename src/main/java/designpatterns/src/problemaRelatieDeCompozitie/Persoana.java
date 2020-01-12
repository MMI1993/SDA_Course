package main.java.designpatterns.src.problemaRelatieDeCompozitie;

public class Persoana {

    private String nume;
    private Inima inima;

    public Persoana(String nume) {
        this.nume = nume;
        /**
         * Tot timpul cand instantiem o persoana se instantiaza si o inima care se atribuie persoanei respective in atributul "inima".
         * Daca persoana dispare atunci dispare si inima instantiata odata cu ea.
         */
        this.inima = new Inima();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Inima getInima() {
        return inima;
    }
}
