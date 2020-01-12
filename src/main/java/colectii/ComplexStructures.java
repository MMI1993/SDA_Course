package main.java.colectii;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexStructures {
    public static String[] vehicles = {
            "ambunalce", "helicopter", "lifeboat"};
    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Richard", "Bob", "Fred"},
            {"Pete", "Mary", "Bob"}};

    public static void main(String[] args) {
        Map<String, Set<String>> personnel = new HashMap<>();
        for (int i = 0; i < vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];
            Set<String> driverSet = new LinkedHashSet<>();
            for (String driver : driversList) {
                driverSet.add(driver);
            }
            personnel.put(vehicle, driverSet);
        }
        System.out.println("personnel: " + personnel);

    /*
    parcurgere map-ului in totalitate
     */
    Set<String> driversList= personnel.get("helicopter");
    for (String driver: driversList) {
        System.out.println(driver);
    }
    for(String vehicle: personnel.keySet()){
        System.out.println(vehicle);
        System.out.println(": ");
        Set <String>  driversList1 = personnel.get(vehicle);
        for (String driver:driversList1){
            System.out.println(driver);
            System.out.println(" ");
        }
        System.out.println();
    }
    }
}