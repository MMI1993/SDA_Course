package main.java.advanced.ziua2;

import java.util.ArrayList;
import java.util.List;

public class CollectionsApp { //listele exind collections // map este de sine statatoare
    public static void main(String[] args) {
        List<String> items= new ArrayList<>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        System.out.println(items.get(5)); //arunca exxceptie
        for (String item : items); //aratam itemurile din lista
        System.out.println(items);
        //adaugae element la o anumita pozitie
        items.add(1, "random");
        //impartire liste pe subliste
        List<String> subItems= items.subList(0,2); // sublista este o lista noua
        //verificarea existentei in lista
        items.indexOf(3);
        items.contains(4);

    }
}
