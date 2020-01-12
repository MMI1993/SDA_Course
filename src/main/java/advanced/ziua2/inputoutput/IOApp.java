package main.java.advanced.ziua2.inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOApp {

    public static void main(String[] args) throws IOException {
       //Faceti un fisier text numit cuvinte.txt.
        // Programul vostru trebuie sa afiseze cate cuvinte sunt pe o linie si cate cuvinte sunt in tot fisierul
        Path path = Paths.get("C:\\Users\\User\\Desktop\\cuvinte.txt");

        List<String> lines = Files.readAllLines(path);
            int total=0;
            for(int i=0; i<lines.size(); i++){
            String line = lines.get(i);
            String[] words = line.split( " ");
        System.out.println("Line " + i+ " has " + words.length + " word ");
        total += words.length;
        }
        System.out.println("File has " + total + " words");

    }

    private static void readFromFile() {
        Path path = Paths.get("C:\\Users\\User\\Downloads\\test.txt"); // folosesc Ctrl+ Alt+ V // Path este  o interfata
        try {
            List<String> lines = Files.readAllLines(path);// realAllLines arunca o exceptie de tip Check
            //for(String line: lines){
            // System.out.println(line);
            //}
            for (int i = 0; i < lines.size(); i++) {
                System.out.println("Line " + i + " has content " + lines.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

