package main.java.designpatterns.src.problemaRelatieDeAgregare;

public class Persoana {
    private String nume;
    private int varsta;

    /**
     * O persoana poate avea sau nu o masina. Pentru asta am declarat un atribut de tipul Masina in interiorul clasei Persoana.
     * O astfel de relatie se numeste "Agregare". Agregarea este o relatie in care masina (in cazul asta) poate sa existe independent de persoana (in cazul asta).
     * Masina poate sa existe fara sa aibe un proprietar, in cazul asta fara sa fie atribuita unei persoane.
     * Asta inseamna ca putem face 'new Masina("numeBrand")' fara a avea instantiata o persoana.
     */
    private Masina masina;

    /**
     * Am implementat doi constructori pentru ca vreau sa am posibilitatea sa instantiez persoane care nu au masina.
     * Pentru a instantia o persoana care nu are o masina atribuita lui se apeleaza constructorul cu parametrii 'nume' si 'varsta'
     * Pentru a instntia o persoana care are o masina atribuita lui se apeleaza constructorul cu parametrii 'nume', 'varsta' si 'masina'
     *
     * ex: new Persoana("Alin", 20);  - Astfel instantiem o persoana care are numele Alin si varsta de 20 de ani, dar care nu are masina
     *
     * Pentru a instantia o persoana care are masina ne trebuie si o instanta de masina pe care sa o pasam constructorului
     * ex: Masina dacia = new Masina("Dacia");
     *     Persoana persoanaCuDacia = new Persoana("Andreea", 22, dacia) - astfel am instantiat o persoana pe nume Andreea
     *                                                                      de 22 de ani si care are o masina Dacia. Masina Dacia
     *                                                                      am stocato in variabila numita 'dacia'
     *
     */
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public Persoana(String nume, int varsta, Masina masina) {
        this.nume = nume;
        this.varsta = varsta;
        this.masina = masina;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Masina getMasina() {
        return masina;
    }

    public void setMasina(Masina masina) {
        this.masina = masina;
    }
}
