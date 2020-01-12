package main.java.designpatterns.src.designPatterns.structural.decorator;

/**
 * Acest factory pattern nu face parte din Decorator. Este aici doar pentru a demonstra faptul ca putem utiliza doua patternuri in acelasi timp.
 *
 * Pentru mai multe detalii despre Factory method pattern vezi exemplul pentru Factory method pattern.
 */
public class BauturaFactory {

    public Bautura createBautura(String tipBautura) {
        if (tipBautura.equals("dublu"))
            return new Lapte(new Lapte(new Cafea()));
        if (tipBautura.equals("frisca"))
            return new Frisca(new Cafea());
        if (tipBautura.equals("friscaLapte"))
            return new Frisca(new Lapte(new Cafea()));

        return null;
    }
}
