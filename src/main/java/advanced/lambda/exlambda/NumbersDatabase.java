package main.java.advanced.lambda.exlambda;

import java.util.ArrayList;
import java.util.List;

public class NumbersDatabase {
    private final List<Integer> numbers = new ArrayList<>();
    NumbersDatabase() {
        numbers.add(10);
        numbers.add(4);
        numbers.add(7);
    }
    public List<Integer> search(NumberTester tester) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer integer : numbers) {
            if (tester.test(integer)) {
                filtered.add(integer);
            }
        }
        return filtered;
    }
}
