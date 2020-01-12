package main.java.designpatterns.src.designPatterns.structural.proxy;

public class ProxyImage implements Image {

    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    public RealImage getRealImage() {
        return realImage;
    }

    // Metoda proxyului care face o noua imagine daca ea nu este incarcata deja in memorie si apoi o afiseaza.
    // in cazul in care imaginea este incarcata deja, nu o mai incarca si o afiseaza.
    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(filename);

        realImage.display();
    }
}
