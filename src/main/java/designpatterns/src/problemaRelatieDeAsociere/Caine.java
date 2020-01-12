package main.java.designpatterns.src.problemaRelatieDeAsociere;

public class Caine {

    private String nume;

    public Caine(String nume) {
        this.nume = nume;
    }

    /**
     * Prin aceasta metoda un caine poate fi hranit.
     */
    public void feed() {
        System.out.println("Cainele: " + nume + " primeste de mancare");
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
