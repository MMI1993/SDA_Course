package main.java.fizzBuzz;

public class fizzBuzz {

    public static String fizzBuzz(Integer i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = i.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        fizzBuzz(35);
        System.out.println(fizzBuzz(35));
    }
}
