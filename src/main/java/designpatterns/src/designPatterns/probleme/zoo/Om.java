package main.java.designpatterns.src.designPatterns.probleme.zoo;

public class Om {
   private String nume;
    private int bani;



    public Om(String nume, int bani) {
        this.nume = nume;
        this.bani= bani;
    }

    public String getNume() {
        return nume;
    }
    public int getBani() {
        return bani;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranire(Animal animal){
        animal.hranire();
    }
}
