package main.java.designpatterns.src.problemaRelatieDeAgregare;

/**
 * Avem relatia de asociere, agregare si compozitie intre clase.
 *
 * 1.Relatia de asociere dintre clasa A si clasa B este atunci cand A. (ex: un om hraneste un caine)
 * 2.Relatia de agregare dintre clasa A si clasa B este atunci cand B poate sa existe independent de A.
 *   Relatia este de tipul "has a". Spunem ca "A are un B".
 *   Agregarea este o forma speciala de asociere.
 *                                                  (ex: o persoana poate sa aibe o masina, dar masina poate
 *                                                  sa existe fara ca persoana respectiva sa existe. Spunem ca o persoana are o masina.
 *                                                   Daca persoana inceteaza sa existe masina inca exista.)
 * 3.Relatia de compozitie dintre clasa A si clasa B este atunci cand B nu poate sa existe fara existenta lui A.
 *   Relatia de compozitie este mai puternica decat cea de agregare. E o relatie de tipul "part-of", spunem ca "B is part of A".
 *   Compozitia este o forma speciala de asociere.
 *                                                  (ex: un om si o inima. Un om nu poate sa existe fara o inima,
 *                                                  dar nici inima nu poate sa existe fara om. Inima este parte din om.
 */
public class Main {

    public static void main(String[] args) {
        Persoana pers = new Persoana("Alin", 12);
        Masina bmw = new Masina("BMW");
        Persoana persCuMasina = new Persoana("Marian", 20, bmw);

        System.out.println(persCuMasina.getNume());
        System.out.println(persCuMasina.getMasina().getBrand());

        Masina jaguar = new Masina("Jaguar");
        persCuMasina.setMasina(jaguar);
        System.out.println(persCuMasina.getMasina().getBrand());

    }
}
