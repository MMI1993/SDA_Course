package main.java.advanced.ziua2.Collections.Countries;

import java.util.HashMap;
import java.util.Map;

public class CapitalsDatabase {
    private final Map<String, String> capitals = new HashMap<>();
    public CapitalsDatabase() {
        capitals.put("Romania", "Bucharest");
        capitals.put("France", "Paris");
    }
    public String getCapital(String country) {
        String capital = capitals.get(country);
        if (capital == null) {
            return "No capital found";
        } else {
            return capital;
        }
    }
}
