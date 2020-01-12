package main.java.advanced.ziua2.Collections.Countries;

import java.util.*;

public class MultiApp {
    public static void main(String[] args) {
        Map<String, List<String>> multi= new HashMap<>();
        List<String> citiesFromRomania=new ArrayList<>();
        citiesFromRomania.add("Timisoara");
        citiesFromRomania.add("Cluj");
        citiesFromRomania.add("Brasov");
        multi.put("Romania", citiesFromRomania);
        Set<Map.Entry<String, List<String>>> entries = multi.entrySet();
        for (Map.Entry<String, List<String>> entry: entries) {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
    }
}
