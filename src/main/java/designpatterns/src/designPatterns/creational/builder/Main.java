package main.java.designpatterns.src.designPatterns.creational.builder;

public class Main {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder(); // pentru a crea un meal trebuie sa instantiem un meal builder.

        /**
         * Astfel putem avea o instanta de tipul Meal care sa contina un VegBurger si o apa.
         */
        Meal healthyMeal = mealBuilder.prepareHealthyMeal();

        /**
         * Astfel putem avea o instanta de tipul Meal care sa contina un MeatBurger si o Cola.
         */
        Meal nonHealthyMeal = mealBuilder.prepareNonHealthyMeal();

        System.out.println("Pret total healtyMeal: " + healthyMeal.getTotalCost());
        System.out.println("Pret total nonHealtyMeal: " + nonHealthyMeal.getTotalCost());
    }
}
