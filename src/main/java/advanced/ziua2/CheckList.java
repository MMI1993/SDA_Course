package main.java.advanced.ziua2;

import java.util.ArrayList;
import java.util.List;
// Sa se genereze o lista si sa se afiseze numerele impare
public class CheckList {
    public static void checkNumber() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        for (Integer number : numbers) {
            if (number % 2 == 1) {
                System.out.println(number);
            }
        }
    }
}



  /*  List<Integer> items= new ArrayList<>();
    items.add(1);
    items.add("Item 2");
    items.add("Item 3");
    items.add("Item 4");
    for (Integer items: items){
*/
