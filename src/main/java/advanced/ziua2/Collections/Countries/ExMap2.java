package main.java.advanced.ziua2.Collections.Countries;

import java.util.*;

//def un map, unde k este string, si o lista de numere. Adaugati in Map un numar distinctiv si afisati suma listelor.
public class ExMap2 {
    public static void main(String[] args) {
        Set<Integer> prime = new HashSet<>();
        prime.add(1);
        prime.add(3);
        prime.add(5);
        Set<Integer> pare = new HashSet<>();
        pare.add(2);
        pare.add(4);
        pare.add(6);
        Set<Integer> impare = new HashSet<>();
        impare.add(7);
        impare.add(9);
        Map<String, Set<Integer>> values = new HashMap<>();
        values.put("prime", prime);
        values.put("pare", pare);
        values.put("impare", impare);
        Set<Map.Entry<String, Set<Integer>>> entries = values.entrySet();
        for (Map.Entry<String, Set<Integer>> entry : entries) {
            int suma = 0;
            for (Integer number : entry.getValue()) {
                suma += number;
            }
            System.out.println("Suma pt. " + entry.getKey() +
                    " este " + suma);
        }
    }
}
