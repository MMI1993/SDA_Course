package main.java.advanced.ziua2.inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FilesApp {
    public static void main(String[] args) {
        //Files.delete();
        Path path = Paths.get("C:\\Users\\User\\Desktop\\cuvinte.txt");
        boolean exists = Files.exists(path);
        if (exists) {
            System.out.println("Exista");
        } else {
            System.err.println("NU exista");
        }
    }
    public static void writeSingle() {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\cuvinte.txt");
        String toWrite = "Ana are mere";
        try {
            Files.write(path, toWrite.getBytes());
        } catch (IOException e) {
            System.err.println("Invalid path");
        }
    }
    public static void writeMultiple() {
        Path path = Paths.get("C:\\Users\\User\\Desktop\\cuvinte.txt");
        String toWrite = "Ana are mere";
        try {
            List<String> names = new ArrayList<>();
            names.add("Name1");
            names.add("Name2");
            Files.write(path, names);
        } catch (IOException e) {
            System.err.println("Invalid path");
        }
    }
}
