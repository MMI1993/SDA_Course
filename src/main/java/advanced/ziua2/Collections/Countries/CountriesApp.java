package main.java.advanced.ziua2.Collections.Countries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountriesApp {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Romania", "Bucharest");
        countries.put("Franta", "PARIS");
        countries.put("Germania", "Berlin");
        Set<Map.Entry<String, String>> entries = countries.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}