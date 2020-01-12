package main.java.advanced.lambda.exlambda;

import java.util.List;

public class NumberApp {
    public static void main(String[] args) {
        NumbersDatabase database= new NumbersDatabase();
        List<Integer> pairNumbers=database.search((nr) -> {
            return nr %2==0;
        });
        System.out.println(pairNumbers);
    }
}
