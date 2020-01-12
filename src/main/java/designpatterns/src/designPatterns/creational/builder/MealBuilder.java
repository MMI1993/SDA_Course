package main.java.designpatterns.src.designPatterns.creational.builder;

/**
 * Cu ajutorul Builder patternului putem construi obiecte complexe folosind obiecte simple. Practic asamblam un obiect complex din partile lui componente.
 *
 * In cazul de fata asamblam un healthyMeal si un nonHealthyMeal cu partile lor componente.
 * healthyMeal e format dintr-un vegBurger si un Water
 * nonHealthyMeal e format dintr-un MeatBurger si un Cola
 *
 * Pentru a crea cele doua tipuri de Meal-uri oferim cele doua metode: "prepareHealthyMeal()" si "prepareNonHealthyMeal()"
 * Folosind acest pattern ascundem complexitatea de construire a obiectelor dorite.
 * Cel care foloseste builderul doreste sa creeze un HealthyMeal sau un NonHealthyMeal fara a trebui sa stie cum se formeaza acestea.
 */
public class MealBuilder {

    public Meal prepareHealthyMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Water());

        return meal;
    }

    public Meal prepareNonHealthyMeal() {
        Meal meal = new Meal();
        meal.addItem(new MeatBurger());
        meal.addItem(new Cola());

        return meal;
    }
}
