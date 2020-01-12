package main.java.designpatterns.src.designPatterns.probleme.zoo;

public abstract class Animal {
    String nume;
    public Animal(String nume) {
        this.nume = nume;
    }
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranire(){
        System.out.println("Animal " + nume + " este hranit");

    }

}
