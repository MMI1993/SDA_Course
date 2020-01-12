package main.java.designpatterns.src.designPatterns.probleme.increase;

public class AddNumber {
    public static String deMulteOri(int howManyTimes, int number) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= howManyTimes; i++) {
            for (int j = 1; j <= i; j++) {
                output.append(howManyTimes);
            }
            if (i != number)
                output.append(" + ");
        }
        return output.toString();
    }
}
