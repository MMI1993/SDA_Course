package main.java.advanced.ziua2.Collections.Car;

public class Car implements Comparable<Car> {
    private final int horsePower;
    public Car(int horsePower) {
        this.horsePower = horsePower;
    }
    public int getHorsePower() {
        return horsePower;
    }
    @Override
    public String toString() {
        return "Car{" +
                "horsePower=" + horsePower +
                '}';
    }
    @Override
    public int compareTo(Car car) {
        if (horsePower == car.getHorsePower()) {
            return 0;
        } else if (horsePower < car.getHorsePower()) {
            return 1;
        } else {
            return -1;
        }
    }
}