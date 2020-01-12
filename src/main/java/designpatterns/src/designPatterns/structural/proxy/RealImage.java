package main.java.designpatterns.src.designPatterns.structural.proxy;

public class RealImage implements Image {

    private String filename;

    public RealImage(String filename) {
        loadFromDisk(filename);
        this.filename = filename;
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
        try {
            Thread.sleep(10000); // Prin Thread.sleep(10000) simulam ca crearea unei imagini dureaza 10 secunde.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void display() {
        System.out.println("Displaying image:" + filename);
    }
}
