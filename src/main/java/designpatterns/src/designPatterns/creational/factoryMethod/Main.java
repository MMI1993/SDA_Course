package main.java.designpatterns.src.designPatterns.creational.factoryMethod;

public class Main {

    public static void main(String[] args) {
        FactoryMethod shapeWithRandomValuesFactory = new FactoryMethod(); //Pentru a putea crea forme care sa aibe laturile aleatoare si data in care au fost create trebuie sa instantiem FactoryMethodul care se ocupa de instantierea masinilor de acest fel.

        Shape triangle = shapeWithRandomValuesFactory.getShape(3); // pentru a crea un triunghi apela metoda getShape cu parametrul 3. Aceasta ne va returna de fiecare data un triunghi cu laturi aleatoare si cu data in care a fost creat.
        Shape rectangle = shapeWithRandomValuesFactory.getShape(4); // pentru a crea un dreptunghi apelam metoda getShape cu parametrul 4. Aceasta ne va returna de fiecare data un dreptunghi cu laturile aleatoare si cu data in care a fost creat.
    }
}
