package main.java.advanced.ziua2.Collections.Countries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class exMAp {
    public static void main(String[] args) {
        Map<String, Integer> price = new HashMap<>();
        int valori= 0;
        price.put("stone", 1 );
        price.put("cover", 3);
        price.put("silk", 9);
        Set<Map.Entry<String, Integer>> entries = price.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            valori+=entry.getValue();
            System.out.println( entry.getKey() + "=>" + entry.getValue());
        }
        System.out.println(valori);

            }
}