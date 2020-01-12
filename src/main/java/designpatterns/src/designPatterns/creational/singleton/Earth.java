package main.java.designpatterns.src.designPatterns.creational.singleton;

/**
 * Singleton este un Design Pattern creational.
 * Singleton ne permite crearea unei singure instante a acelei clase. In acest caz 'Earth'.
 */
public class Earth {
    /**
     * Ne trebuie o variabila catre aceeasi clasa pentru a putea tine instanta pe care o facem si tot timpu sa o reutilizam pe aceeasi cand cineva apeleaza metoda 'getInstance()'
     * Initial referinta catre clasa insasi este nula.
     */
    private static Earth instance = null;

    /**
     * Constructorul trebuie sa fie private pentru ca aceasta clasa sa nu poata fie instantiata de oriunde, ci doar din interiorul acesteia
     */
    private Earth(){
        try {
            Thread.sleep(10000); // Prin Thread.sleep(10000) simulam ca instantierea unui obiect de tip Earth dureaza 10 secunde
            System.out.println("Earth has been created");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metoda getInstance() este metoda care creeaza o instanta de tip Earth daca nu a fost creata deja sau o returneaza pe cea creata anterior.
     * Metoda getInstance() este statica deoarece vrem sa o apelam fara a avea o instanta de tipul 'Earth'.
     * Daca metoda getInstance() nu este declarata ca statica nu putem sa o apelam niciodata deoarece constructorul nostru este privat => deci nu putem face instance de tip 'Earth' din afara clasei 'Earth'
     */
    public static Earth getInstance() {
        // in cazul in care fieldul 'instance' nu a fost initializat, facem o noua instanta de tipul Earth, daca avem deja un obiect de tipul Earth in variabila 'instance' o returnam pe aceea
        if (instance == null)
            instance = new Earth();

        return instance;
    }
}
