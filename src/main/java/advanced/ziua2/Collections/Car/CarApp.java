package main.java.advanced.ziua2.Collections.Car;

import java.util.Set;
import java.util.TreeSet;

public class CarApp {
    public static void main(String[] args) {
        Set<Car> cars = new TreeSet<>();
        cars.add(new Car(100));
        cars.add(new Car(50));
        cars.add(new Car(35));
        cars.add(new Car(150));
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}