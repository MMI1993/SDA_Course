package main.java.advanced.ziua2.inputoutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Directories {
    public static void main(String[] args) {
        Path basePath = Paths.get("C:\\Users\\User\\Downloads");
        List<String> tocreate= new ArrayList<>();
        tocreate.add("Folder 1");
        tocreate.add("Foder 2");
        for (String  folderName : tocreate){
            Path folderPath= basePath.resolve(folderName);
            try {
                Files.createDirectories(folderPath);
            } catch (IOException e) {
                System.err.println("Could not create directory");;
            }
        }

    }
    public static void createHierarchicalDirectories(){
        Path path = Paths.get("C:\\Users\\User\\Downloads\\examples");
        boolean existis= Files.isDirectory(path);
        if(!existis){
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                System.out.println("Could not creste directory");
            }
        }
        System.out.println(existis);
    }
}
